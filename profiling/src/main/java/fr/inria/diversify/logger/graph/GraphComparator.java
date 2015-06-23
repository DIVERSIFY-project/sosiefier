package fr.inria.diversify.logger.graph;

import fr.inria.diversify.buildSystem.AbstractBuilder;
import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.logger.Comparator;
import fr.inria.diversify.transformation.SingleTransformation;
import spoon.reflect.cu.SourcePosition;

import java.util.*;

/**
 * User: Simon
 * Date: 23/06/15
 * Time: 15:12
 */
public class GraphComparator implements Comparator {
    @Override
    public void init(InputProgram originalInputProgram, AbstractBuilder originalBuilder) throws Exception {

    }

    @Override
    public Object compare(SingleTransformation transformation, String originalLogDir, String sosieLogDir) throws Exception {
        BuildGraph builder = new BuildGraph(originalLogDir);
        Collection<Graph> originalGraphs = builder.load();

        builder = new BuildGraph(sosieLogDir);
        Collection<Graph> sosieGraphs = builder.load();

        Map<String, Map<String, Set<String>>> diff = new HashMap<>();
        for(Graph oGraph : originalGraphs) {
            Graph sGraph = sosieGraphs.stream()
                    .filter(g -> g.getName().equals(oGraph.getName()))
                    .findFirst()
                    .get();
            Map<String, Set<String>> gDiff = oGraph.diff(sGraph);
            if(!gDiff.isEmpty()) {
                diff.put(sGraph.getName(), oGraph.diff(sGraph));
            }
        }
        return diff;
    }

    @Override
    public Collection<String> selectTest(SourcePosition position) {
        return new ArrayList<>();
    }
}
