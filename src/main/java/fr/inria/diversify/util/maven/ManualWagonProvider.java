package fr.inria.diversify.util.maven;

import org.apache.maven.wagon.Wagon;
import org.eclipse.aether.connector.wagon.WagonProvider;
import org.sonatype.maven.wagon.AhcWagon;

/**
 * User: Simon
 * Date: 6/12/13
 * Time: 3:44 PM
 */
public class ManualWagonProvider implements WagonProvider {

    public Wagon lookup( String roleHint )
            throws Exception
    {
        if ( "http".equals( roleHint ) )
        {
            return new AhcWagon();
        }
        return null;
    }

    public void release( Wagon wagon )
    {

    }
}
