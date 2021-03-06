package fr.inria.diversify.util;

import org.eclipse.jgit.api.*;
import org.eclipse.jgit.api.errors.*;
import org.eclipse.jgit.internal.storage.file.FileRepository;
import org.eclipse.jgit.transport.UsernamePasswordCredentialsProvider;

import java.io.*;

/**
 * Created by Simon on 29/08/14.
 */
public class GitUtils {
    protected String remotePath = "https://github.com/simonAllier/sosie-exp.git";
    protected String localPath;
    protected Git git;


    protected String user = "diversify-exp-user";
    protected String password = "diversify-exp-password";



    public GitUtils(String localPath) throws IOException, GitAPIException {
        this.localPath = localPath;

        FileRepository localRepository = new FileRepository(localPath + "/.git");
        git = new Git(localRepository);
    }

    public void cloneRepo() throws GitAPIException, IOException {
        File localDir = new File(localPath);
        if(localDir.exists())
            FileUtils.forceDelete(localDir);

        Git.cloneRepository().setURI(remotePath)
           .setDirectory(localDir).call();
    }

    public void push() throws GitAPIException {
        git.push().setCredentialsProvider(new UsernamePasswordCredentialsProvider(user, password)).call();
    }

    public void pull() throws GitAPIException {
        git.pull().call();
    }

    public void add(String filePattern) throws GitAPIException {
        git.add().addFilepattern(filePattern).call();
    }

    public String getFirstPropertyFile() throws IOException, GitAPIException {
        BufferedReader br = new BufferedReader(new FileReader(localPath + "/exp"));
        StringBuilder sb = new StringBuilder();
        String line = br.readLine();
        String ret = "";
        while (line != null) {
            if(line.split(" ").length == 1 && ret.equals("")) {
                ret = line;
                sb.append(line+" OK\n");
            }
            else
                sb.append(line+"\n");
            line = br.readLine();
        }
        Log.info("properties file: {}",ret);
        updateExpList(sb.toString());
        return ret;
    }

    public void commit(String message) throws GitAPIException {
        git.commit().setMessage(message).call();
    }


    private void updateExpList(String s) throws IOException, GitAPIException {
        BufferedWriter out = new BufferedWriter(new FileWriter(localPath + "/exp"));
        out.write(s);
        out.close();
        add("exp");
        commit("update");
        push();
    }
}
