package fr.inria.diversify.persistence;

/**
 * Created by marodrig on 23/01/2015.
 */
public class Header {

    public static final String HEADER = "header";

    public static String TRANSF_COUNT = "transformationCount";

    public static String PROJECT_TYPE = "projectType";

    /**
     * Number of transformations that are in the storage
     */
    private int transformationCount;

    /**
     * Type of project, Maven, Ant...
     */
    private String typeOfProject;
    private String groupId;
    private String artifactId;
    private String version;
    private String generatorVersion;

    public int getTransformationCount() {
        return transformationCount;
    }

    public String getTypeOfProject() {
        return typeOfProject;
    }

    public void setTypeOfProject(String typeOfProject) {
        this.typeOfProject = typeOfProject;
    }

    public void setTransformationCount(int transformationCount) {
        this.transformationCount = transformationCount;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setArtifactId(String artifactId) {
        this.artifactId = artifactId;
    }

    public String getArtifactId() {
        return artifactId;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getVersion() {
        return version;
    }

    public void setGeneratorVersion(String generatorVersion) {
        this.generatorVersion = generatorVersion;
    }

    public String getGeneratorVersion() {
        return generatorVersion;
    }
}
