package fr.inria.diversify.transformation.query;

import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.codeFragment.Statement;
import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.transformation.SingleTransformation;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.ast.ASTAdd;
import fr.inria.diversify.transformation.ast.ASTDelete;
import fr.inria.diversify.transformation.ast.ASTReplace;
import fr.inria.diversify.transformation.ast.ASTTransformation;
import spoon.reflect.code.CtReturn;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.factory.Factory;

import java.util.*;


/**
 * A transformation executeQuery over the AST
 * <p>
 * User: Simon
 * Modified: Marcelino
 * Date: 7/9/13
 * Time: 10:02 AM
 */
public class ASTTransformationQuery extends TransformationQuery {
    /**
     * Class of the code fragment. Defaults to Statement
     */
    protected Class codeFragmentClass = Statement.class;

    /**
     * Indicates if we do solely simple transformations. Defaults to the simple ones
     */
    protected boolean stupid = true;

    /**
     * Indicates if variable matching used sub type
     */
    protected boolean subType = true;

    /**
     * Short constructor assuming the fragment class to be statement and the transformation to be stupid
     *
     * @param inputProgram Input program over the queries are going to be made
     */
    public ASTTransformationQuery(InputProgram inputProgram) {
        //This we assume be defect
        super(inputProgram);
        codeFragmentClass = Statement.class;
    }

    /**
     * Long constructor assuming nothing
     * @param inputProgram Input Input program over the queries are going to be made
     * @param fragmentClass Class of the fragments
     * @param isStupid Is this a stupid transformation?
     */
    public ASTTransformationQuery(InputProgram inputProgram, Class fragmentClass, boolean subType, boolean isStupid) {
        super(inputProgram);
        codeFragmentClass = fragmentClass;
        stupid = isStupid;
        this.subType = subType;
    }


    @Override
    public void setType(String type) {

    }

    @Override
    public SingleTransformation query() throws QueryException {
        try {
            Random r = new Random();
            ASTTransformation t = null;
            int i = r.nextInt(stupid ? 15 : 5);
            switch (i) {
                case 0:
                case 1:
                    t = replace(subType);
                    break;
                case 2:
                case 3:
                    t = add(subType);
                    break;
                case 4:
                    t = delete();
                    break;
                case 5:
                case 6:
                case 7:
                    t = replaceRandom();
                    break;
                case 8:
                case 9:
                case 10:
                    t = addRandom();
                    break;
                case 11:
                    t = replaceWittgenstein();
                    break;
                case 12:
                    t = addWittgenstein();
                    break;
                case 13: {
                    t = replace(subType);
                    t.setName("replaceReaction");
                    break;
                }
                case 14: {
                    t = add(subType);
                    t.setName("addReaction");
                    break;
                }
            }
            t.setInputProgram(getInputProgram());
            return t;

        } catch (Exception e) {
            throw new QueryException(e);
        }
    }

    /**
     *
     * @return
     * @throws Exception
     */
    protected ASTReplace replace(boolean subType) throws Exception {
        ASTReplace tf = new ASTReplace();
        CodeFragment transplantationPoint = null;
        CodeFragment transplant = null;

        while (transplant == null) {
            transplantationPoint = findRandomFragmentToReplace(true);
            transplant = findRandomFragmentCandidate(transplantationPoint, false, subType);
        }
        tf.setTransplantationPoint(transplantationPoint);
        tf.setTransplant(transplant);
        tf.setSubType(subType);

        return tf;
    }

    protected ASTReplace replaceReaction(CodeFragment transplantationPoint, boolean subType) throws Exception {
        ASTReplace tf = new ASTReplace();

        CodeFragment transplant = findRandomFragmentCandidate(transplantationPoint, false, subType);
        if (transplant == null)
            throw new Exception("pas de candidat pour " + transplant);

        tf.setTransplantationPoint(transplantationPoint);
        tf.setTransplant(transplant);
        tf.setName("replaceReaction");
        tf.setSubType(subType);

        return tf;
    }


    protected ASTReplace replaceWittgenstein() throws Exception {
        ASTReplace tf = new ASTReplace();
        CodeFragment transplant = null;
        CodeFragment transplantationPoint = null;

        while (transplantationPoint == null) {
            transplant = findRandomFragmentToReplace(true);
            transplantationPoint = findRandomFragmentCandidate(transplant, true, false);
        }
        tf.setName("replaceWittgenstein");
        tf.setTransplantationPoint(transplantationPoint);
        tf.setTransplant(transplant);
        tf.setSubType(subType);

        return tf;
    }

    protected ASTReplace replaceRandom() throws Exception {
        ASTReplace tf = new ASTReplace();
        tf.setTransplantationPoint(findRandomFragmentToReplace(true));
        tf.setTransplant(findRandomFragmentToReplace(false));
        tf.setName("replaceRandom");
        tf.setSubType(subType);

        return tf;
    }

    protected ASTAdd addRandom() throws Exception {
        ASTAdd tf = new ASTAdd();
        tf.setTransplantationPoint(findRandomFragmentToReplace(true));
        tf.setTransplant(findRandomFragmentToReplace(false));
        tf.setName("addRandom");
        tf.setSubType(subType);

        return tf;
    }

    protected ASTReplace replace(CodeFragment transplantationPoint, boolean varNameMatch, boolean subType) throws Exception {
        ASTReplace tf = new ASTReplace();

        CodeFragment cfReplacedBy = findRandomFragmentCandidate(transplantationPoint, varNameMatch, subType);
        if (cfReplacedBy == null)
            throw new Exception("pas de candidat pour " + transplantationPoint);
        tf.setTransplantationPoint(transplantationPoint);
        tf.setTransplant(cfReplacedBy);
        tf.setSubType(subType);

        return tf;
    }


    protected ASTAdd addWittgenstein() throws Exception {
        ASTAdd tf = new ASTAdd();
        CodeFragment transplantationPoint = null;
        CodeFragment transplant = null;

        while (transplant == null) {
            transplantationPoint = findRandomFragmentToReplace(true);
            transplant = findRandomFragmentCandidate(transplantationPoint, true, false);
        }

        tf.setTransplantationPoint(transplantationPoint);
        tf.setTransplant(transplant);
        tf.setName("addWittgenstein");
        tf.setSubType(subType);

        return tf;
    }

    protected ASTAdd add(boolean subType) throws Exception {
        ASTAdd tf = new ASTAdd();
        CodeFragment transplantationPoint = null;
        CodeFragment transplant = null;

        while (transplant == null) {
            transplantationPoint = findRandomFragmentToReplace(true);
            transplant = findRandomFragmentCandidate(transplantationPoint, false, subType);
        }
        tf.setTransplantationPoint(transplantationPoint);
        tf.setTransplant(transplant);
        tf.setSubType(subType);

        return tf;
    }

    protected ASTAdd addReaction(CodeFragment transplantationPoint, boolean subType) throws Exception {
        ASTAdd tf = new ASTAdd();

        CodeFragment transplant = findRandomFragmentCandidate(transplantationPoint, false, subType);
        if (transplant == null)
            throw new Exception("pas de candidat pour " + transplant);

        tf.setTransplantationPoint(transplantationPoint);
        tf.setTransplant(transplant);
        tf.setName("addReaction");
        tf.setSubType(subType);

        return tf;
    }

    protected ASTAdd add(CodeFragment transplantationPoint, boolean varNameMatch, boolean subType) throws Exception {
        ASTAdd tf = new ASTAdd();

        CodeFragment transplant = findRandomFragmentCandidate(transplantationPoint, varNameMatch, subType);
        if (transplant == null)
            throw new Exception("pas de candidat pour " + transplantationPoint);
        tf.setTransplantationPoint(transplantationPoint);
        tf.setTransplant(transplant);
        tf.setSubType(subType);

        return tf;
    }



    protected ASTDelete delete() throws Exception {
        ASTDelete tf = new ASTDelete();
        CodeFragment transplantationPoint = null;
        while (transplantationPoint == null) {
            transplantationPoint = findRandomFragmentToReplace(true);
            if (transplantationPoint.getCtCodeFragment() instanceof CtReturn)
                transplantationPoint = null;
        }
        tf.setTransplantationPoint(transplantationPoint);

        return tf;
    }


    protected ASTDelete delete(CodeFragment transplantationPoint) throws Exception {
        ASTDelete tf = new ASTDelete();
        tf.setTransplantationPoint(transplantationPoint);
        return tf;
    }

    /**
     * Find code fragments to replace, i.e, transplantation points
     *
     * @param withCoverage Indicates if the transplantation points must have coverage by the test suite.
     * @return
     */
    protected CodeFragment findRandomFragmentToReplace(boolean withCoverage) {
        Random r = new Random();
        int size = getInputProgram().getCodeFragments().size();
        CodeFragment stmt = getInputProgram().getCodeFragments().get(r.nextInt(size));

        while (withCoverage && getInputProgram().getCoverageReport().codeFragmentCoverage(stmt) == 0) {
            stmt = getInputProgram().getCodeFragments().get(r.nextInt(size));
        }
        return stmt;
    }

    /**
     * Find a random code fragment candidate to replace
     *
     *
     * @param cf
     * @param varNameMatch
     * @return
     * @throws IllegalAccessException
     * @throws InstantiationException
     */
    protected CodeFragment findRandomFragmentCandidate(CodeFragment cf,
                                                       boolean varNameMatch, boolean subType) throws IllegalAccessException, InstantiationException {

        String cfString = cf.equalString();
        for(CodeFragment codeFragment : getAllUniqueCodeFragments()) {
            if(cf.isReplaceableBy(codeFragment, varNameMatch, subType) && !codeFragment.equalString().equals(cfString)) {
                return codeFragment;
            }
        }
        return null;
    }

    protected CtElement copyElem(CtElement elem) {
        Factory factory = elem.getFactory();
        CtElement tmp = factory.Core().clone(elem);
        tmp.setParent(elem.getParent());
        return tmp;
    }

    protected List<CodeFragment> getAllUniqueCodeFragments() {
        List<CodeFragment>  list = new ArrayList<>(getInputProgram().getCodeFragments().getUniqueCodeFragmentList());
        Collections.shuffle(list);
        return list;
    }

    public Collection<Transformation> isstaTransformation(int nb) throws Exception {
        List<Transformation> transformations = new ArrayList<>();
        for(int i = 0; i< nb; i++) {
            ASTReplace replace = replace(subType);
            transformations.add(replace);

            try {
                ASTReplace replaceW = replace(replace.getTransplantationPoint(), true, subType);
                replaceW.setName("replaceWittgenstein");

                transformations.add(replaceW);
            } catch (Exception e) {}

            try {
                ASTReplace replaceReaction = replaceReaction(replace.getTransplantationPoint(), subType);
                transformations.add(replaceReaction);
            } catch (Exception e) {}

            try {
                ASTReplace replaceRandom = new ASTReplace();
                replaceRandom.setTransplantationPoint(replace.getTransplantationPoint());
                replaceRandom.setTransplant(findRandomFragmentToReplace(false));
                replaceRandom.setName("replaceRandom");
                transformations.add(replaceRandom);
            } catch (Exception e) {}

            try {
                ASTAdd add = add(replace.getTransplantationPoint(), false, subType);
                transformations.add(add);
            } catch (Exception e) {}

            try {
                ASTAdd addW = add(replace.getTransplantationPoint(), true, false);
                addW.setName("addWittgenstein");
                transformations.add(addW);
            } catch (Exception e) {}

            try {
                ASTAdd addReaction = addReaction(replace.getTransplantationPoint(),subType);
                transformations.add(addReaction);
            } catch (Exception e) {}

            try {
                ASTAdd addRandom = new ASTAdd();
                addRandom.setTransplantationPoint(replace.getTransplantationPoint());
                addRandom.setTransplant(findRandomFragmentToReplace(false));
                addRandom.setName("addRandom");
                transformations.add(addRandom);
            } catch (Exception e) {}

            try {
                ASTDelete delete = new ASTDelete();
                delete.setTransplantationPoint(replace.getTransplantationPoint());
                transformations.add(delete);
            } catch (Exception e) {}
        }
        return transformations;
    }

}
