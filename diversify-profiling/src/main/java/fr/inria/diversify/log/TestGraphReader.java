package fr.inria.diversify.log;

import fr.inria.diversify.log.graph.Graph;
import fr.inria.diversify.logger.KeyWord;

import java.io.File;
import java.io.IOException;
import java.util.*;

/**
 * User: Simon
 * Date: 26/08/16
 * Time: 15:48
 */
public class TestGraphReader extends LogParser<List<Graph>> {
    protected Map<String, Graph> graphByTest;
    protected String currentTest;
//    protected Map<Integer, MethodCoverage> idToMethod;
    List<String> methodsCall;


    public TestGraphReader() {
        result = new ArrayList<>();
        graphByTest = new HashMap<>();
        methodsCall = new LinkedList();
    }

    @Override
    public void readLogLine(String logLine) {
        String[] split = logLine.split(";");
        switch (split[0]) {
            case KeyWord.testStartObservation:
                currentTest = split[1];
                break;
            case KeyWord.testEndObservation:
                if (currentTest != null) {
                    buildGraph(currentTest, methodsCall);
                }
                currentTest = null;
                methodsCall.clear();
                break;
            case KeyWord.methodCallObservation:
                methodsCall.add(logLine);
                break;
            default:
                break;
        }
    }

    protected void buildGraph(String currentTest, List<String> methodsCall) {
        Graph graph = getOrBuildGraph(currentTest);
        Stack<String> stack = new Stack<>();

        for(String methodCall : methodsCall) {
            String[] split = methodCall.split(KeyWord.simpleSeparator);
            int deep = Integer.parseInt(split[1]);
            String name = ids.get(split[2]);

            while(stack.size() >= deep) {
                stack.pop();
            }

            if(stack.isEmpty()) {
                graph.addNode(name);
            } else {
                graph.addCall(stack.peek(), name);
            }
            stack.push(name);
        }
    }
    protected Graph getOrBuildGraph(String name) {
        if (!graphByTest.containsKey(name)) {
            Graph graph = new Graph(name);
            graphByTest.put(name, graph);
            result.add(graph);
        }
        return graphByTest.get(name);
    }


    @Override
    public void init(File dir) throws IOException {
//        idToMethod = new HashMap<>();
//        File infoFile = new File(dir + "/info");
//        BufferedReader br = new BufferedReader(new FileReader(infoFile));
//
//        String line = br.readLine();
//        while (line != null) {
//            if(!line.startsWith("id")) {
//                String[] split = line.split(";");
//                Integer methodId = Integer.parseInt(split[0]);
//                String[] branches = new String[split.length - 2];
//                for(int i = 2; i < split.length; i++) {
//                    branches[i - 2] = Pool.get(split[i]);
//                }
//                MethodCoverage methodCoverage = new MethodCoverage(methodId, split[1], branches);
//                idToMethod.put(methodId, methodCoverage);
//            }
//            line = br.readLine();
//        }
    }

    @Override
    public void newLogFile(File file) {

    }
}
