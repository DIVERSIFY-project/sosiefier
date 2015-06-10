package harman;

import fr.inria.diversify.buildSystem.android.InvalidSdkException;
import fr.inria.diversify.buildSystem.maven.MavenDependencyResolver;
import fr.inria.diversify.diversification.InputConfiguration;
import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.util.Log;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Simon on 23/02/15.
 */
public class CoverageByTest {

    protected InputConfiguration inputConfiguration;
    protected InputProgram inputProgram;

    public static void main(String[] args) throws InvalidSdkException, Exception {
        CoverageByTest c = new CoverageByTest(args[0], args[1]);
    }

    public CoverageByTest(String propertiesFile, String cl) throws Exception, InvalidSdkException {
        Log.DEBUG();
        inputConfiguration = new InputConfiguration(propertiesFile);
        initDependency();
        initInputProgram();
        contains(new File(inputConfiguration.getCoverageDir()), cl);
    }

    protected void contains( File jacocoDir, String cl) throws IOException {
        for(File file: jacocoDir.listFiles()) {
            if(file.getName().endsWith(".exec")) {
                String testName = file.getName().substring(0, file.getName().length() - 5);
                String dir = inputProgram.getProgramDir() + "/" + inputProgram.getClassesDir();
                CoverageInfo coverageInfo = new CoverageInfo(dir, file);
                coverageInfo.create();

               if(coverageInfo.isCoveredClass(cl.replace(".", "/"))) {
                   Log.info(testName);
               }
            }
        }
    }

    protected void initDependency() throws Exception, InvalidSdkException {
        MavenDependencyResolver t = new MavenDependencyResolver();
        String builder = inputConfiguration.getProperty("builder");

        String dependencyPom = inputConfiguration.getProperty("dependencyPom");
        if (builder.equals("maven") && dependencyPom != null) {
            File pom = new File(inputConfiguration.getProperty("project") + "/pom.xml");
            File originalPom = new File(inputConfiguration.getProperty("project") + "/_originalPom.xml");
            FileUtils.copyFile(pom, originalPom);

            if(dependencyPom != null) {
                FileUtils.copyFile(new File(inputConfiguration.getProperty("project") + "/" +dependencyPom), pom);
            }

            t.DependencyResolver(inputConfiguration.getProperty("project") + "/pom.xml");

            FileUtils.copyFile(originalPom, pom);
            FileUtils.forceDelete(originalPom);
        }

        String androidSdk = inputConfiguration.getProperty("AndroidSdk");
        if(androidSdk != null) {
            t.resolveAndroidDependencies(androidSdk);
        }
    }

    /**
     * Initializes the InputProgram dataset
     */
    protected void  initInputProgram() throws IOException, InterruptedException {
        inputProgram = new InputProgram();
        inputConfiguration.setInputProgram(inputProgram);
        inputProgram.setProgramDir(inputConfiguration.getProperty("project"));
        inputProgram.setRelativeSourceCodeDir(inputConfiguration.getRelativeSourceCodeDir());
        inputProgram.setRelativeTestSourceCodeDir(inputConfiguration.getRelativeTestSourceCodeDir());

        if(inputConfiguration.getProperty("externalSrc") != null) {
            List<String> list = Arrays.asList(inputConfiguration.getProperty("externalSrc")
                                                                .split(System.getProperty("path.separator")));
            String sourcesDir = list.stream()
                                    .map(src -> inputProgram.getProgramDir() + "/" + src)
                                    .collect(Collectors.joining(System.getProperty("path.separator")));
            inputProgram.setExternalSourceCodeDir(sourcesDir);
        }
        // inputProgram.setCoverageReport(initCoverageReport());

        inputProgram.setTransformationPerRun(
                Integer.parseInt(inputConfiguration.getProperty("transformation.size", "1")));

        //Path to pervious transformations made to this input program
        inputProgram.setPreviousTransformationsPath(
                inputConfiguration.getProperty("transformation.directory"));

        inputProgram.setClassesDir(inputConfiguration.getProperty("classes"));

        inputProgram.setCoverageDir(inputConfiguration.getProperty("jacoco"));
    }
}
