package fr.inria.diversify.transformation.query;

import fr.inria.diversify.runner.InputProgram;
import fr.inria.diversify.transformation.AddMethodInvocation;
import fr.inria.diversify.transformation.SwapSubType;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.util.VarFinder;
import spoon.reflect.code.*;
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
    //private List<Map.Entry<CtConstructorCall, CtConstructorCall>> candidates;
    private List<Map.Entry<CtConstructorCall, CtCodeSnippetExpression>> candidates;
    private List<CtType> types;
    //private Iterator<Map.Entry<CtConstructorCall, CtConstructorCall>> candidateIt;
    private Iterator<Map.Entry<CtConstructorCall, CtCodeSnippetExpression>> candidateIt;

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

        commonsCollection();
    }


    public void commonsCollection() {

        Set<String> lList = interfaces.get("java.util.List");
        lList.add("org.apache.commons.collections4.list.TreeList");
        lList.add("org.apache.commons.collections4.list.GrowthList");
        lList.add("org.apache.commons.collections4.list.NodeCachingLinkedList");
        lList.add("org.apache.commons.collections4.list.CursorableLinkedList");
        lList.add("org.apache.commons.collections4.ArrayStack");

        Set<String> lSet = interfaces.get("java.util.Set");
        lSet.add("org.apache.commons.collections4.set.ListOrderedSet");

        //        Bag
        //org.apache.commons.collections4.bag.HashBag
        //org.apache.commons.collections4.bag.TreeBag

        Set<String> lQueue = interfaces.get("java.util.Queue");
        lQueue.add("org.apache.commons.collections4.queue.CircularFifoQueue");

        Set<String> lMap = interfaces.get("java.util.Map");
        lMap.add("org.apache.commons.collections4.map.CaseInsensitiveMap");
        lMap.add("org.apache.commons.collections4.map.Flat3Map");
        lMap.add("org.apache.commons.collections4.map.HashedMap");
        lMap.add("org.apache.commons.collections4.map.LRUMap");
        lMap.add("org.apache.commons.collections4.map.LinkedMap");
        lMap.add("org.apache.commons.collections4.map.ListOrderedMap");
        lMap.add("org.apache.commons.collections4.map.PassiveExpiringMap");
        lMap.add("org.apache.commons.collections4.map.ReferenceIdentityMap");
        lMap.add("org.apache.commons.collections4.map.ReferenceMap");
        lMap.add("org.apache.commons.collections4.map.SingletonMap");
        lMap.add("org.apache.commons.collections4.map.StaticBucketMap");

    }

    public SwapSubTypeQuery(InputProgram inputProgram) {
        super(inputProgram);
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
            try {
                Factory f = call.getFactory();
                CtTypedElement parent = call.getParent(CtTypedElement.class);
                skipped++;
                skippedCalls.add(call);
                if (parent.getType() == null) continue;
                if (parent.getType().getModifiers().contains(ModifierKind.STATIC)) continue;
                if (call.getType().getModifiers().contains(ModifierKind.STATIC)) continue;

                if (call.getType().getQualifiedName() == parent.getType().getQualifiedName()) continue;
                skipped--;
                skippedCalls.remove(call);

                if (interfaces.keySet().contains(parent.getType().getQualifiedName())) {
                    //String type = call.getType().getActualTypeArguments().stream().
                    //        map(Object::toString).
                    //       collect(Collectors.joining(",")).toString();
                    String type = parent.getType().getActualTypeArguments().stream().
                            map(Object::toString).
                            collect(Collectors.joining(",")).toString();
                    String param = call.getArguments().stream().
                            map(Object::toString).
                            collect(Collectors.joining(",")).toString();

                    collections++;
                    colCalls.add(call);

                    for (CtCodeSnippetExpression c : buildConstructorCall(call, interfaces.get(parent.getType().getQualifiedName()), type, param)) {
                        candidates.add(new HashMap.SimpleEntry<>(call, c));
                    }
                }
            } catch (spoon.support.SpoonClassNotFoundException e) {}

        }
        System.out.println(" --- Done (" + candidates.size() + " coll: " + collections + " skipped: " + skipped + ") --- ");
    }

    public List<CtCodeSnippetExpression> buildConstructorCall(CtConstructorCall call, Set<String> l, String type, String param) {
    //public List<CtConstructorCall> buildConstructorCall(CtConstructorCall call, Set<String> l, String type, String param) {
        Factory f = call.getFactory();
        //List<CtConstructorCall> res = new ArrayList<>();
        List<CtCodeSnippetExpression> res = new ArrayList<>();
        for(String c : l) {
            if(!call.getType().getQualifiedName().equals(c)) {
                //try {
                    //res.add((CtConstructorCall) f.Code().createCodeSnippetExpression("new " + c + "<" + type + ">("+ param + ")").compile());
                    res.add(f.Code().createCodeSnippetExpression("new " + c + "<" + type + ">(" + param + ")"));
                //} catch (Exception ex) {}
            }
        }
        return res;
    }



    @Override
    public Transformation query() throws QueryException {
        //Map.Entry<CtConstructorCall, CtConstructorCall> cur = candidateIt.next();
        Map.Entry<CtConstructorCall, CtCodeSnippetExpression> cur = candidateIt.next();
        CtConstructorCall tp = cur.getKey();
        CtCodeSnippetExpression c = cur.getValue();
        SwapSubType swapSubType = new SwapSubType();
        swapSubType.setTpAndNewCall(tp, c);
        return swapSubType;
        //return new SwapSubType(tp, c);
    }

    @Override
    public boolean hasNextTransformation() {
        return (candidateIt.hasNext());
    }
}
