package fr.inria.diversify.buildSystem.maven;


import fr.inria.diversify.buildSystem.android.AndroidSdk;
import fr.inria.diversify.buildSystem.android.InvalidSdkException;
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
public class MavenDependencyResolver {
    Set<URL> jarURL = new HashSet<>();
    String baseDir;


    public void DependencyResolver(String pomFile) throws Exception {
        String[] split = pomFile.split("/");
        baseDir = "";
        for(int i = 0;  i <  split.length - 1; i++) {
            baseDir += split[i] + "/";
        }
        MavenProject project = loadProject(new File(pomFile));
        resolveAllDependencies(project);
    }

    public MavenProject loadProject(File pomFile) throws IOException, XmlPullParserException {
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

    public void resolveAllDependencies(MavenProject project) throws MalformedURLException {
        MavenResolver resolver = new MavenResolver();
        resolver.setBasePath(System.getProperty("user.home") + File.separator + ".m2/repository");

        List<String> urls = new ArrayList<>(project.getDependencies().size());
        for (Repository repo : project.getRepositories()) {
            urls.add(repo.getUrl());
        }
        urls.add("http://repo1.maven.org/maven2/");


        Properties properties = project.getProperties();
        for (Dependency dependency : project.getDependencies()) {
            try {
                String artifactId = "mvn:" + resolveName(dependency.getGroupId(), properties) +
                        ":" + resolveName(dependency.getArtifactId(), properties) +
                        ":" + resolveName(dependency.getVersion(), properties);// +
                      //  ":" + resolveName(dependency.getType(), properties);

                File cachedFile = resolver.resolve(artifactId + ":" + resolveName(dependency.getType(), properties), urls);
                jarURL.add(cachedFile.toURI().toURL());
                Log.debug("resolve artifact: {}", artifactId);


                File pomD = resolver.resolve(artifactId + ":pom", urls);
                resolveAllDependencies(loadProject(pomD));

            } catch (Exception e) {}


        }
        for(String module: project.getModules()) {
            try {
                resolveModuleDependencies(module);
            } catch (IOException e) {
                e.printStackTrace();
            } catch (XmlPullParserException e) {
                e.printStackTrace();
            }
        }

        URLClassLoader child = new URLClassLoader(jarURL.toArray(new URL[jarURL.size()]), Thread.currentThread().getContextClassLoader());
        Thread.currentThread().setContextClassLoader(child);
    }

    protected void resolveModuleDependencies(String moduleName) throws IOException, XmlPullParserException {
        MavenProject project = loadProject(new File(baseDir + "/" + moduleName + "/pom.xml"));
        resolveAllDependencies(project);
    }

    public void resolveAndroidDependencies(String chosenSdkPlatform) throws InvalidSdkException, MojoExecutionException, MalformedURLException {
        File chosenSdkPath = new File( getAndroidHomeOrThrow() );

        AndroidSdk androidSdk = new AndroidSdk( chosenSdkPath, chosenSdkPlatform );
        jarURL.add(androidSdk.getAndroidJar().toURI().toURL());
        jarURL.add(new File(androidSdk.getDxJarPath()).toURI().toURL());

        URLClassLoader child = new URLClassLoader(jarURL.toArray(new URL[jarURL.size()]), Thread.currentThread().getContextClassLoader());
        Thread.currentThread().setContextClassLoader(child);
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

}
