/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.collections4.bag;

import org.apache.commons.collections4.Bag;
import org.apache.commons.collections4.bag.HashBag;

/**
 * Extension of {@link AbstractBagTest} for exercising the {@link HashBag}
 * implementation.
 *
 * @version $Id: HashBagTest.java 1477661 2013-04-30 14:27:35Z sebb $
 */
public class HashBagTest<T> extends AbstractBagTest<T> {

    public HashBagTest(final String testName) {
        super(testName);
    }

    @Override
    public Bag<T> makeObject() {
        return new HashBag<T>();
    }

    @Override
    public String getCompatibilityVersion() {
        return "4";
    }

//    public void testCreate() throws Exception {
//        Bag bag = makeObject();
//        writeExternalFormToDisk((java.io.Serializable) bag, "src/test/resources/data/test/HashBag.emptyCollection.version4.obj");
//        bag = makeObject();
//        bag.add("A");
//        bag.add("A");
//        bag.add("B");
//        bag.add("B");
//        bag.add("C");
//        writeExternalFormToDisk((java.io.Serializable) bag, "src/test/resources/data/test/HashBag.fullCollection.version4.obj");
//    }
}
