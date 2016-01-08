package fr.inria.diversify.buildSystem;



import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.net.URLConnection;
import java.util.*;

/**
 * User: Simon
 * Date: 15/10/15
 * Time: 13:59
 */
public class DiversifyClassLoader extends ClassLoader {
    protected List<String> classPaths;
    protected Map<String, Class> classes;
    protected Collection<String> classFilter;

    public DiversifyClassLoader(ClassLoader parent, List<String> classPaths) {
        super(parent);
        this.classPaths = classPaths;
        this.classes = new HashMap<>();
    }


    public DiversifyClassLoader(ClassLoader parent, String classPath) {
        super(parent);
        this.classPaths = new ArrayList<>();
        classPaths.add(classPath);
        this.classes = new HashMap<>();
    }


    public void setClassFilter(Collection<String> classFilter) {
        this.classFilter = classFilter;
    }

    protected boolean update(String fullName) {
        if(classFilter == null) {
            return true;
        }
        for(String cl : classFilter) {
            if(fullName.contains(cl)) {
                return true;
            }
        }
        return false;
    }

    public Class loadClass(String fullName) throws ClassNotFoundException {
        if(update(fullName)) {
            if (classes.containsKey(fullName)) {
                return classes.get(fullName);
            } else {
                File classFile = findClassFile(fullName);
                if (classFile != null) {
                    try {
                        classes.put(fullName, loadClass0(classFile, fullName));
                        return classes.get(fullName);
                    } catch (Throwable e) {
                    }
                }
            }
        }
        return getParent().loadClass(fullName);
    }

    protected File findClassFile(String fullName) {
        File file = null;
        for(String dir : classPaths) {
            file = new File(dir + "/" + fullName.replace(".", "/") + ".class");
            if(file.exists()) {
                break;
            } else {
                file = null;
            }
        }
        return file;
    }

    protected Class loadClass0(File classFile, String fullName) throws IOException {
        String url = "file:" + classFile.getAbsolutePath();
        URL myUrl = new URL(url);
        URLConnection connection = myUrl.openConnection();
        InputStream input = connection.getInputStream();
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        int data = input.read();

        while (data != -1) {
            buffer.write(data);
            data = input.read();
        }

        input.close();

        byte[] classData = buffer.toByteArray();
        return defineClass(fullName,
                classData, 0, classData.length);
    }

    public URL[] getURLs() {
        List<URL> urls = new ArrayList<>();
        for(String directory: classPaths) {
            try {
                urls.add((new File(directory).toURL()));
            } catch (MalformedURLException e) {}
        }
        if(getParent() instanceof DiversifyClassLoader){
            urls.addAll(Arrays.asList(((DiversifyClassLoader) getParent()).getURLs()));
        }
        if(getParent() instanceof URLClassLoader) {
            urls.addAll(Arrays.asList(((URLClassLoader) getParent()).getURLs()));

        }
        return urls.toArray(new URL[urls.size()]);
    }
}
