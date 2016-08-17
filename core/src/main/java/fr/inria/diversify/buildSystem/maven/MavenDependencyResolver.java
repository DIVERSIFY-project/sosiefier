package fr.inria.diversify.buildSystem.maven;


import fr.inria.diversify.buildSystem.DependencyResolver;
import fr.inria.diversify.buildSystem.android.AndroidSdk;
import fr.inria.diversify.buildSystem.android.InvalidSdkException;
import fr.inria.diversify.runner.InputProgram;
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
    protected Map<String, String> dependenciesManager;
    protected List<URL> dependenciesURL;
    protected List<URL> directDependenciesURL;
    protected boolean onlyDirectDependencies = false;
    protected String baseDir;
    protected MavenResolver resolver;
    protected Set<String> repositoriesUrls;
    protected Map<String, URL> artifactResolve;

    private static MavenDependencyResolver singleton;
    protected static String localRepository;


    public static MavenDependencyResolver dependencyResolver(String localRepository) {
        if(localRepository != null) {
            MavenDependencyResolver.localRepository = System.getProperty("user.dir") + File.separator + localRepository;
        } else {
            MavenDependencyResolver.localRepository = System.getProperty("user.home") + File.separator + ".m2/repository";
        }

        if(singleton == null) {
            singleton = new MavenDependencyResolver();
        }
        return singleton;
    }

    public static MavenDependencyResolver dependencyResolver() {
        if(localRepository == null) {
            MavenDependencyResolver.localRepository = System.getProperty("user.home") + File.separator + ".m2/repository";
        }

        if(singleton == null) {
            singleton = new MavenDependencyResolver();
        }
        return singleton;
    }

    private MavenDependencyResolver() {
        dependenciesURL = new ArrayList<>();
        directDependenciesURL = new ArrayList<>();
        dependenciesManager = new HashMap<>();
        artifactResolve = new HashMap<>();
        resolver = new MavenResolver();
        resolver.setBasePath(localRepository);

        repositoriesUrls = new HashSet<>();
        repositoriesUrls.add("http://repo1.maven.org/maven2/");

    }

    public void resolveDependencies(InputProgram inputProgram) throws Exception {
        String pom = inputProgram.getProgramDir() + "/pom.xml";

        File pomFile = new File(pom);
        Log.info("resolveURL dependencies of {}", pomFile);
        baseDir = inputProgram.getProgramDir();

        MavenProject project = loadProject(pomFile);

        directDependenciesURL = new ArrayList<>(findDirectDependencies(project));

        if(!onlyDirectDependencies) {
            dependenciesURL.addAll(directDependenciesURL);
            dependenciesURL.addAll(findDeepDependencies(project, new Properties()));
        }
        loadDependencies();
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
        if(model.getParent() != null) {
            MavenProject parent = new MavenProject();
            parent.setGroupId(model.getParent().getGroupId());
            parent.setArtifactId(model.getParent().getArtifactId());
            parent.setVersion(model.getParent().getVersion());
            ret.setParent(parent);
        }

        reader.close();

        return ret;
    }

    public void addApplicationClasses(InputProgram inputProgram) throws MalformedURLException {
        dependenciesURL.add((new File(inputProgram.getProgramDir() + "/" + inputProgram.getClassesDir()).toURL()));
        dependenciesURL.add((new File(inputProgram.getProgramDir() + "/" + inputProgram.getTestClassesDir()).toURL()));
        directDependenciesURL.add(new File(inputProgram.getProgramDir() + "/" + inputProgram.getClassesDir()).toURL());
        directDependenciesURL.add((new File(inputProgram.getProgramDir() + "/" + inputProgram.getTestClassesDir()).toURL()));loadDependencies();
    }


    protected void updateRepositoriesUrl(MavenProject project) {
        for (Repository repo : project.getRepositories()) {
            repositoriesUrls.add(repo.getUrl());
        }
    }

    protected Set<URL> findDeepDependencies(MavenProject project, Properties properties) throws IOException, XmlPullParserException {
        Set<String> done = new HashSet<>();
        Set<URL> dependencies = new HashSet<>();
        List<Dependency> file = new LinkedList<>();
        updateRepositoriesUrl(project);
        updateProperties(project, properties);

        file.addAll(project.getDependencies());
        for(String module: project.getModules()) {
            try {
                MavenProject moduleProject = loadProject(new File(baseDir + "/" + module + "/pom.xml"));
                updateRepositoriesUrl(moduleProject);
                updateProperties(moduleProject, properties);
                file.addAll(moduleProject.getDependencies());
            } catch (Exception e) {}
        }
        int count = 0;
        while(!file.isEmpty()) {
            Dependency dependency = file.remove(0);
            try {
                String artifactId = resolveName(dependency.getGroupId(), properties)
                        + ":" + resolveName(dependency.getArtifactId(), properties);
                String version;
                if(dependenciesManager.containsKey(artifactId)) {
                    version = dependenciesManager.get(artifactId);
                } else {
                    version = resolveName(dependency.getVersion(), properties);
                }
               count++;
                if(!artifactId.contains(":null") && !artifactId.contains("null:") && !artifactId.contains("${")
                        && version != null && !version.equals("null")
                        && !done.contains(artifactId)) {
                    dependencies.add(resolveURL(dependency, properties));
                    done.add(artifactId);

                    MavenProject dependencyProject = resolveProject(artifactId + ":"+ version);
                    file.addAll(dependencyProject.getDependencies());

                    updateRepositoriesUrl(dependencyProject);
                    updateProperties(dependencyProject, properties);

                    Log.debug("{}:{} {} {}",artifactId, version, dependencies.size(), file.size());
                }
            } catch (Exception e) {
//                e.printStackTrace();
//                Log.debug("error: {}:{}:{} {}",dependency.getGroupId(), dependency.getArtifactId(), dependency.getVersion(), count);
            }
        }

        return dependencies;
    }

    protected Set<URL> findDirectDependencies(MavenProject project) throws Exception {
        return findDirectDependencies(project, new Properties());
    }

    protected Set<URL> findDirectDependencies(MavenProject project, Properties properties) throws Exception {
        Set<URL> dependencies = new HashSet<>();

        if(project.hasParent()) {
            MavenProject parent = project.getParent();
            String artifactId =  parent.getGroupId() + ":" + parent.getArtifactId() + ":" + parent.getVersion();
            parent = resolveProject(artifactId);
            dependencies.addAll(findDirectDependencies(parent, properties));
        }
        updateRepositoriesUrl(project);
        properties.putAll(project.getProperties());

        if(project.getDependencyManagement() != null) {
            project.getDependencyManagement().getDependencies().stream()
                    .forEach(dependency -> {
                        try {
                            String artifactId = resolveName(dependency.getGroupId(), properties) +
                                    ":" + resolveName(dependency.getArtifactId(), properties);
                            String version = resolveName(dependency.getVersion(), properties);
                            if (!dependenciesManager.containsKey(artifactId)) {
                                dependenciesManager.put(artifactId, version);
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                            Log.debug("");
                        }
                    });
        }
        project.getDependencies().stream()
                .forEach(dependency ->  {
                    try {
                        URL url = resolveURL(dependency, properties);
                        dependencies.add(url);
                    } catch (Exception e) {
                        e.printStackTrace();
                        Log.debug("");
                    }
                });

        return dependencies;
    }

    protected URL resolveURL(Dependency dependency, Properties properties) throws MalformedURLException {
        String artifactId = resolveName(dependency.getGroupId(), properties) +
                ":" + resolveName(dependency.getArtifactId(), properties);

        String version;
        if(dependenciesManager.containsKey(artifactId)) {
            version = dependenciesManager.get(artifactId);
        } else {
            version = resolveName(dependency.getVersion(), properties);
        }

        if(!artifactResolve.containsKey(artifactId) || version.equals("null")) {
            File cachedFile;
            if (dependency.getScope() != null && dependency.getScope().equals("system")) {
                cachedFile = new File(resolveName(dependency.getSystemPath(), properties));
            } else {
                cachedFile = resolver.resolve("mvn:" + artifactId + ":" + version + ":" + resolveName(dependency.getType(), properties), repositoriesUrls);
            }
            URL url = cachedFile.toURI().toURL();
            artifactResolve.put(artifactId, url);

            Log.debug("resolve URL: {}", artifactId);
            return url;
        } else {
            return artifactResolve.get(artifactId);
        }
    }

    protected MavenProject resolveProject(String artifactId) throws IOException, XmlPullParserException {
        File pomD = resolver.resolve("mvn:" + artifactId + ":pom", repositoriesUrls);
        return loadProject(pomD);
    }

    protected void loadDependencies() {
        URLClassLoader child = new URLClassLoader(dependenciesURL.toArray(new URL[dependenciesURL.size()]), Thread.currentThread().getContextClassLoader());
        Thread.currentThread().setContextClassLoader(child);
    }

    public void resolveAndroidDependencies(String chosenSdkPlatform) throws InvalidSdkException, MojoExecutionException, MalformedURLException {
        File chosenSdkPath = new File( getAndroidHomeOrThrow() );

        AndroidSdk androidSdk = new AndroidSdk(chosenSdkPath, chosenSdkPlatform);
        dependenciesURL.add(androidSdk.getAndroidJar().toURI().toURL());
        dependenciesURL.add(new File(androidSdk.getDxJarPath()).toURI().toURL());

        loadDependencies();
    }

    protected void updateProperties(MavenProject project, Properties properties) throws IOException, XmlPullParserException {
        if(project.hasParent()) {
            MavenProject parent = project.getParent();
            parent = resolveProject(parent.getGroupId() + ":" + parent.getArtifactId() + ":" + parent.getVersion());
            updateProperties(parent, properties);
        }
        properties.putAll(project.getProperties());
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

    protected String getAndroidHomeOrThrow() {
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

    public void setOnlyDirectDependencies(boolean onlyDirectDependencies) {
        this.onlyDirectDependencies = onlyDirectDependencies;
    }
}
