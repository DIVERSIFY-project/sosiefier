package fr.inria.diversify.codeFragmentProcessor;

import fr.inria.diversify.codeFragment.Block;
import fr.inria.diversify.codeFragment.CodeFragmentList;
import spoon.processing.AbstractProcessor;
import spoon.reflect.code.CtBlock;
import spoon.reflect.code.CtStatement;

/**
 * User: Simon
 * Date: 5/3/13
 * Time: 4:15 PM
 */
public class BlockProcessor  extends AbstractProcessor<CtBlock> {
protected CodeFragmentList blocks;

    public BlockProcessor() {
        blocks = new CodeFragmentList();
    }

    @Override
    public void process(CtBlock element) {
        try {
            if(isValidStatement(element)) {
                Block block = new Block(element);
                blocks.add(block);
				System.out.println(block);
				System.out.println(block.getInputContext().equalString());
				System.out.println("-------------------------------\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private boolean isValidStatement(CtStatement element) {
        return true;
    }

    public CodeFragmentList getBlocks() {
        return blocks;
    }
}
