package fr.inria.diversify.statistic;

import fr.inria.diversify.CodeFragmentList;
import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.codeFragment.Statement;
import fr.inria.diversify.transformation.*;
import fr.inria.diversify.transformation.ast.ASTAdd;
import fr.inria.diversify.transformation.ast.ASTDelete;
import fr.inria.diversify.transformation.ast.ASTReplace;
import fr.inria.diversify.transformation.query.ast.ASTTransformationQuery;
import spoon.reflect.Factory;
import spoon.reflect.code.CtFieldAccess;
import spoon.reflect.code.CtStatement;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.reference.CtVariableReference;

import java.math.BigInteger;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * User: Simon
 * Date: 5/29/13
 * Time: 2:14 PM
 */
public class Util {
    protected CodeFragmentList codeFragments;

    public Util(CodeFragmentList list) {
        codeFragments = list;
    }

    public long numberOfNotDiversification() throws InterruptedException {
        final List<Object> list = new LinkedList<Object>();
        ExecutorService pool = Executors.newFixedThreadPool(50);
        for (CodeFragment cf1 : codeFragments) {
            final CodeFragment cfTmp = cf1;

            pool.submit(new Runnable() {
                @Override
                public void run() {
                    if(findCandidate(cfTmp).isEmpty())
                    synchronized (list) {list.add(true);}
                }
            });
        }

        pool.shutdown();
        pool.awaitTermination(10, TimeUnit.DAYS);
        return list.size();
    }

    public BigInteger numberOfDiversification() throws InterruptedException {
        final List<Object> list = new LinkedList<Object>();
        ExecutorService pool = Executors.newFixedThreadPool(50);
        for (CodeFragment cf1 : codeFragments) {
            final  CodeFragment cfTmp = cf1;
            pool.submit(new Runnable() {
                @Override
                public void run() {
                    BigInteger nb = new BigInteger("0");
                    for (CodeFragment cf2 : findCandidate(cfTmp)) {
                        nb = nb.add(getNumberOfVarMapping(cfTmp,cf2));
                    }
                    synchronized (list) {list.add(nb);}
                }
            });
        }
        pool.shutdown();
        pool.awaitTermination(10, TimeUnit.SECONDS);
        BigInteger result = new BigInteger("0");

        for(Object number : list)
            result = result.add((BigInteger)number);

        return result;
    }

    public List<CodeFragment> findCandidate(CodeFragment cf) {
        List<CodeFragment> list = new ArrayList<CodeFragment>();
        for (CodeFragment statement : codeFragments.getUniqueCodeFragmentList())
            if (cf.isReplace(statement) && !statement.equalString().equals(cf.equalString()))
                list.add(statement);

        return list;
    }

    protected BigInteger getNumberOfVarMapping(CodeFragment before, CodeFragment after) {
        BigInteger nb = new BigInteger("1");

        for (CtVariableReference<?> variable : after.getInputContext().getLocalVar()) {
            BigInteger tmp = new BigInteger(before.getInputContext().allCandidate(variable.getType()).size()+"");
            nb = nb.multiply(tmp);
        }
        for (CtFieldAccess<?> variable : after.getInputContext().getField()) {
            BigInteger tmp = new BigInteger(before.getInputContext().allCandidateForFieldAccess(variable.getType()).size()+"");
            nb = nb.multiply(tmp);
        }
        return nb;
    }

    public Set<ITransformation> getStupidTransformation(int nb, ASTTransformationQuery query) {
        Set<ITransformation> transformations = new HashSet<ITransformation>();
        for(int i = 0; i < nb; i++) {
            try {
                ASTReplace replace = query.replace();
                CodeFragment position = replace.getPosition();

                transformations.add(replace);
                ASTReplace stupidReplace = query.replace(position);
                stupidReplace.setType("stupidReplace");
                transformations.add(stupidReplace);
                transformations.add(query.veryStupidReplace(position));

                transformations.add(query.add(position));
                ASTAdd stupidASTAdd = query.add(position);
                stupidASTAdd.setType("stupidAdd");
                transformations.add(stupidASTAdd);
                transformations.add(query.veryStupidAdd(position));

                transformations.add(query.delete(position));

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return  transformations;
    }

    public Set<ITransformation> getAllReplace() throws InterruptedException {
        final Set<ITransformation> allReplace = new HashSet<ITransformation>();
        ExecutorService pool = Executors.newFixedThreadPool(50);
        for (CodeFragment cf1 : codeFragments) {
                final  CodeFragment cfTmp = cf1;
                pool.submit(new Runnable() {
                    @Override
                    public void run() {
                        for (CodeFragment cf2 : findCandidate(cfTmp)) {
                            for (Map<String, String> varMapping : getAllVarMapping(cfTmp, cf2)) {
                                ASTReplace r = new ASTReplace();
                                CtStatement tmp = (CtStatement) copyElem(cf2.getCtCodeFragment());
                                r.addCodeFragmentToReplace(cfTmp, new Statement(tmp));
                                r.addVarMapping(cfTmp, varMapping);
                                synchronized (allReplace) {
                                    allReplace.add(r);
                                }
                            }
                        }
                    }
                });
            }
        pool.shutdown();
        pool.awaitTermination(10, TimeUnit.SECONDS);

        return allReplace;
    }

    public Set<ITransformation> getAllDelete() {
        Set<ITransformation> allReplace = new HashSet<ITransformation>();

        for (CodeFragment cf1 : codeFragments) {
                    ASTDelete r = new ASTDelete();
                    r.addCodeFragmentToTransform(cf1);
                    allReplace.add(r);
        }
        return allReplace;
    }

    public Set<ITransformation> getAllAdd() throws InterruptedException {
        final Set<ITransformation> allReplace = new HashSet<ITransformation>();
        ExecutorService pool = Executors.newFixedThreadPool(50);
        for (CodeFragment cf1 : codeFragments) {
            final  CodeFragment cfTmp = cf1;
            pool.submit(new Runnable() {
                @Override
                public void run() {
                    for (CodeFragment cf2 : findCandidate(cfTmp)) {
                        for (Map<String,String> varMapping : getAllVarMapping(cfTmp,cf2)) {
                            ASTAdd r = new ASTAdd();
                            CtStatement tmp = (CtStatement) copyElem(cf2.getCtCodeFragment());
                            r.addCodeFragmentToAdd(cfTmp,new Statement(tmp));
                            r.addVarMapping(cfTmp,varMapping);
                            synchronized (allReplace) {
                                allReplace.add(r);
                            }
                        }
                    }
                }
            });
        }
        pool.shutdown();
        pool.awaitTermination(10, TimeUnit.SECONDS);

        return allReplace;
    }

    protected List<Map<String, String>> getAllVarMapping(CodeFragment before, CodeFragment after) {
        List<List<String>> vars = new ArrayList<List<String>>();

        for (CtVariableReference<?> variable : after.getInputContext().getLocalVar()) {
            List<String> mapping = new ArrayList<String>();
            vars.add(mapping);
            for (Object candidate : before.getInputContext().allCandidate(variable.getType()))
                    mapping.add(variable.toString()+"==="+candidate.toString() );

        }
        for (CtFieldAccess<?> variable : after.getInputContext().getField()) {
            List<String> mapping = new ArrayList<String>();
            vars.add(mapping);
            for (Object candidate : before.getInputContext().allCandidateForFieldAccess(variable.getType()))
                mapping.add(variable.getVariable().toString()+"==="+candidate.toString() );

        }
        return computeVarMapping(vars);
    }

    protected List<Map<String, String>> computeVarMapping(List<List<String>> vars) {
        List<Map<String, String>> map = new ArrayList<Map<String, String>>();
        if(vars.isEmpty())
            return map;
        if(vars.size() == 1) {
            for(String var : vars.get(0)) {
                String[] mapping = var.split("===");
                if(mapping.length == 2) {
                    Map<String,String> tmp = new HashMap<String, String>();
                    tmp.put(mapping[0],mapping[1]);
                    map.add(tmp);
                }
            }
        }
        else {
            List<String> currentVar = vars.get(0);
            vars.remove(currentVar);
            List<Map<String, String>> currentMapping = computeVarMapping(vars);
            for(String var : currentVar) {
                String[] mapping = var.split("===");
                for (Map<String,String> m : currentMapping) {
                    try {
                        HashMap<String, String> tmp = new HashMap<String, String>(m);
                        if(mapping.length == 0)
                            tmp.put("","");
                        else
                            tmp.put(mapping[0],mapping[1]);
                        map.add(tmp);
                    } catch (Exception e) {}

                }
            }
            return map;
        }
        return map;
    }

    protected CtElement copyElem(CtElement elem) {
        Factory factory = elem.getFactory();
        CtElement tmp = factory.Core().clone(elem);
        tmp.setParent(elem.getParent());
        return tmp;
    }

//    protected Map<?, Long> numberOfDiversificationFor(Map<?, List<CodeFragment>> map) {
//        Map<Object, Long> result =  new HashMap<Object, Long>();
//        for (Object key : map.keySet()) {
//            Long nb = Long.valueOf(0);
//            for (CodeFragment cf1 : map.get(key)) {
//                for (CodeFragment cf2 : findCandidate(cf1)) {
//                    nb = nb + getNumberOfVarMapping(cf1,cf2);
//                }
//            }
//            result.put(key,nb);
//        }
//        return result;
//    }
}
