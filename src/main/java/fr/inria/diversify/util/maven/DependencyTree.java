package fr.inria.diversify.util.maven;

import org.eclipse.aether.RepositorySystem;
import org.eclipse.aether.RepositorySystemSession;
import org.eclipse.aether.artifact.Artifact;
import org.eclipse.aether.artifact.DefaultArtifact;
import org.eclipse.aether.collection.CollectRequest;
import org.eclipse.aether.collection.CollectResult;
import org.eclipse.aether.graph.Dependency;
import org.eclipse.aether.graph.DependencyNode;
import org.eclipse.aether.repository.RemoteRepository;

import java.io.File;

/**
 * User: Simon
 * Date: 7/31/13
 * Time: 2:18 PM
 */
public class DependencyTree {


    public DependencyNode getDependencyTree(String ai, String fileName) throws Exception {

        RepositorySystem system = Booter.newRepositorySystem();

        RepositorySystemSession session = Booter.newRepositorySystemSession( system );
        Artifact artifact = new DefaultArtifact( ai );

        Artifact a = artifact.setFile(new File(fileName));



        RemoteRepository repo = Booter.newCentralRepository();

        CollectRequest collectRequest = new CollectRequest();
        collectRequest.setRoot( new Dependency( a, "compile" ) );
        collectRequest.addRepository( repo );

        CollectResult collectResult = system.collectDependencies( session, collectRequest );

        return collectResult.getRoot();
    }

}
