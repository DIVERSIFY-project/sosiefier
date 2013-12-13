package fr.inria.diversify.util.maven;


import fr.inria.diversify.util.Log;
import org.apache.maven.model.Dependency;
import org.apache.maven.model.Model;
import org.apache.maven.model.Repository;
import org.apache.maven.model.io.xpp3.MavenXpp3Reader;
import org.apache.maven.project.MavenProject;

import org.codehaus.plexus.util.xml.pull.XmlPullParserException;
import org.kevoree.resolver.MavenResolver;


import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * User: Simon
 * Date: 6/12/13
 * Time: 3:47 PM
 */
public class MavenDependencyResolver {

    public void DependencyResolver(String pomFile) throws Exception {
        MavenProject project = loadProject(new File(pomFile));
        resolveAllDependencies(project);
    }

    public MavenProject loadProject(File pomFile) throws IOException, XmlPullParserException
    {
        MavenProject ret = null;
        MavenXpp3Reader mavenReader = new MavenXpp3Reader();

        if (pomFile != null && pomFile.exists())
        {
            FileReader reader = null;

            try
            {
                reader = new FileReader(pomFile);
                Model model = mavenReader.read(reader);
                model.setPomFile(pomFile);

                ret = new MavenProject(model);
            }
            finally
            {
                reader.close();
            }
        }

        return ret;
    }

    public void resolveAllDependencies(MavenProject project) throws MalformedURLException {
        MavenResolver resolver = new MavenResolver();
        resolver.setBasePath("~/.m2/repository");

        List<String> urls = new ArrayList<String>(project.getDependencies().size());
        for(Repository repo: project.getRepositories()) {
            urls.add(repo.getUrl());
        }
        urls.add("http://repo1.maven.org/maven2/");

        List<URL> jarURL = new ArrayList<URL>();
        Properties properties = project.getProperties();
        for(Dependency dependency: project.getDependencies()) {
            String artifactId = "mvn:"+ resolveName(dependency.getGroupId(),properties) +
                    ":" + resolveName(dependency.getArtifactId(),properties) +
                    ":" + resolveName(dependency.getVersion(),properties) +
                    ":" + resolveName(dependency.getType(),properties);
            Log.debug("revolve artifact: {}",artifactId);
            File cachedFile = resolver.resolve(artifactId, urls);
            jarURL.add(cachedFile.toURI().toURL());
        }

        URLClassLoader child = new URLClassLoader(jarURL.toArray(new URL[jarURL.size()]), Thread.currentThread().getContextClassLoader());
        Thread.currentThread().setContextClassLoader(child);
    }

    protected String resolveName(String string, Properties properties) {
        char[] chars = string.toCharArray();
        int replaceBegin = -1;
        String id = "";
        for(int i = 0; i <  chars.length; i++) {
            if(replaceBegin != -1 && chars[i] != '{' && chars[i] != '}') {
                id += chars[i];
            }
            if(replaceBegin != -1 && chars[i] == '}') {
                string =  string.substring(0,replaceBegin) + properties.getProperty(id) + string.substring(i+1,string.length());
                replaceBegin = -1;
                id = "";
            }
            if(chars[i] == '$' && i + 1 < chars.length && chars[i+1] == '{') {
                replaceBegin = i;
            }
        }
       return string;
    }
}
