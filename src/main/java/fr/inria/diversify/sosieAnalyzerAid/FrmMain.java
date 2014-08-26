package fr.inria.diversify.sosieAnalyzerAid;

import fr.inria.diversify.diversification.InputConfiguration;
import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.ast.ASTAdd;
import fr.inria.diversify.transformation.ast.ASTReplace;
import fr.inria.diversify.transformation.ast.ASTTransformation;
import org.json.JSONException;
import spoon.reflect.code.CtCodeElement;
import spoon.reflect.declaration.CtClass;

import javax.swing.*;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import java.io.IOException;
import java.util.*;

/**
 * Created by marodrig on 25/08/2014.
 */
public class FrmMain {

    private JTable tblTransfProps;
    private JPanel mainPnl;
    private JTree treeTransformations;
    private JTable table1;
    private JComboBox comboBox1;
    private JTextPane textPane1;
    private JTextPane textPane2;
    private JTree tree2;
    private JTextPane textPane3;
    private InputProgram inputProgram;
    private InputConfiguration inputConfiguration;
    private Collection<Transformation> transformations;


    private HashMap<String, ArrayList<ASTTransformation>> transfPerPosition;

    public FrmMain() {

    }

    public JPanel getMainPanel() {
        return mainPnl;
    }

    /**
     * Loads the transformations into the transformation treeTransformations
     *
     * @param inputFile Path to the transformations json file storing transformations
     */
    public void loadTransformations(String inputFile) throws IOException, JSONException {


        TableModel tb = new DefaultTableModel(new Object[]{"Property", "Value"}, 5);
        tb.setValueAt("Position", 1, 0);
        tb.setValueAt("Type", 2, 0);
        tb.setValueAt("Source", 3, 0);

        tblTransfProps.setModel(tb);

    }

    public void setInputProgram(InputProgram inputProgram) {
        this.inputProgram = inputProgram;
    }

    public InputProgram getInputProgram() {
        return inputProgram;
    }

    public void setInputConfiguration(InputConfiguration inputConfiguration) {
        this.inputConfiguration = inputConfiguration;
    }

    public InputConfiguration getInputConfiguration() {
        return inputConfiguration;
    }

    public void setTransformations(Collection<Transformation> transformations) {
        this.transformations = transformations;
    }

    public Collection<Transformation> getTransformations() {
        return transformations;
    }

    /**
     * Set all the data loaded initially to the GUI.
     */
    public void showData() {

        treeTransformations.addTreeSelectionListener(e -> { doNodeSelected(e);
        });

        if (transfPerPosition == null) {
            transfPerPosition = new HashMap<>();
        } else {
            transfPerPosition.clear();
        }

        if (transformations == null) {
            throw new RuntimeException("transformations are not set. Cannot set any data to interface");
        } else {
            DefaultMutableTreeNode root = new DefaultMutableTreeNode("Transformations");
            DefaultTreeModel model = new DefaultTreeModel(root);
            for (Transformation t : transformations) {
                if (t instanceof ASTTransformation) {
                    ASTTransformation ast = (ASTTransformation) t;
                    String pos = ast.getTransplantationPoint().positionString();
                    ArrayList<ASTTransformation> list = new ArrayList<>();
                    if (transfPerPosition.containsKey(pos)) {
                        list = transfPerPosition.get(pos);
                    } else {
                        list = new ArrayList<>();
                        transfPerPosition.put(pos, list);
                    }
                    list.add(ast);
                } else {
                    model.insertNodeInto(new DefaultMutableTreeNode("Non AST : " + t.toString()), root, root.getChildCount());
                }
            }
            List<String> keyList = new ArrayList<>(transfPerPosition.keySet());
            Collections.sort(keyList);
            StringBuilder sbCommon = new StringBuilder(keyList.get(0));
            for (String k : keyList) {
                StringBuilder sb = new StringBuilder(k);

            }
            for (String k : keyList) {
                DefaultMutableTreeNode tp = new DefaultMutableTreeNode(k);
                tp.setUserObject(transfPerPosition.get(k));
                model.insertNodeInto(tp, root, root.getChildCount());
                for (ASTTransformation ast : transfPerPosition.get(k)) {
                    String s = ast.getName() ;
                    if ( ast instanceof ASTAdd ) {
                        s = s + " - " + ((ASTAdd)ast).getTransplant().positionString();
                    }
                    if ( ast instanceof ASTReplace ) {
                        s = s + " - " + ((ASTReplace)ast).getTransplant().positionString();
                    }
                    DefaultMutableTreeNode dft = new DefaultMutableTreeNode(s);
                    //dft.setUserObject(ast);
                    model.insertNodeInto(dft, tp, tp.getChildCount());
                }
            }
            treeTransformations.setModel(model);
        }
    }

    /**
     * Handles the selection of the node
     * @param e
     */
    private void doNodeSelected(TreeSelectionEvent e) {
        DefaultMutableTreeNode node = (DefaultMutableTreeNode) treeTransformations.getLastSelectedPathComponent();
        //if ( node.getUserObject() instanceof  )
    }
}
