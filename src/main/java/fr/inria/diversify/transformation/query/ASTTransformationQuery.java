package fr.inria.diversify.transformation.query;

import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.codeFragment.Statement;
import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.ast.ASTAdd;
import fr.inria.diversify.transformation.ast.ASTDelete;
import fr.inria.diversify.transformation.ast.ASTReplace;
import fr.inria.diversify.transformation.ast.ASTTransformation;
import spoon.reflect.code.CtCodeElement;
import spoon.reflect.code.CtReturn;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.factory.Factory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;


/**
 * A transformation query over the AST
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
    public ASTTransformationQuery(InputProgram inputProgram, Class fragmentClass, boolean isStupid) {
        super(inputProgram);
        codeFragmentClass = fragmentClass;
        stupid = isStupid;
    }


    @Override
    public void setType(String type) {

    }

    /**
     * A method to progresively change into the multi
     * @param nb
     */
    @Override
    public List<Transformation> query(int nb) {

        ArrayList<Transformation> result = new ArrayList<>(nb);
        try {
            for (int j = 0; j < nb; j++) {
                Random r = new Random();
                ASTTransformation t = null;
                int i = r.nextInt(stupid ? 15 : 5);

                switch (i) {
                    case 0:
                    case 1:
                        t = replace();
                        break;
                    case 2:
                    case 3:
                        t = add();
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
                        t = replace();
                        t.setName("replaceReaction");
                        break;
                    }
                    case 14: {
                        t = add();
                        t.setName("addReaction");
                        break;
                    }
                }
                result.add(t);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return result;
    }


    /**
     *
     * @return
     * @throws Exception
     */
    protected ASTReplace replace() throws Exception {
        ASTReplace tf = new ASTReplace();
        CodeFragment transplantationPoint = null;
        CodeFragment transplant = null;

        while (transplant == null) {
            transplantationPoint = findRandomFragmentToReplace(true);
            transplant = findRandomFragmentCandidate(transplantationPoint, false);
        }
        tf.setTransplantationPoint(transplantationPoint);
        tf.setTransplant(transplant);
        return tf;
    }

    protected ASTReplace replaceReaction(CodeFragment transplantationPoint) throws Exception {
        ASTReplace tf = new ASTReplace();

        CodeFragment transplant = findRandomFragmentCandidate(transplantationPoint, false);
        if (transplant == null)
            throw new Exception("pas de candidat pour " + transplant);

        tf.setTransplantationPoint(transplantationPoint);
        tf.setTransplant(transplant);
        tf.setName("replaceReaction");
        return tf;
    }


    protected ASTReplace replaceWittgenstein() throws Exception {
        ASTReplace tf = new ASTReplace();
        CodeFragment transplant = null;
        CodeFragment transplantationPoint = null;

        while (transplantationPoint == null) {
            transplant = findRandomFragmentToReplace(true);
            transplantationPoint = findRandomFragmentCandidate(transplant, true);
        }
        tf.setName("replaceWittgenstein");
        tf.setTransplantationPoint(transplantationPoint);
        tf.setTransplant(transplant);
        return tf;
    }

    protected ASTReplace replaceRandom() throws Exception {
        ASTReplace tf = new ASTReplace();
        tf.setTransplantationPoint(findRandomFragmentToReplace(true));
        tf.setTransplant(findRandomFragmentToReplace(false));
        tf.setName("replaceRandom");
        return tf;
    }

    protected ASTAdd addRandom() throws Exception {
        ASTAdd tf = new ASTAdd();
        tf.setTransplantationPoint(findRandomFragmentToReplace(true));
        tf.setTransplant(findRandomFragmentToReplace(false));
        tf.setName("addRandom");
        return tf;
    }

    protected ASTReplace replace(CodeFragment transplantationPoint, boolean varNameMatch) throws Exception {
        ASTReplace tf = new ASTReplace();

        CodeFragment cfReplacedBy = findRandomFragmentCandidate(transplantationPoint, varNameMatch);
        if (cfReplacedBy == null)
            throw new Exception("pas de candidat pour " + transplantationPoint);
        tf.setTransplantationPoint(transplantationPoint);
        tf.setTransplant(cfReplacedBy);
        return tf;
    }

//    public ASTReplace notContextReplace(CodeFragment cfToReplace) throws Exception {
//        Random r = new Random();
//        ASTReplace tf = new ASTReplace();
//        tf.setType("notContextReplace");
//        int size = codeFragments.size();
//        CodeFragment cfReplacedBy = codeFragments.get(r.nextInt(size));
//        tf.setTransplantationPoint(cfToReplace);
//        tf.setCodeFragmentToReplace(cfReplacedBy);
//        return tf;
//    }

    protected ASTAdd addWittgenstein() throws Exception {
        ASTAdd tf = new ASTAdd();
        CodeFragment transplantationPoint = null;
        CodeFragment transplant = null;

        while (transplant == null) {
            transplantationPoint = findRandomFragmentToReplace(true);
            transplant = findRandomFragmentCandidate(transplantationPoint, true);
        }

        tf.setTransplantationPoint(transplantationPoint);
        tf.setTransplant(transplant);
        tf.setName("addWittgenstein");
        return tf;
    }

    protected ASTAdd add() throws Exception {
        ASTAdd tf = new ASTAdd();
        CodeFragment transplantationPoint = null;
        CodeFragment transplant = null;

        while (transplant == null) {
            transplantationPoint = findRandomFragmentToReplace(true);
            transplant = findRandomFragmentCandidate(transplantationPoint, false);
        }
        tf.setTransplantationPoint(transplantationPoint);
        tf.setTransplant(transplant);
        return tf;
    }

    protected ASTAdd addReaction(CodeFragment transplantationPoint) throws Exception {
        ASTAdd tf = new ASTAdd();

        CodeFragment transplant = findRandomFragmentCandidate(transplantationPoint, false);
        if (transplant == null)
            throw new Exception("pas de candidat pour " + transplant);

        tf.setTransplantationPoint(transplantationPoint);
        tf.setTransplant(transplant);
        tf.setName("addReaction");
        return tf;
    }

    protected ASTAdd add(CodeFragment transplantationPoint, boolean varNameMatch) throws Exception {
        ASTAdd tf = new ASTAdd();

        CodeFragment transplant = findRandomFragmentCandidate(transplantationPoint, varNameMatch);
        if (transplant == null)
            throw new Exception("pas de candidat pour " + transplantationPoint);
        tf.setTransplantationPoint(transplantationPoint);
        tf.setTransplant(transplant);
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

        while (withCoverage && getInputProgram().getCoverageReport().codeFragmentCoverage(stmt) == 0)
            stmt = getInputProgram().getCodeFragments().get(r.nextInt(size));
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
                                                       boolean varNameMatch) throws IllegalAccessException, InstantiationException {
        String cfString = cf.equalString();
        List<CodeFragment> list = getAllUniqueCodeFragments().stream()
            .filter(codeFragment -> cf.isReplaceableBy(codeFragment, varNameMatch) && !codeFragment.equalString().equals(cfString))
            .collect(Collectors.toList());

        if (list.isEmpty())
            return null;

        Random r = new Random();
        CtCodeElement tmp = (CtCodeElement) copyElem(list.get(r.nextInt(list.size())).getCtCodeFragment());
        CodeFragment ret = (CodeFragment) codeFragmentClass.newInstance();
        ret.init(tmp);
        return ret;
    }

    protected CtElement copyElem(CtElement elem) {
        Factory factory = elem.getFactory();
        CtElement tmp = factory.Core().clone(elem);
        tmp.setParent(elem.getParent());
        return tmp;
    }

    protected Collection<CodeFragment> getAllUniqueCodeFragments() {
        return getInputProgram().getCodeFragments().getUniqueCodeFragmentList();
    }

    public Collection<Transformation> isstaTransformation(int nb) throws Exception {
        List<Transformation> transformations = new ArrayList<>();
        for(int i = 0; i< nb; i++) {
            ASTReplace replace = replace();
            transformations.add(replace);

            try {
                ASTReplace replaceW = replace(replace.getTransplantationPoint(), true);
                replaceW.setName("replaceWittgenstein");
                transformations.add(replaceW);
            } catch (Exception e) {}

            try {
                ASTReplace replaceReaction = replaceReaction(replace.getTransplantationPoint());
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
                ASTAdd add = add(replace.getTransplantationPoint(), false);
                transformations.add(add);
            } catch (Exception e) {}

            try {
                ASTAdd addW = add(replace.getTransplantationPoint(), true);
                addW.setName("addWittgenstein");
                transformations.add(addW);
            } catch (Exception e) {}

            try {
                ASTAdd addReaction = addReaction(replace.getTransplantationPoint());
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
