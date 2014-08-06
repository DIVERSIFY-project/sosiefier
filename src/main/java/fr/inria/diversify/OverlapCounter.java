/*******************************************************************************
 * Copyright (c) 2009, 2014 Mountainminds GmbH & Co. KG and Contributors
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Marc R. Hoffmann - initial API and implementation
 *
 *******************************************************************************/
package fr.inria.diversify;

import java.io.File;
import java.io.IOException;
import java.util.*;

import org.jacoco.core.analysis.*;
import org.jacoco.core.tools.ExecFileLoader;
import org.junit.Test;

/**
 * This programs calculates the overlapping of clients
 */
public class OverlapCounter {

    /**
     * Entry point to run this examples as a Java application.
     *
     * @throws IOException in case of errors executing the example
     */
    public static void main(String[] args) throws IOException {

        HashMap<String, Integer> statements = new HashMap<>();

        //String execDir = "C:\\MarcelStuff\\projects\\DIVERSE\\programs\\coverage data\\jacoco\\easymock\\";
        String execDir = "C:\\MarcelStuff\\projects\\DIVERSE\\programs\\coverage data\\jacoco\\junit\\";
        String[] s = {
                execDir + "common-collections.4.0.exec", execDir + "common-configuration.exec",
                execDir + "common-lang.exec", execDir + "easymock3.2.exec", execDir + "netty.exec"};

        String classesDir = "C:\\MarcelStuff\\projects\\DIVERSE\\programs\\input-programs\\junit\\target\\classes";

        for (String path : s) {
            //Obtain the coverage bundle
            ExecFileLoader loader = new ExecFileLoader();
            File fcoverage = new File(path);
            if ( !fcoverage.exists() ) { continue; }
            loader.load(fcoverage);
            final CoverageBuilder coverageBuilder = new CoverageBuilder();
            final Analyzer analyzer = new Analyzer(loader.getExecutionDataStore(), coverageBuilder);
            analyzer.analyzeAll(new File(classesDir));

            HashSet<String> localStatements = new HashSet<>();
            Collection<IClassCoverage> clss = coverageBuilder.getClasses();

            for (IClassCoverage c : clss) {
                for (IMethodCoverage m : c.getMethods()) {
                    for (int i = m.getFirstLine(); i <= m.getLastLine(); i++) {
                        ILine line = m.getLine(i);
                        if (line.getStatus() > ICounter.NOT_COVERED) {
                            String ls = c.getName() + "::" + m.getName() + "::" + i;
                            System.out.println(ls);
                            if (!localStatements.contains(ls)) {
                                localStatements.add(ls);
                            }
                        }
                    }
                }
            }

            for (String k : localStatements) {
                if (statements.containsKey(k)) {
                    Integer v = statements.get(k);
                    v++;
                    statements.put(k, v);
                }
                else {
                    statements.put(k, 1);
                }
            }
            localStatements.clear();
        }

        ArrayList<Object> list = new ArrayList<>(Arrays.asList(statements.entrySet().toArray()));
        list.sort(new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                Map.Entry<String, Integer> se1 = (Map.Entry <String, Integer>) o1;
                Map.Entry<String, Integer> se2 = (Map.Entry<String, Integer>) o2;
                return (int) Math.signum(se1.getValue() - se2.getValue());
            }

            @Override
            public boolean equals(Object obj) {
                return false;
            }
        });

        String result = "";
        for (Object o : list) {
            Map.Entry<String, Integer> se1 = (Map.Entry<String, Integer>) o;
            System.out.println(se1.getValue() + ", " + se1.getKey());
        }
        //System.out.print(result);
    }
}