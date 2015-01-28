package fr.inria.diversify.persistence.json.input;

import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.persistence.Header;
import fr.inria.diversify.persistence.MavenHeader;
import fr.inria.diversify.transformation.SingleTransformation;
import org.apache.maven.model.Model;
import org.apache.maven.model.io.xpp3.MavenXpp3Reader;
import org.apache.maven.project.MavenProject;
import org.json.JSONObject;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.HashMap;

/**
 * Created by marodrig on 23/01/2015.
 */
public class JsonHeaderInput extends JsonSectionInput {

    public static final String GROUP_ID_DONT_MATCH = "This project group ID don't match with the one of the sosies!";
    public static final String ARTIFACT_DONT_MATCH = "This project artifact ID don't match with the one of the sosies!";
    public static final String VERSION_DONT_MATCH = "This project version don't match with the one of the sosies!";
    /**
     * Path where the project lives
     */
    private String projectPath;

    /**
     * Resulting header of the input operation
     */
    private Header header;

    public JsonHeaderInput(InputProgram inputProgram, JSONObject jsonObject) {
        super(inputProgram, jsonObject);
        projectPath = inputProgram.getProgramDir();
    }

    @Override
    public void read(HashMap<Integer, SingleTransformation> transformations) {
        try {
            header = null;

            JSONObject h = getJsonObject().getJSONObject(Header.HEADER);

            String pt = h.getString(Header.PROJECT_TYPE);

            if (pt.equals(MavenHeader.MAVEN_TYPE)) {
                header = new MavenHeader();
                header.setGroupId(h.getString(MavenHeader.GROUP_ID));
                header.setArtifactId(h.getString(MavenHeader.ARTIFACT_ID));
                header.setVersion(h.getString(MavenHeader.VERSION));

                //Verify
                Reader reader = getReader(projectPath + "/pom.xml");
                MavenProject ret;
                MavenXpp3Reader mavenReader = new MavenXpp3Reader();
                Model model = mavenReader.read(reader);
                ret = new MavenProject(model);

                if ( !header.getGroupId().equals(ret.getGroupId()) )
                    getErrors().add(GROUP_ID_DONT_MATCH);
                if ( !header.getArtifactId().equals(ret.getArtifactId()) )
                    getErrors().add(ARTIFACT_DONT_MATCH);
                if ( !header.getVersion().equals(ret.getVersion()) )
                    getErrors().add(VERSION_DONT_MATCH);
                reader.close();
            }
            if ( header != null )
                header.setTransformationCount(h.getInt(Header.TRANSF_COUNT));

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    protected Reader getReader(String s) {
        try {
            return new FileReader(s);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public String getProjectPath() {
        return projectPath;
    }

    public void setProjectPath(String projectPath) {
        this.projectPath = projectPath;
    }

    public Header getHeader() {
        return header;
    }
}
