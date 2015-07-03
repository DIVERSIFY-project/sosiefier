package fr.inria.diversify.logger.graph;

import fr.inria.diversify.buildSystem.AbstractBuilder;
import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.logger.Comparator;
import fr.inria.diversify.logger.Diff;
import fr.inria.diversify.transformation.SingleTransformation;
import spoon.reflect.cu.SourcePosition;

import java.util.*;

/**
 * User: Simon
 * Date: 23/06/15
 * Time: 15:12
 */
public class GraphsComparator implements Comparator {
    @Override
    public void init(InputProgram originalInputProgram, AbstractBuilder originalBuilder) throws Exception {

    }

    @Override
    public Diff compare(SingleTransformation transformation, String originalLogDir, String sosieLogDir) throws Exception {
        GraphReader builder = new GraphReader(originalLogDir);
        Collection<Graph> originalGraphs = builder.load();

        builder = new GraphReader(sosieLogDir);
        Collection<Graph> sosieGraphs = builder.load();

        GraphsDiff diff = new GraphsDiff();
        for(Graph oGraph : originalGraphs) {
            Graph sGraph = sosieGraphs.stream()
                    .filter(g -> g.getName().equals(oGraph.getName()))
                    .findFirst()
                    .get();
            GraphsDiff gDiff = oGraph.diff(sGraph);
            if(gDiff.size() != 0) {
                diff.merge(gDiff);
            }
        }
        return diff;
    }

    @Override
    public Collection<String> selectTest(SourcePosition position) {
        return new ArrayList<>();
    }

    @Override
    public Diff getEmptyDiff() {
        return new GraphsDiff();
    }
}
