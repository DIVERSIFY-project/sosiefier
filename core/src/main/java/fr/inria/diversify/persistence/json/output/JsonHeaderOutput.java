package fr.inria.diversify.persistence.json.output;

import org.apache.maven.model.Model;
import org.apache.maven.model.io.xpp3.MavenXpp3Reader;
import org.apache.maven.project.MavenProject;
import org.codehaus.plexus.util.xml.pull.XmlPullParserException;
import org.json.JSONObject;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Collection;

/**
 * Created by marodrig on 14/01/2015.
 */
public class JsonHeaderOutput extends JsonSectionOutput {

    /**
     * Path where the project lives
     */
    private String projectPath;

    @Override
    public void write(JSONObject jsonObject) {
        //Removed null and file exists protections that mask errors
        try {
            Reader reader = getReader();
            JSONObject h = new JSONObject();
            jsonObject.put("header", h);
            if ( getTransformations() == null ) h.put("transformationCount", 0);
            else h.put("transformationCount", getTransformations().size());
            if ( projectPath.endsWith("pom.xml") ) {
                MavenProject ret;
                MavenXpp3Reader mavenReader = new MavenXpp3Reader();
                //Removed null and file exists protections that mask errors
                Model model = mavenReader.read(reader);
                ret = new MavenProject(model);
                h.put("projectType", "maven");
                h.put("groupId", ret.getGroupId());
                h.put("artifactId", ret.getArtifactId());
                h.put("version", ret.getVersion());
            }
            reader.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    protected Reader getReader() {
        try {
            return new FileReader(projectPath);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Path where the project lives
     */
    public String getProjectPath() {
        return projectPath;
    }

    /**
     * Path where the project lives
     */
    public void setProjectPath(String projectPath) {
        this.projectPath = projectPath;
    }
}
