package fr.inria.diversify.buildSystem.maven;

import org.apache.maven.shared.invoker.InvocationResult;
import org.codehaus.plexus.util.cli.CommandLineException;

/**
 * User: Simon
 * Date: 9/9/13
 * Time: 3:20 PM
 */
public class MavenInvocationResult  implements InvocationResult
{

    /**
     * The exception that prevented to execute the command line, will be <code>null</code> if Maven could be
     * successfully started.
     */
    private CommandLineException executionException;

    /**
     * The exit code reported by the Maven invocation.
     */
    private int exitCode = Integer.MIN_VALUE;

    /**
     * Creates a new invocation result
     */
    MavenInvocationResult()
    {
        // hide constructor
    }

    public int getExitCode()
    {
        return exitCode;
    }

    public CommandLineException getExecutionException()
    {
        return executionException;
    }

    /**
     * Sets the exit code reported by the Maven invocation.
     *
     * @param exitCode The exit code reported by the Maven invocation.
     */
    void setExitCode( int exitCode )
    {
        this.exitCode = exitCode;
    }

    /**
     * Sets the exception that prevented to execute the command line.
     *
     * @param executionException The exception that prevented to execute the command line, may be <code>null</code>.
     */
    void setExecutionException( CommandLineException executionException )
    {
        this.executionException = executionException;
    }
}