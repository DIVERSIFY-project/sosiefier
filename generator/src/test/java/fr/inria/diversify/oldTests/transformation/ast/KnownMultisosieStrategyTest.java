package fr.inria.diversify.oldTests.transformation.ast;

import fr.inria.diversify.transformation.query.KnownSosieQuery;
import org.junit.Ignore;
import org.junit.Test;

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
