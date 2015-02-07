package fr.inria.diversify.persistence.json.input;

import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.persistence.Header;
import fr.inria.diversify.persistence.MavenHeader;
import fr.inria.diversify.transformation.Transformation;
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
    public static final String GENERATOR_VERSION_DONT_MATCH = "The generator used to create this file is unknown!";

    /**
     * Resulting header of the input operation
     */
    private Header header;

    public JsonHeaderInput(InputProgram inputProgram, JSONObject jsonObject) {
        super(inputProgram, jsonObject);
    }

    @Override
    public void read(HashMap<Integer, Transformation> transformations) {

        //Indicate that an exception must be raised because of mismatch in the src
        boolean raise = false;

        try {
            String projectPath = getInputProgram().getProgramDir();

            header = null;

            JSONObject h = getJsonObject().getJSONObject(Header.HEADER);

            String pt = h.getString(Header.PROJECT_TYPE);

            if (pt.equals(MavenHeader.MAVEN_TYPE)) {
                header = new MavenHeader();
                header.setGroupId(h.getString(MavenHeader.GROUP_ID));
                header.setArtifactId(h.getString(MavenHeader.ARTIFACT_ID));
                header.setVersion(h.getString(MavenHeader.VERSION));
                header.setGeneratorVersion(h.getString(MavenHeader.GENERATOR_VERSION));

                //Verify
                Reader reader = getReader(projectPath + "/pom.xml");
                MavenProject ret;
                MavenXpp3Reader mavenReader = new MavenXpp3Reader();
                Model model = mavenReader.read(reader);
                ret = new MavenProject(model);

                if (!header.getGroupId().equals(ret.getGroupId())) {
                    throwError(GROUP_ID_DONT_MATCH, null, false);
                    raise = true;
                }
                if (!header.getArtifactId().equals(ret.getArtifactId())) {
                    throwError(ARTIFACT_DONT_MATCH, null, false);
                    raise = true;
                }
                if (!header.getVersion().equals(ret.getVersion())) {
                    throwError(VERSION_DONT_MATCH, null, false);
                    raise = true;
                }
                reader.close();
            }
            if (header != null)
                header.setTransformationCount(h.getInt(Header.TRANSF_COUNT));

        } catch (Exception e) {
            throwError("Unexpected exception while reading header", e, true);
        }

        if (raise) throwError("This does not seems to be the project for which sosies were generated", null, true);
    }

    protected Reader getReader(String s) {
        try {
            return new FileReader(s);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public Header getHeader() {
        return header;
    }
}
