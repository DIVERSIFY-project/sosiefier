package fr.inria.diversify.fr.inria.diverfy.runtest;

/*******************************************************************************
 * Copyright (c) 2009, 2013 Mountainminds GmbH & Co. KG and Contributors
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Marc R. Hoffmann - initial API and implementation
 *
 *******************************************************************************/

import org.jacoco.core.data.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

/**
 * This example reads given execution data files and dumps their content.
 */
public final class ExecDump {

    public static void dumpContent(final String file) throws IOException {
        System.out.printf("exec file: %s%n", file);
        System.out.println("CLASS ID         HITS/PROBES   CLASS NAME");

        final FileInputStream in = new FileInputStream(file);
        final ExecutionDataReader reader = new ExecutionDataReader(in);
        reader.setSessionInfoVisitor(new ISessionInfoVisitor() {
            public void visitSessionInfo(final SessionInfo info) {
                System.out.printf("Session \"%s\": %s - %s%n", info.getId(),
                        new Date(info.getStartTimeStamp()),
                        new Date(info.getDumpTimeStamp()));
            }
        });
        reader.setExecutionDataVisitor(new IExecutionDataVisitor() {
            public void visitClassExecution(final ExecutionData data) {
                System.out.printf("%016x  %3d of %3d   %s%n",
                        Long.valueOf(data.getId()),
                        Integer.valueOf(getHitCount(data.getProbes())),
                        Integer.valueOf(data.getProbes().length), data.getName());
            }
        });
        reader.read();
        in.close();
        System.out.println();
    }

    public static int getHitCount(final boolean[] data) {
        int count = 0;
        for (final boolean hit : data) {
            if (hit) {
                count++;
            }
        }
        return count;
    }
}
