package fr.inria.diversify.persistence.json.output;

import fr.inria.diversify.persistence.Header;
import fr.inria.diversify.persistence.MavenHeader;
import org.apache.maven.model.Model;
import org.apache.maven.model.io.xpp3.MavenXpp3Reader;
import org.apache.maven.project.MavenProject;
import org.codehaus.plexus.util.xml.pull.XmlPullParserException;
import org.json.JSONObject;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * Created by marodrig on 14/01/2015.
 */
public class JsonHeaderOutput extends JsonSectionOutput {

    private static final String POM_XML = "pom.xml";

    /**
     * Path where the source project lives
     */
    private String srcProjectPath;

    /**
     * Path where the POM of the generator lives
     */
    private String generatorPOMPath;

    public JsonHeaderOutput(String srcPOM, String generatorPOM) {
        srcProjectPath = srcPOM;
        generatorPOMPath = generatorPOM;
    }

    private MavenProject getPOMModel(Reader reader) throws IOException, XmlPullParserException {
        MavenXpp3Reader mavenReader = new MavenXpp3Reader();
        Model model = mavenReader.read(reader);
        return new MavenProject(model);
    }

    @Override
    public void write(JSONObject jsonObject) {
        //Removed null and file exists protections that mask errors
        try {

            JSONObject h = new JSONObject();
            jsonObject.put(Header.HEADER, h);
            if ( getTransformations() == null ) h.put(Header.TRANSF_COUNT, 0);
            else h.put(Header.TRANSF_COUNT, getTransformations().size());
            if ( srcProjectPath.toLowerCase().endsWith(POM_XML) ) {
                //Removed null and file exists protections that mask errors
                Reader r = getReader(srcProjectPath);
                try {
                    MavenProject ret = getPOMModel(r);
                    h.put(Header.PROJECT_TYPE, MavenHeader.MAVEN_TYPE);
                    h.put(MavenHeader.GROUP_ID, ret.getGroupId());
                    h.put(MavenHeader.ARTIFACT_ID, ret.getArtifactId());
                    h.put(MavenHeader.VERSION, ret.getVersion());
                } finally {
                    r.close();
                }
            }
            if ( generatorPOMPath.toLowerCase().endsWith(POM_XML) ) {
                //Removed null and file exists protections that mask errors
                Reader r = getReader(generatorPOMPath);
                try {
                    MavenProject ret = getPOMModel(r);
                    h.put(MavenHeader.GENERATOR_VERSION, ret.getVersion());
                } finally {
                    r.close();
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    protected Reader getReader(String path) {
        try {
            return new FileReader(path);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Path where the project lives
     */
    public String getSrcProjectPath() {
        return srcProjectPath;
    }

    /**
     * Path where the project lives
     */
    public void setSrcProjectPath(String srcProjectPath) {
        this.srcProjectPath = srcProjectPath;
    }

    public void setGeneratorPOMPath(String generatorPOMPath) {
        this.generatorPOMPath = generatorPOMPath;
    }
}
