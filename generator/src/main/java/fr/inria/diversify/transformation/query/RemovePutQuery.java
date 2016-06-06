package fr.inria.diversify.transformation.query;

import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.runner.InputProgram;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.ast.ASTDelete;
import spoon.reflect.code.CtBlock;
import spoon.reflect.code.CtIf;
import spoon.reflect.code.CtLoop;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


/**
 * User: Simon
 * Date: 30/05/16
 * Time: 11:09
 */
public class RemovePutQuery extends ADRTransformationQuery {
    List<CodeFragment> putList;

    public RemovePutQuery(InputProgram inputProgram) {
        super(inputProgram);
        putList = initPutList(true);
        Collections.shuffle(putList);
    }

    public Transformation query() {
        ASTDelete delete = new ASTDelete();

        delete.setTransplantationPoint(putList.remove(random.nextInt(putList.size())));
        return delete;
    }

    public boolean hasNextTransformation() {
        return !putList.isEmpty();
    }

    protected List<CodeFragment> initPutList(boolean withCoverage) {
        return getInputProgram().getCodeFragments().stream()
                .filter(cf -> !(cf.getCtCodeFragment() instanceof CtBlock
                        || cf.getCtCodeFragment() instanceof CtLoop
                        || cf.getCtCodeFragment() instanceof CtIf))
                .filter(cf -> !withCoverage|| getInputProgram().getCoverageReport().codeFragmentCoverage(cf) != 0)
                .filter(cf -> cf.getCtCodeFragment().toString().contains(".put("))
                .collect(Collectors.toList());

    }
}
