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

import org.jacoco.core.analysis.*;
import org.jacoco.core.tools.ExecFileLoader;

import java.io.File;
import java.io.IOException;
import java.util.*;

/**
 * This example reads execution data files given as program arguments and dumps
 * their content.
 */
public class HtmlReport {

    /**
     * Entry point to run this examples as a Java application.
     *
     * @throws java.io.IOException in case of errors executing the example
     */
    public void main() throws IOException {

        HashMap<String, Integer> statements = new HashMap<>();

        String execDir = "C:\\MarcelStuff\\projects\\DIVERSE\\programs\\coverage information\\";
        String[] s = {
                execDir + "commons-collections-4.0.exec", execDir + "commons-configuration.exec",
                execDir + "commons-lang-3.1.exec", execDir + "netty.exec"};

        String classesDir = "C:\\MarcelStuff\\projects\\DIVERSE\\programs\\input-programs\\easymock-light-3.2\\target\\classes";

        for (String path : s) {
            //Obtain the coverage bundle
            ExecFileLoader loader = new ExecFileLoader();
            loader.load(new File(path));
            final CoverageBuilder coverageBuilder = new CoverageBuilder();
            final Analyzer analyzer = new Analyzer(loader.getExecutionDataStore(), coverageBuilder);
            analyzer.analyzeAll(new File(classesDir));

            HashMap<String, Integer> localStatements = new HashMap<>();
            Collection<IClassCoverage> clss = coverageBuilder.getClasses();

            for (IClassCoverage c : clss) {
                for (IMethodCoverage m : c.getMethods()) {
                    for (int i = m.getFirstLine(); i <= m.getLastLine(); i++) {
                        ILine line = m.getLine(i);
                        if (line.getStatus() > ICounter.NOT_COVERED) {
                            String ls = c.getName() + "::" + m.getName() + "::" + i;
                            System.out.println(ls);
                            if (localStatements.containsKey(ls)) throw new RuntimeException("toString is not good");
                            localStatements.put(ls, 1);
                        }
                    }
                }
            }

            for (String k : localStatements.keySet()) {
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
            result += se1.getValue() + ", ";
        }
        System.out.print(result);
    }
}