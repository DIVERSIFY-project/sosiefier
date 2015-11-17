package fr.inria.diversify.buildSystem.maven;


import fr.inria.diversify.buildSystem.DependencyResolver;
import fr.inria.diversify.buildSystem.android.AndroidSdk;
import fr.inria.diversify.buildSystem.android.InvalidSdkException;
import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.util.Log;
import org.apache.maven.model.Dependency;
import org.apache.maven.model.Model;
import org.apache.maven.model.Repository;
import org.apache.maven.model.io.xpp3.MavenXpp3Reader;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.project.MavenProject;

import org.codehaus.plexus.util.xml.pull.XmlPullParserException;
import org.kevoree.resolver.MavenResolver;


import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.*;

/**
 * User: Simon
 * Date: 6/12/13
 * Time: 3:47 PM
 */
public class MavenDependencyResolver implements DependencyResolver {
    protected List<URL> dependenciesURL;
    protected List<URL> directDependenciesURL;
    protected Properties properties;
    protected String baseDir;
    protected MavenResolver resolver;
    protected List<String> repositoriesUrls;
    protected List<String> alreadyResolve;
    private static MavenDependencyResolver singleton;



    public static MavenDependencyResolver dependencyResolver() {
        if(singleton == null) {
            singleton = new MavenDependencyResolver();
        }
        return singleton;
    }

    private MavenDependencyResolver() {
        dependenciesURL = new ArrayList<>();
        directDependenciesURL = new ArrayList<>();
        resolver = new MavenResolver();
        resolver.setBasePath(System.getProperty("user.home") + File.separator + ".m2/repository");

        repositoriesUrls = new ArrayList<>();
        repositoriesUrls.add("http://repo1.maven.org/maven2/");

        alreadyResolve = new ArrayList<>();
    }

    public void resolveDependencies(InputProgram inputProgram) throws Exception {
        String pom = inputProgram.getProgramDir() + "/pom.xml";
        if(!alreadyResolve.contains(pom)) {
            alreadyResolve.add(pom);
            File pomFile = new File(pom);
            Log.info("resolve dependencies of {}", pomFile);
            baseDir = inputProgram.getProgramDir();

            MavenProject project = loadProject(pomFile);
            resolveAllDependencies(project, new HashSet<String>(), true);

            addApplicationClasses(inputProgram);
            loadDependencies();
        }
    }

    protected MavenProject loadProject(File pomFile) throws IOException, XmlPullParserException {
        MavenProject ret;
        MavenXpp3Reader mavenReader = new MavenXpp3Reader();

        //Removed null and file exists protections that mask errors
        FileReader reader = null;
        reader = new FileReader(pomFile);
        Model model = mavenReader.read(reader);
        model.setPomFile(pomFile);
        ret = new MavenProject(model);
        reader.close();

        return ret;
    }

    public void addApplicationClasses(InputProgram inputProgram) throws MalformedURLException {
        dependenciesURL.add((new File(inputProgram.getProgramDir() + "/" + inputProgram.getClassesDir()).toURL()));
        dependenciesURL.add((new File(inputProgram.getProgramDir() + "/" + inputProgram.getTestClassesDir()).toURL()));
        loadDependencies();
    }


    protected void updateRepositoriesUrl(MavenProject project) {
        for (Repository repo : project.getRepositories()) {
            repositoriesUrls.add(repo.getUrl());
        }
    }

    public void resolveAllDependencies(MavenProject project, Set<String> dependencyResolve, boolean isDirectDependencies) throws MalformedURLException {
        updateRepositoriesUrl(project);
        updateProperties(project.getProperties());

        for (Dependency dependency : project.getDependencies()) {
            try {
                String artifactId = "mvn:" + resolveName(dependency.getGroupId(), properties) +
                        ":" + resolveName(dependency.getArtifactId(), properties) +
                        ":" + resolveName(dependency.getVersion(), properties);

                File cachedFile;
                if(dependency.getScope() != null && dependency.getScope().equals("system")) {
                    cachedFile = new File(resolveName(dependency.getSystemPath(), properties));
                } else {
                    cachedFile = resolver.resolve(artifactId + ":" + resolveName(dependency.getType(), properties), repositoriesUrls);
                }
                dependenciesURL.add(cachedFile.toURI().toURL());
                Log.debug("resolve artifact: {}", artifactId);
                if(isDirectDependencies) {
                    directDependenciesURL.add(cachedFile.toURI().toURL());
                }

                File pomD = resolver.resolve(artifactId + ":pom", repositoriesUrls);
                if(!dependencyResolve.contains(pomD.getAbsolutePath())) {
                    dependencyResolve.add(pomD.getAbsolutePath());
                    resolveAllDependencies(loadProject(pomD), dependencyResolve, false);
                }

            } catch (Exception e) {}

        }

        resolveModulesDependencies(project, dependencyResolve);
    }


    protected void resolveModulesDependencies(MavenProject parentProject, Set<String> dependencyResolve) {
        for(String module: parentProject.getModules()) {
            try {
                MavenProject project = loadProject(new File(baseDir + "/" + module + "/pom.xml"));
                resolveAllDependencies(project, dependencyResolve, true);
            } catch (Exception e) {}
        }
    }

    protected void loadDependencies() {
        URLClassLoader child = new URLClassLoader(dependenciesURL.toArray(new URL[dependenciesURL.size()]), Thread.currentThread().getContextClassLoader());
        Thread.currentThread().setContextClassLoader(child);
    }

    public void resolveAndroidDependencies(String chosenSdkPlatform) throws InvalidSdkException, MojoExecutionException, MalformedURLException {
        File chosenSdkPath = new File( getAndroidHomeOrThrow() );

        AndroidSdk androidSdk = new AndroidSdk( chosenSdkPath, chosenSdkPlatform );
        dependenciesURL.add(androidSdk.getAndroidJar().toURI().toURL());
        dependenciesURL.add(new File(androidSdk.getDxJarPath()).toURI().toURL());

        loadDependencies();
    }

    protected void updateProperties(Properties properties) {
        if(this.properties == null) {
            this.properties = new Properties(properties);
            properties.setProperty("basedir", baseDir);
        } else {
            for (Object key : properties.keySet()) {
                this.properties.put(key, properties.get(key));
            }
        }
    }


    protected String resolveName(String string, Properties properties) {
        char[] chars = string.toCharArray();
        int replaceBegin = -1;
        String id = "";
        for (int i = 0; i < chars.length; i++) {
            if (replaceBegin != -1 && chars[i] != '{' && chars[i] != '}') {
                id += chars[i];
            }
            if (replaceBegin != -1 && chars[i] == '}') {
                string = string.substring(0, replaceBegin) + properties.getProperty(id) + string.substring(i + 1, string.length());
                replaceBegin = -1;
                id = "";
            }
            if (chars[i] == '$' && i + 1 < chars.length && chars[i + 1] == '{') {
                replaceBegin = i;
            }
        }
        return string;
    }

    protected String getAndroidHomeOrThrow()
    {
        final String androidHome = System.getenv( AndroidSdk.ENV_ANDROID_HOME );
        return androidHome;
    }

    @Override
    public List<URL> getDependencies() {
        return dependenciesURL;
    }

    public List<URL> getDirectDependenciesURL() {
        return directDependenciesURL;
    }
}
