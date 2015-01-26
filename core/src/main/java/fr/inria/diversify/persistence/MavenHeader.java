package fr.inria.diversify.persistence;

/**
 * Created by marodrig on 23/01/2015.
 */
public class MavenHeader extends Header {

    public static final String MAVEN_TYPE = "maven";

    public static final String GROUP_ID = "groupId";

    public static final String ARTIFACT_ID = "artifactId";

    public static final String VERSION = "version";

    private String groupId;

    private String artifactId;

    private String version;

    /**
     * Id of the artifact's group
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    /**
     * Artifact's id
     */
    public String getArtifactId() {
        return artifactId;
    }

    public void setArtifactId(String artifactId) {
        this.artifactId = artifactId;
    }

    /**
     * Artifact's version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
