package fr.inria.diversify.visu;


import fr.inria.diversify.buildSystem.android.InvalidSdkException;
import fr.inria.diversify.persistence.json.input.JsonTransformationLoader;
import fr.inria.diversify.runner.InputConfiguration;
import fr.inria.diversify.runner.InputProgram;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.ast.ASTTransformation;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import spoon.reflect.code.CtStatement;
import spoon.reflect.declaration.CtType;
import spoon.reflect.factory.Factory;
import spoon.reflect.visitor.Query;
import spoon.reflect.visitor.filter.TypeFilter;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;


public class MatrixVisu extends Application {
    static int cellSize = 10;
    static boolean[][] notCompile;
    static boolean[][] compile;
    static boolean[][] sosie;
    static int[] classSize;
    static int nbClass;
    static int maxSize;
    static boolean pause = true;
    static boolean stepByStep = false;
    static boolean reset = false;


    public static void main(String[] args) throws Exception, InvalidSdkException {
        MatrixVisu visu = new MatrixVisu();

//        InputConfiguration inputConfiguration = new InputConfiguration(args[0]);
//        InputProgram inputProgram = InitUtils.initInputProgram(inputConfiguration);
//        InitUtils.initDependency(inputConfiguration);
//        InitUtils.initSpoon(inputProgram, false);
//        visu.initTransformation(inputProgram);
//        visu.printMatrix("matrix.csv");

        visu.readMatrix("matrix.csv");
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        VBox root = new VBox();

        Group matrixGroup = addEmptyMatrix(root);
        addButton(root);

        Scene scene = new Scene(root, maxSize * cellSize, nbClass * cellSize + 30);
        stage.setScene(scene);
        stage.show();
            updateMatrix(matrixGroup);
    }

    protected void updateMatrix(Group group) {
        Random r = new Random();
        Thread thread = new Thread(() -> {
            while(true) {
                sleep(50);
                reset = false;
                List<int[]> xy = new ArrayList<>();

                for (int y = 0; y < nbClass; y++) {
                    for (int x = 0; x < classSize[y]; x++) {
                        if (hasTransformation(x, y)) {
                            xy.add(new int[]{x, y});
                        }
                    }
                }
                while (!reset) {
                    sleep(50);
                    while (!xy.isEmpty() && !pause) {
                        int[] tmp = xy.remove(r.nextInt(xy.size()));
                        int x = tmp[0];
                        int y = tmp[1];
                        if (hasTransformation(x, y)) {
                            sleep(50);
                            if (notCompile[x][y]) {
                                addCell(group, x, y, Color.RED);
                                sleepStepByStep();
                            }
                            if (compile[x][y]) {
                                addCell(group, x, y, Color.BLUE);
                                sleepStepByStep();
                            }
                            if (sosie[x][y]) {
                                addCell(group, x, y, Color.LAWNGREEN);
                                sleepStepByStep();
                            }
                        }

                    }
                }
                cleanMatrix(group);
            }
        });
        thread.setDaemon(true);
        thread.start();
    }

    protected void sleepStepByStep() {
        if(stepByStep) {
            pause = true;
        }
        while (pause && !reset) {
            sleep(50);
        }
        sleep(200);
    }

    protected void addButton(VBox box) {
        Button pauseButton = new Button("Start");
        HBox hBox = new HBox(10);
        hBox.setAlignment(Pos.CENTER);
        hBox.getChildren().add(pauseButton);
        box.getChildren().add(hBox);

        pauseButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                pause = !pause;
                stepByStep = false;
                if(pause) {
                    pauseButton.setText("Start");
                } else {
                    pauseButton.setText("Pause");
                }
            }
        });

        Button stepButton = new Button("Step by step");
        hBox.getChildren().add(stepButton);
        stepButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                pause = false;
                stepByStep = true;
                if(pause) {
                    pauseButton.setText("Start");
                } else {
                    pauseButton.setText("Pause");
                }
            }
        });

        Button resetButton = new Button("Reset");
        hBox.getChildren().add(resetButton);

        resetButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                pauseButton.setText("Start");
                reset = true;
                pause = true;
                stepByStep = false;
            }
        });
    }

    protected void sleep(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException exc) {
            throw new Error("Unexpected interruption", exc);
        }
    }

    protected void addCell(Group group, final int x, final int y, Color color) {
        Platform.runLater(() -> {
            Rectangle rect = new Rectangle(cellSize * (x+1), cellSize* (y+1), cellSize, cellSize);
            rect.setFill(color);

            rect.setStroke(Color.BLACK);
            group.getChildren().add(rect);
        });
    }


    protected boolean hasTransformation(int x, int y) {
        return notCompile[x][y] || compile[x][y] || sosie[x][y];
    }

    protected Group addEmptyMatrix(VBox box) {
        Group group = new Group();
        for(int y = 0; y < nbClass; y++) {
            for(int x = 0; x < classSize[y]; x++) {
                Rectangle rect = new Rectangle(cellSize * (x+1), cellSize* (y+1), cellSize, cellSize);
                rect.setFill(Color.WHITE);
                rect.setStroke(Color.BLACK);
                group.getChildren().add(rect);
            }
        }
        box.getChildren().add(group);
        return group;
    }

    protected void cleanMatrix(Group box) {
        Platform.runLater(() -> {
        box.getChildren().stream()
                .filter(node -> node instanceof Rectangle)
                .map(node -> (Rectangle)node)
                .forEach(rect ->  rect.setFill(Color.WHITE));
        });
    }

    protected List<Transformation> loadTransformation(InputProgram inputProgram) {
        JsonTransformationLoader parser = new JsonTransformationLoader(inputProgram);

        return parser.load(inputProgram.getPreviousTransformationsPath(), true).stream()
                .distinct()
                .collect(Collectors.toList());
    }

    protected void initTransformation(InputProgram inputProgram) {
        Map<String, List<ASTTransformation>> transByClass = transByClass(inputProgram, 200 );

        Factory factory = inputProgram.getFactory();
        Map<String, List<CtStatement>> stmtByClass = new HashMap<>();
        transByClass.keySet().stream()
                .forEach(className -> {
                    CtType cl = factory.Class().get(className);
                    List<CtStatement> stmts = Query.getElements(cl, new TypeFilter(CtStatement.class));
                    stmtByClass.put(className, stmts);
                });

        List<Integer> list = stmtByClass.values().stream()
                .map(l -> l.size())
                .sorted()
                .collect(Collectors.toList());

        int quartile1 = list.get((int)(list.size()*.2));
        int quartile34 = list.get((int)(list.size()*.6));

        Map<String, List<CtStatement>> filterStmtClass = new HashMap<>();
        stmtByClass.keySet().stream()
                .filter(cl -> stmtByClass.get(cl).size() > quartile1 && stmtByClass.get(cl).size() < quartile34)
                .forEach(cl -> filterStmtClass.put(cl, stmtByClass.get(cl)));

        String[] className = filterStmtClass.keySet().toArray(new String[filterStmtClass.size()]);
        List<List<List<ASTTransformation>>> tmpMatrix = new ArrayList<>(quartile34);
        for(int x = 0; x < quartile34; x++) {
            tmpMatrix.add(new ArrayList<>());
            for(int y = 0; y < className.length; y++) {
                List<ASTTransformation> trans = new ArrayList<>();
                if(filterStmtClass.get(className[y]).size() > x) {
                    trans = getTransformationFor(transByClass.get(className[y]), filterStmtClass.get(className[y]).get(x));
                }
                tmpMatrix.get(x).add(trans);
            }
        }
        nbClass = filterStmtClass.size();
        classSize = new int[nbClass];
        int i = -1;
        for(String cl : filterStmtClass.keySet()) {
            i++;
            classSize[i] = filterStmtClass.get(cl).size();
        }
        maxSize = quartile34;
        notCompile = new boolean[quartile34][nbClass];
        compile = new boolean[quartile34][nbClass];
        sosie = new boolean[quartile34][nbClass];
        for(int x = 0; x < quartile34; x++) {
            for (int y = 0; y < nbClass; y++) {
                List<ASTTransformation> transformations = tmpMatrix.get(x).get(y);
                notCompile[x][y] = hasStatus(transformations, -2);
                compile[x][y] = hasStatus(transformations, -1);
                sosie[x][y] = hasStatus(transformations, 0) || hasStatus(transformations, 1);
            }
        }
    }

    protected  Map<String, List<ASTTransformation>> transByClass(InputProgram inputProgram, int nbClass) {
        Map<String, List<ASTTransformation>> transByClass = loadTransformation(inputProgram).stream()
                .map(trans -> (ASTTransformation) trans)
                .collect(Collectors.groupingBy(trans -> trans.classLocationName()));

        List<String> sortedClasses = transByClass.entrySet().stream()
                .sorted((entry1, entry2)-> entry2.getValue().size() - entry1.getValue().size())
                .map(entry -> entry.getKey())
                .collect(Collectors.toList());
        Map<String, List<ASTTransformation>> ret = new HashMap<>();
        for(int i = 0; i < Math.min(nbClass, sortedClasses.size()); i++) {
            ret.put(sortedClasses.get(i), transByClass.get(sortedClasses.get(i)));
        }
        return ret;
    }

    protected List<ASTTransformation> getTransformationFor(List<ASTTransformation> transformations, CtStatement stmt) {
        return transformations.stream()
                .filter(trans -> trans.getTransplantationPoint().getCtCodeFragment().equals(stmt))
                .collect(Collectors.toList());
    }

    protected boolean hasStatus(List<ASTTransformation> transformations, int status) {
        return !transformations.stream()
                .filter(trans -> trans.getStatus() == status)
                .collect(Collectors.toList()).isEmpty();
    }

    protected void printMatrix(String file) throws IOException {
        FileWriter writer = new FileWriter(file);

        writer.write(nbClass + "\n");
        writer.write(maxSize + "\n");

        for(int y = 0; y < nbClass; y++) {
            for (int x = 0; x < classSize[y]; x++) {
                writer.write((notCompile[x][y] ? 1:0) + "");
                writer.write((compile[x][y] ? 1:0) + "");
                writer.write((sosie[x][y] ? 1:0) + ";");
            }
            writer.write("\n");
        }
        writer.close();

    }

    protected void readMatrix(String file) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(file));

        nbClass = Integer.parseInt(reader.readLine());
        maxSize = Integer.parseInt(reader.readLine());

        classSize = new int[nbClass];
        notCompile = new boolean[maxSize][nbClass];
        compile = new boolean[maxSize][nbClass];
        sosie = new boolean[maxSize][nbClass];
        for(int y = 0; y < nbClass; y++) {
            String[] cells = reader.readLine().split(";");
            classSize[y] = cells.length -1;
            for(int x = 0; x < classSize[y]; x++) {
                notCompile[x][y] = cells[x].charAt(0) == '1';
                compile[x][y] = cells[x].charAt(1) == '1';
                sosie[x][y] = cells[x].charAt(2) == '1';
            }
        }
    }
}