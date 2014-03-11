package fr.inria.diversify.sosie.compare;


import org.json.JSONException;
import org.json.JSONObject;

public abstract class Diff {
    protected String originalClassName;
    protected String originalMethodSignature;
    protected String sosieClassName;
    protected String sosieMethodSignature;
    protected int originalPosition;
    protected int sosiePosition;
    protected String testName;
    private int[][] divergence;

    public void setOriginalPosition(int originalPosition) {
        this.originalPosition = originalPosition;
    }
    public int getOriginalPosition() {
        return originalPosition;
    }
    public void setTestName(String testName) {
        this.testName = testName;
    }

    public void setSosiePosition(int sosiePosition) {
        this.sosiePosition = sosiePosition;
    }

    public abstract JSONObject toJSON() throws JSONException;

    public void setDivergence(int[][] divergence) {
        this.divergence = divergence;
    }

    public boolean equals(Object other) {
        return this.toString().equals(other.toString());
    }

    public  int hashCode() {
        return  this.toString().hashCode();
    }
}
