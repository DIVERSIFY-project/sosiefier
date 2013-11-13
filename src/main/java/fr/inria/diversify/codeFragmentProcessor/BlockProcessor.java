package fr.inria.diversify.codeFragmentProcessor;

import fr.inria.diversify.codeFragment.Block;
import spoon.reflect.code.CtBlock;
import spoon.reflect.code.CtStatement;

/**
 * User: Simon
 * Date: 5/3/13
 * Time: 4:15 PM
 */
public class BlockProcessor  extends AbstractCodeFragmentProcessor<CtBlock> {

    @Override
    public void process(CtBlock element) {
        try {
            if(isValidStatement(element)) {
                Block block = new Block(element);
                addCf(block);
//				System.out.println(block);
//				System.out.println(block.getInputContext().equalString());
//				System.out.println("-------------------------------\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private boolean isValidStatement(CtStatement element) {
        return true;
    }
}
