package fr.inria.diversify.transformation.query;

import fr.inria.diversify.runner.InputProgram;
import fr.inria.diversify.transformation.AddMethodInvocation;
import fr.inria.diversify.transformation.SwapSubType;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.util.VarFinder;
import spoon.reflect.code.CtAssignment;
import spoon.reflect.code.CtConstructorCall;
import spoon.reflect.code.CtExpression;
import spoon.reflect.code.CtStatement;
import spoon.reflect.declaration.*;
import spoon.reflect.factory.Factory;
import spoon.reflect.reference.CtExecutableReference;
import spoon.reflect.reference.CtTypeReference;
import spoon.support.reflect.code.CtAssignmentImpl;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by nharrand on 06/12/16.
 */
public class SwapSubTypeQuery extends TransformationQuery {
    private List<Map.Entry<CtConstructorCall, CtConstructorCall>> candidates;
    private List<CtType> types;
    private Iterator<Map.Entry<CtConstructorCall, CtConstructorCall>> candidateIt;

    private Map<String,Set<String>> interfaces = new HashMap<>();

    public void init() {

        Set<String> lList = new HashSet<>();
        lList.add("java.util.ArrayList");
        lList.add("java.util.LinkedList");
        lList.add("java.util.Stack");
        lList.add("java.util.Vector");
        lList.add("java.util.concurrent.CopyOnWriteArrayList");
        Set<String> lBlockingDeque = new HashSet<>();
        lBlockingDeque.add("java.util.concurrent.LinkedBlockingDeque");
        Set<String> lDeque = new HashSet<>();
        lDeque.addAll(lBlockingDeque);
        lDeque.add("java.util.ArrayDeque");
        lDeque.add("java.util.LinkedList");
        lDeque.add("java.util.concurrent.ConcurrentLinkedDeque");
        Set<String> lBlockingQueue = new HashSet<>();
        lBlockingQueue.addAll(lBlockingDeque);
        lBlockingQueue.add("java.util.concurrent.ArrayBlockingQueue");
        lBlockingQueue.add("java.util.concurrent.DelayQueue");
        lBlockingQueue.add("java.util.concurrent.LinkedBlockingQueue");
        lBlockingQueue.add("java.util.concurrent.LinkedTransferQueue");
        lBlockingQueue.add("java.util.concurrent.PriorityBlockingQueue");
        lBlockingQueue.add("java.util.concurrent.SynchronousQueue");
        Set<String> lTransferQueue = new HashSet<>();
        lTransferQueue.add("java.util.concurrent.LinkedTransferQueue");
        Set<String> lQueue = new HashSet<>();
        lQueue.addAll(lDeque);
        lQueue.addAll(lBlockingQueue);
        lQueue.addAll(lTransferQueue);
        lQueue.add("java.util.concurrent.ConcurrentLinkedQueue");
        lQueue.add("java.util.concurrent.PriorityBlockingQueue");
        lQueue.add("java.util.concurrent.SynchronousQueue");
        lQueue.add("java.util.PriorityQueue");


        Set<String> lNavigableSet = new HashSet<>();
        lNavigableSet.add("java.util.concurrent.ConcurrentSkipListSet");
        lNavigableSet.add("java.util.TreeSet");
        Set<String> lSortedSet = new HashSet<>();
        lSortedSet.addAll(lNavigableSet);
        Set<String> lSet = new HashSet<>();
        lSet.addAll(lSortedSet);
        lSet.add("java.util.concurrent.CopyOnWriteArraySet");
        lSet.add("java.util.HashSet");
        lSet.add("java.util.LinkedHashSet");

        Set<String> lCollection = new HashSet<>();
        lCollection.addAll(lSet);
        lCollection.addAll(lQueue);
        lCollection.addAll(lList);
        Set<String> lIterable = new HashSet<>();
        lIterable.addAll(lCollection);

        Set<String> lConcurrentNavigableMap = new HashSet<>();
        lConcurrentNavigableMap.add("java.util.concurrent.ConcurrentSkipListMap");
        Set<String> lConcurrentMap = new HashSet<>();
        lConcurrentMap.addAll(lConcurrentNavigableMap);
        lConcurrentMap.add("java.util.concurrent.ConcurrentHashMap");
        Set<String> lNavigableMap = new HashSet<>();
        lNavigableMap.addAll(lConcurrentNavigableMap);
        lNavigableMap.add("java.util.TreeMap");
        Set<String> lSortedMap = new HashSet<>();
        lSortedMap.addAll(lNavigableMap);
        Set<String> lMap = new HashSet<>();
        lMap.addAll(lConcurrentMap);
        lMap.addAll(lSortedMap);
        lMap.add("java.util.HashMap");
        lMap.add("java.util.Hashtable");
        lMap.add("java.util.HashMap");
        lMap.add("java.util.LinkedHashMap");
        lMap.add("java.util.WeakHashMap");


        interfaces.put("java.util.List", lList);
        interfaces.put("java.util.concurrent.BlockingDeque", lBlockingDeque);
        interfaces.put("java.util.Deque", lDeque);
        interfaces.put("java.util.concurrent.BlockingQueue", lBlockingQueue);
        interfaces.put("java.util.concurrent.TransferQueue", lTransferQueue);
        interfaces.put("java.util.Queue", lQueue);
        interfaces.put("java.util.NavigableSet", lNavigableSet);
        interfaces.put("java.util.SortedSet", lSortedSet);
        interfaces.put("java.util.Set", lSet);
        interfaces.put("java.util.Collection", lCollection);
        interfaces.put("java.util.Iterable", lIterable);
        interfaces.put("java.util.concurrent.ConcurrentNavigableMap", lConcurrentNavigableMap);
        interfaces.put("java.util.concurrent.ConcurrentMap", lConcurrentMap);
        interfaces.put("java.util.NavigableMap", lNavigableMap);
        interfaces.put("java.util.SortedMap", lSortedMap);
        interfaces.put("java.util.Map", lMap);
    }

    public SwapSubTypeQuery(InputProgram inputProgram) {
        super(inputProgram);
        /*CtClass cl;
        Collection<CtType> ts = getInputProgram().getAllElement(CtType.class);
        types = new LinkedList<CtType>(ts.stream().filter(
                t -> !((CtType)t).getModifiers().contains(ModifierKind.PRIVATE) && !((CtType)t).getModifiers().contains(ModifierKind.STATIC)
        ).collect(Collectors.toList()));*/
        init();
        findCandidates();
        candidateIt = candidates.iterator();
    }

    private boolean parametersMatch(CtConstructorCall curCall, CtExecutableReference candidate) {
        if(curCall.getArguments().size() != candidate.getParameters().size()) return false;
        List<CtExpression> args = curCall.getArguments();
        List<CtTypeReference> params = candidate.getParameters();
        for(int i = 0; i < args.size(); i++) {
            if(!args.get(i).getType().equals(params.get(i))) return false;
        }
        return true;
    }

    private void findCandidates() {
        candidates = new ArrayList<>();
        System.out.println(" --- Search for for Candidates --- ");
        Collection<CtConstructorCall> calls = getInputProgram().getAllElement(CtConstructorCall.class);
        int collections = 0;
        int skipped = 0;
        List<CtConstructorCall> colCalls = new ArrayList<>();
        List<CtConstructorCall> skippedCalls = new ArrayList<>();
        for(CtConstructorCall call : calls) {
            Factory f = call.getFactory();
            //System.out.println("c: " + call + " in " + ((CtClass) call.getParent(CtClass.class)).getSimpleName());
            CtTypedElement parent = call.getParent(CtTypedElement.class);
            skipped++;
            skippedCalls.add(call);
            if(parent.getType().getModifiers().contains(ModifierKind.STATIC)) continue;
            if(call.getType().getModifiers().contains(ModifierKind.STATIC)) continue;
            //if(call.getType().getActualClass() == parent.getType().getActualClass()) continue;
            if(call.getType().getQualifiedName() == parent.getType().getQualifiedName()) continue;
            skipped--;
            skippedCalls.remove(call);
            //System.out.println("Expect: " + parent.getType() + " -> found: " + call.getType());https://docs.oracle.com/javase/7/docs/api/java/util/concurrent/BlockingDeque.html
            if(interfaces.keySet().contains(parent.getType().getQualifiedName())) {
            /*if(parent.getType().getQualifiedName().startsWith("java.util.List")
                    || parent.getType().getQualifiedName().startsWith("java.util.Set")
                    || parent.getType().getQualifiedName().startsWith("java.util.Collection")
                    || parent.getType().getQualifiedName().startsWith("java.util.Iterable")
                    || parent.getType().getQualifiedName().startsWith("java.util.Map")
                    || parent.getType().getQualifiedName().startsWith("java.util.concurrent.BlockingDeque")

                    || parent.getType().getQualifiedName().startsWith("java.util.concurrent.BlockingDeque")
                    || parent.getType().getQualifiedName().startsWith("java.util.concurrent.BlockingQueue")
                    || parent.getType().getQualifiedName().startsWith("java.util.Deque")
                    || parent.getType().getQualifiedName().startsWith("java.util.NavigableSet")
                    || parent.getType().getQualifiedName().startsWith("java.util.SortedSet")
                    || parent.getType().getQualifiedName().startsWith("java.util.concurrent.TransferQueue")
                    || parent.getType().getQualifiedName().startsWith("java.util.concurrent.ConcurrentMap")
                    || parent.getType().getQualifiedName().startsWith("java.util.concurrent.ConcurrentNavigableMap")
                    || parent.getType().getQualifiedName().startsWith("java.util.NavigableMap")
                    || parent.getType().getQualifiedName().startsWith("java.util.SortedMap")

                    || parent.getType().getQualifiedName().startsWith("java.util.Queue")) {*/
                String type = call.getType().getActualTypeArguments().stream().
                        map(Object::toString).
                        collect(Collectors.joining(",")).toString();
                String param = call.getArguments().stream().
                        map(Object::toString).
                        collect(Collectors.joining(",")).toString();

                collections++;
                colCalls.add(call);

                for(CtConstructorCall c : buildConstructorCall(call, interfaces.get(parent.getType().getQualifiedName()), type, param)) {
                    candidates.add(new HashMap.SimpleEntry<>(call, c));
                }
            }


        }
        System.out.println(" --- Done (" + candidates.size() + " coll: " + collections + " skipped: " + skipped + ") --- ");
    }

    public List<CtConstructorCall> buildConstructorCall(CtConstructorCall call, Set<String> l, String type, String param) {
        Factory f = call.getFactory();
        List<CtConstructorCall> res = new ArrayList<>();
        for(String c : l) {
            if(!call.getType().getQualifiedName().equals(c)) {
                try {
                    res.add((CtConstructorCall) f.Code().createCodeSnippetExpression("new " + c + "<" + type + ">("+ param + ")").compile());
                } catch (Exception ex) {}
            }
        }
        return res;
    }

    /*public List<CtConstructorCall> buildReplacementConstructorCall(CtConstructorCall call, String parent) {
        String args = call.getType().getActualTypeArguments().stream().
                map(Object::toString).
                collect(Collectors.joining(",")).toString();
        String args2 = call.getArguments().stream().
                map(Object::toString).
                collect(Collectors.joining(",")).toString();
        List<String> l = new ArrayList<>();
        List<String> lList = new ArrayList<>();
        lList.add("java.util.ArrayList");
        lList.add("java.util.LinkedList");
        lList.add("java.util.Stack");
        lList.add("java.util.Vector");
        lList.add("java.util.concurrent.CopyOnWriteArrayList");
        List<String> lSet = new ArrayList<>();
        lSet.add("java.util.concurrent.ConcurrentSkipListSet");
        lSet.add("java.util.concurrent.CopyOnWriteArraySet");
        lSet.add("java.util.HashSet");
        lSet.add("java.util.LinkedHashSet");
        lSet.add("java.util.TreeSet");
        List<String> lQueue = new ArrayList<>();
        lQueue.add("java.util.ArrayDeque");
        lQueue.add("java.util.concurrent.ConcurrentLinkedDeque");
        lQueue.add("java.util.concurrent.ConcurrentLinkedQueue");
        lQueue.add("java.util.concurrent.DelayQueue");
        lQueue.add("java.util.concurrent.LinkedBlockingDeque");
        lQueue.add("java.util.concurrent.LinkedTransferQueue");
        lQueue.add("java.util.concurrent.PriorityBlockingQueue");
        lQueue.add("java.util.concurrent.SynchronousQueue");
        lQueue.add("java.util.LinkedList");
        lQueue.add("java.util.PriorityQueue");
        List<String> lMap = new ArrayList<>();
        l.add("java.util.concurrent.ConcurrentHashMap");
        l.add("java.util.concurrent.ConcurrentSkipListMap");
        l.add("java.util.HashMap");
        l.add("java.util.Hashtable");
        l.add("java.util.HashMap");
        l.add("java.util.LinkedHashMap");
        l.add("java.util.TreeMap");
        l.add("java.util.WeakHashMap");
        switch (parent) {
            case "java.util.List":
                l.addAll(lList);
                break;
            case "java.util.Set":
                l.addAll(lSet);
                break;
            case "java.util.Collection":
                l.addAll(lList);
                l.addAll(lSet);
                l.addAll(lQueue);
                break;
            case "java.util.Iterable":
                l.addAll(lList);
                l.addAll(lSet);
                l.addAll(lQueue);
                break;
            case "java.util.Map":
                l.addAll(lMap);
                break;
            case "java.util.Queue":
                l.addAll(lQueue);
                break;
        }

        return buildConstructorCall(call,l,args,args2);
    }*/


    @Override
    public Transformation query() throws QueryException {
        //try {
            Map.Entry<CtConstructorCall, CtConstructorCall> cur = candidateIt.next();
            CtConstructorCall tp = cur.getKey();
            CtConstructorCall c = cur.getValue();
            /*Factory f = tp.getFactory();
            List<CtExpression> params = tp.getArguments();
            CtExpression[] array = params.toArray(new CtExpression[params.size()]);
            CtConstructorCall cc = f.Code().createConstructorCall(c.getType(), array);
            return new SwapSubType(tp, cc);*/
        return new SwapSubType(tp, c);
        /*} catch (Exception e) {
            throw new QueryException("No valid candidate");
        }*/
    }
    //

    @Override
    public boolean hasNextTransformation() {
        return (candidateIt.hasNext());
    }
}
