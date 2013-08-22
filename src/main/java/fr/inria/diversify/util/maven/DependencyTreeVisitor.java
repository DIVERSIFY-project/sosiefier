package fr.inria.diversify.util.maven;

import fr.inria.diversify.util.MyClassLoader;
import org.eclipse.aether.RepositorySystem;
import org.eclipse.aether.RepositorySystemSession;
import org.eclipse.aether.artifact.Artifact;
import org.eclipse.aether.artifact.DefaultArtifact;
import org.eclipse.aether.graph.DependencyNode;
import org.eclipse.aether.graph.DependencyVisitor;
import org.eclipse.aether.repository.RemoteRepository;
import org.eclipse.aether.resolution.ArtifactRequest;
import org.eclipse.aether.resolution.ArtifactResult;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URLClassLoader;

/**
 * User: Simon
 * Date: 7/31/13
 * Time: 2:29 PM
 */
public class DependencyTreeVisitor implements DependencyVisitor {
    MyClassLoader loader;

    public DependencyTreeVisitor(MyClassLoader loader) {
        this.loader = loader;
    }

    public boolean visitEnter( DependencyNode node )
    {
        try {
            File file = resolveArtifact(node.getArtifact());
            loader.addURL(file.toURL());
        } catch (Exception e) {
            e.printStackTrace();
        }

        return true;
    }

    public boolean visitLeave( DependencyNode node )
    {
        return true;
    }

    protected File resolveArtifact(Artifact ai)
            throws Exception
    {

        RepositorySystem system = Booter.newRepositorySystem();

        RepositorySystemSession session = Booter.newRepositorySystemSession( system );

        Artifact artifact = new DefaultArtifact(ai.getGroupId()+":"+ai.getArtifactId()+":"+ai.getVersion());

        RemoteRepository repo = Booter.newCentralRepository();

        ArtifactRequest artifactRequest = new ArtifactRequest();
        artifactRequest.setArtifact( artifact );
        artifactRequest.addRepository( repo );

        ArtifactResult artifactResult = system.resolveArtifact( session, artifactRequest );

        return artifactResult.getArtifact().getFile();
    }
}
