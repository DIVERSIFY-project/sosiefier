package fr.inria.diversify.ut.json.output;

import fr.inria.diversify.diversification.InputConfiguration;
import fr.inria.diversify.persistence.Header;
import fr.inria.diversify.persistence.MavenHeader;
import fr.inria.diversify.persistence.json.output.JsonHeaderOutput;
import fr.inria.diversify.transformation.ast.ASTDelete;
import fr.inria.diversify.transformation.ast.ASTReplace;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;

import static fr.inria.diversify.ut.json.SectionTestUtils.list;
import static org.junit.Assert.assertEquals;

/**
 * Created by marodrig on 23/01/2015.
 */
public class JsonHeaderOutputTest {

    public static final String SRC_POM = "/uzr/pr0j3ct/pom.xml";
    //public static final String GEN_VER = "1.0-SNAPSHOT";

    public static class JsonHeaderOutputForUT extends JsonHeaderOutput {
        public JsonHeaderOutputForUT(String srcPOM, String generatorPOM) {
            super(srcPOM, generatorPOM);
        }

        @Override
        protected Reader getReader(String path) {
            return new InputStreamReader(new ByteArrayInputStream(generatePOM(path).getBytes(StandardCharsets.UTF_8)));
        }
    }

    public static String generatePOM(String path) {

        StringBuilder sb = new StringBuilder();
        sb.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?> \n");
        sb.append("<project xmlns=\"http://maven.apache.org/POM/4.0.0\" \n");
        sb.append("xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" \n");
        sb.append("xsi:schemaLocation=\"http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd\"> \n");
        sb.append("<parent> \n");
        sb.append("<artifactId>Sosies-generator</artifactId> \n");
        sb.append("<groupId>fr.irisa.diversify</groupId> \n");
        sb.append("<version>1.2.1</version> \n");
        sb.append("</parent> \n");
        sb.append("<modelVersion>4.0.0</modelVersion> \n");
        sb.append("<artifactId>generator</artifactId> \n");
        sb.append("</project> ");
        return sb.toString();
    }

    @Test
    public void testWrite() throws JSONException {
        JSONObject o = new JSONObject();
        JsonHeaderOutputForUT h = new JsonHeaderOutputForUT(SRC_POM, InputConfiguration.LATEST_GENERATOR_VERSION);
        h.setTransformations(list(new ASTDelete(), new ASTReplace()));
        h.write(o);
        o = o.getJSONObject(Header.HEADER);
        assertEquals(o.getInt(Header.TRANSF_COUNT), 2);
        assertEquals(o.getString(Header.PROJECT_TYPE), MavenHeader.MAVEN_TYPE);
        assertEquals(o.getString(MavenHeader.GROUP_ID), "fr.irisa.diversify");
        assertEquals(o.getString(MavenHeader.ARTIFACT_ID),"generator");
        assertEquals(o.getString(MavenHeader.VERSION), "1.2.1");
        assertEquals(o.getString(MavenHeader.GENERATOR_VERSION), InputConfiguration.LATEST_GENERATOR_VERSION);
    }

}
