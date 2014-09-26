package fr.inria.diversify.transformation.ast;

import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.factories.SpoonMetaFactory;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.query.KnownSosieQuery;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import spoon.reflect.factory.Factory;

import java.util.Collection;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Created by marcel on 8/06/14.
 */
public class KnownMultisosieStrategyTest {

    KnownSosieQuery st;

    private String getResourcePath(String name) throws Exception {
        return getClass().getResource("/" + name).toURI().getPath();
    }

    /**
     * Test the sharing of transformations
     * @throws Exception
     */
    @Test
    @Ignore("Not implemented")

    public void testQuery() throws Exception {
        fail("Not implemented");
    }

}
