package fr.inria.diversify.statistic;

import fr.inria.diversify.codeFragment.CodeFragmentList;
import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.codeFragment.Statement;
import fr.inria.diversify.coverage.ICoverageReport;
import fr.inria.diversify.transformation.*;
import fr.inria.diversify.transformation.ast.ASTAdd;
import fr.inria.diversify.transformation.ast.ASTDelete;
import fr.inria.diversify.transformation.ast.ASTReplace;
import fr.inria.diversify.util.Log;
import spoon.reflect.code.CtStatement;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.factory.Factory;
import spoon.reflect.reference.CtVariableReference;

import java.math.BigInteger;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

/**
 * User: Simon
 * Date: 5/29/13
 * Time: 2:14 PM
 */
public class ComputeAllPossibleTransformation {
    protected List<CodeFragment> codeFragments;

    protected boolean subType;

    public ComputeAllPossibleTransformation(CodeFragmentList list, ICoverageReport coverageReport) {
        Log.debug("nb of statement: {}:", list.size());
        codeFragments = list.stream()
            .filter(fragment -> coverageReport.codeFragmentCoverage(fragment) != 0)
            .collect(Collectors.toList());
        Log.debug("nb of statement: {}:", codeFragments.size());
    }

    public long numberOfNotDiversification() throws InterruptedException {
        final List<Object> list = new LinkedList<Object>();
        ExecutorService pool = Executors.newFixedThreadPool(50);
        for (CodeFragment cf1 : codeFragments) {
            final CodeFragment cfTmp = cf1;

            pool.submit(new Runnable() {
                @Override
                public void run() {
                    if(findCandidate(cfTmp, false ,subType).isEmpty())
                    synchronized (list) {list.add(true);}
                }
            });
        }

        pool.shutdown();
        pool.awaitTermination(10, TimeUnit.DAYS);
        return list.size();
    }

    static BigInteger max = new BigInteger("0");
    public BigInteger numberOfNotDiversification(CodeFragment cf) {
        BigInteger nb = new BigInteger("0");

        for (CodeFragment cf2 : findCandidate(cf, false, subType)) {
            BigInteger tmp = getNumberOfVarMapping(cf, cf2);
            nb = nb.add(tmp);
            if(max.compareTo(tmp) < 0) {
                max = tmp;
                Log.debug("{}\ntransplantationPoint: {}\n {}",tmp, cf.getInputContext().equalString() ,cf);
                Log.debug("replace/add:{}\n{}\n",  cf2.getInputContext().equalString(), cf2);
            }
        }
        return nb;
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
                    for (CodeFragment cf2 : findCandidate(cfTmp, false, subType)) {
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

    public List<CodeFragment> findCandidate(CodeFragment cf, boolean varNameMatch, boolean subType) {
        List<CodeFragment> list = new ArrayList<CodeFragment>();
        for (CodeFragment statement : codeFragments)
            if (cf.isReplaceableBy(statement, varNameMatch, subType) && !statement.equalString().equals(cf.equalString()))
                list.add(statement);

        return list;
    }


    protected BigInteger getNumberOfVarMapping(CodeFragment before, CodeFragment after) {
        BigInteger nb = new BigInteger("1");

        for (CtVariableReference<?> variable : after.getInputContext().getVar()) {
            BigInteger tmp = new BigInteger(before.getInputContext().allCandidate(variable.getType(), subType).size()+"");
            nb = nb.multiply(tmp);
        }
        return nb;
    }

    public Set<Transformation> getAllReplace() throws InterruptedException {
        final Set<Transformation> allReplace = new HashSet<Transformation>();
        ExecutorService pool = Executors.newFixedThreadPool(50);
        for (CodeFragment cf1 : codeFragments) {
                final  CodeFragment cfTmp = cf1;
                pool.submit(new Runnable() {
                    @Override
                    public void run() {
                        for (CodeFragment cf2 : findCandidate(cfTmp, false, subType)) {
                            for (Map<String, String> varMapping : getAllVarMapping(cfTmp, cf2)) {
                                ASTReplace r = new ASTReplace();
                                CtStatement tmp = (CtStatement) copyElem(cf2.getCtCodeFragment());
                                r.setTransplantationPoint(cfTmp);
                                r.setTransplant(new Statement(tmp));
                                r.setVarMapping(varMapping);
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

    public Set<Transformation> getAllDelete() {
        Set<Transformation> allReplace = new HashSet<Transformation>();

        for (CodeFragment cf1 : codeFragments) {
                    ASTDelete r = new ASTDelete();
                    r.setTransplantationPoint(cf1);
                    allReplace.add(r);
        }
        return allReplace;
    }

    public Set<Transformation> getAllAdd() throws InterruptedException {
        final Set<Transformation> allReplace = new HashSet<Transformation>();
        ExecutorService pool = Executors.newFixedThreadPool(50);
        for (CodeFragment cf1 : codeFragments) {
            final  CodeFragment cfTmp = cf1;
            pool.submit(new Runnable() {
                @Override
                public void run() {
                    for (CodeFragment cf2 : findCandidate(cfTmp, false, subType)) {
                        for (Map<String,String> varMapping : getAllVarMapping(cfTmp,cf2)) {
                            ASTAdd r = new ASTAdd();
                            CtStatement tmp = (CtStatement) copyElem(cf2.getCtCodeFragment());
                            r.setTransplantationPoint(cfTmp);
                            r.setTransplant(new Statement(tmp));
                            r.setVarMapping(varMapping);
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


    public BigInteger getAllAdd2() throws InterruptedException {
        BigInteger result = new BigInteger("0");
        BigInteger tmp;
        for(CodeFragment cf1 : codeFragments) {
            for(CodeFragment cf2 : findCandidate(cf1, false, subType)) {

                tmp = getNumberOfVarMapping(cf1, cf2);
                result = result.add(tmp);

                if (max.compareTo(tmp) < 0) {
                    max = tmp;
                    Log.debug("{}  {}  {}", tmp, cf1.getInputContext().size(), cf2.getInputContext().size());
                    d_nbAllVarMapping(cf1,cf2);
                    Log.debug("{}\ntransplantationPoint: {}\n {}", tmp, cf1.getInputContext().equalString(), cf1);
                    Log.debug("replace/add:{}\n{}\n", cf2.getInputContext().equalString(), cf2);
                    Log.debug("____________________________");
                }
            }
        }

        return result;
    }

    protected List<Map<String, String>> getAllVarMapping(CodeFragment before, CodeFragment after) {
        List<List<String>> vars = new ArrayList<List<String>>();

        for (CtVariableReference<?> variable : after.getInputContext().getVar()) {


            List<String> mapping = new ArrayList<String>();
            vars.add(mapping);
            for (Object candidate : before.getInputContext().allCandidate(variable.getType(), subType))
                    mapping.add(variable.toString()+"==="+candidate.toString() );

        }
        return computeVarMapping(vars);
    }

    protected long nbAllVarMapping(CodeFragment before, CodeFragment after) {
        long nb = 1;
        for (CtVariableReference<?> variable : after.getInputContext().getVar()) {
            nb = nb * before.getInputContext().allCandidate(variable.getType(), subType).size();
        }
        return nb;
    }

    protected long d_nbAllVarMapping(CodeFragment before, CodeFragment after) {
        long nb = 1;
        for (CtVariableReference<?> variable : after.getInputContext().getVar()) {
            Log.debug("{}: {} = {} * {}",variable,  (nb * before.getInputContext().allCandidate(variable.getType(), subType).size()), nb , before.getInputContext().allCandidate(variable.getType(), subType).size());
            nb = nb * before.getInputContext().allCandidate(variable.getType(), subType).size();
        }
        return nb;
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
}
