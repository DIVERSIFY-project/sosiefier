package com.google.gson;

import java.net.InetAddress;
import junit.framework.TestCase;

/** 
 * Unit tests for the default serializer/deserializer for the {@code InetAddress} type.
 * 
 * @author Joel Leitch
 */
public class DefaultInetAddressTypeAdapterTest extends TestCase {
    private Gson gson;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        gson = new Gson();
    }

    public void testInetAddressSerializationAndDeserialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInetAddressSerializationAndDeserialization");
        InetAddress localhost = InetAddress.getLocalHost();
        String localInetAddress = gson.toJson(localhost);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2667,(("\"" + (localhost.getHostAddress())) + "\""));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2668,localInetAddress);
        InetAddress value = gson.fromJson(localInetAddress, InetAddress.class);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2669,localhost);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2670,value);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }
}

