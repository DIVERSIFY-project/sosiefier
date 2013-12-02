package fr.inria.diversify.transformation.maven;

import java.io.File;

import org.apache.tools.ant.Project;
import org.apache.tools.ant.ProjectHelper;

/**
 * User: Simon
 * Date: 02/12/13
 * Time: 11:54
 */
public class RunAnt {
    protected String directory;
    String target;

    public  void runAnt(){
        File buildFile = new File(directory+"/build.xml");
        Project p = new Project();
        p.setUserProperty("ant.file", buildFile.getAbsolutePath());
        p.init();
        ProjectHelper helper = ProjectHelper.getProjectHelper();
        p.addReference("ant.projectHelper", helper);
        helper.parse(p, buildFile);
        p.executeTarget(target);
    }
}
