package fr.inria.diversify.sosieAnalyzerAid;

import fr.inria.diversify.diversification.InputConfiguration;
import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.factories.SpoonMetaFactory;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.TransformationJsonParser;
import fr.inria.diversify.util.Log;
import org.json.JSONArray;
import spoon.reflect.factory.Factory;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Collection;

/**
 * Created by marodrig on 25/08/2014.
 */
public class AnalyzerAid {
    public static void main(String[] args) throws Exception {

        try {
            if (args.length == 0) {
                Log.error("Unable to find properties file");
                return;
            }


            InputConfiguration inputConfiguration = new InputConfiguration(args[0]);

            Log.info("Scanning the project source code (this may take a minute)");
            Factory factory = new SpoonMetaFactory().buildNewFactory(inputConfiguration.getProjectPath(), 5);

            InputProgram inputProgram = new InputProgram();
            inputProgram.setFactory(factory);
            inputProgram.configure(inputConfiguration);
            Log.info("Loading and linking transformation in JSON format to code statements (this may take two minutes... or more)");


            StringBuilder sb = new StringBuilder();
            BufferedReader reader = new BufferedReader(new FileReader(inputConfiguration.getPreviousTransformationPath()));
            String line = null;
            while ((line = reader.readLine()) != null) {
                sb.append(line);
            }
            JSONArray array = new JSONArray(sb.toString());
            long milis = System.currentTimeMillis();
            inputProgram.processCodeFragments(array);
            //inputProgram.processCodeFragments();


            Collection<Transformation> transformations;
            TransformationJsonParser p = new TransformationJsonParser(false, inputProgram);
            File transfFile = new File(inputConfiguration.getPreviousTransformationPath());
            if ( transfFile.isDirectory() ) {
                transformations = p.parseDir(transfFile.getAbsolutePath());
            } else {
                transformations = p.parseFile(transfFile);
            }

            Log.info("Time: " + (System.currentTimeMillis()-milis));

            JFrame frame = new JFrame("FrmMain");
            FrmMain frmMain = new FrmMain();
            frmMain.setInputProgram(inputProgram);
            frmMain.setInputConfiguration(inputConfiguration);
            frmMain.setTransformations(transformations);

            //Loads the transformations into the interface
            frmMain.showData();

            frame.setContentPane(frmMain.getMainPanel());
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setPreferredSize(new Dimension(800, 480));
            frame.setLocation(200, 200);
            frame.pack();
            frame.setVisible(true);

        } catch (RuntimeException ex) {
            System.out.println("Abnormal run time exception termination " + ex.getMessage());
        } catch (Exception e ) {
            System.out.println("Abnormal exception termination " + e.getMessage());
        }
    }
}
