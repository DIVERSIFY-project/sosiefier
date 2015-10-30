package fr.inria.diversify.buildSystem;


import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

/**
 * User: Simon
 * Date: 15/10/15
 * Time: 13:59
 */
public class DiversifyClassLoader extends ClassLoader {
    String classPath;
    protected List<String> classFilter;

    public DiversifyClassLoader(ClassLoader parent, String classPath) {
        super(parent);
        this.classPath = classPath;
    }


    public void setClassFilter(List<String> classFilter) {
        this.classFilter = classFilter;
    }

    protected boolean update(String fullName) {
        for(String cl : classFilter) {
            if(fullName.contains(cl)) {
                return true;
            }
        }
        return false;
    }

    public Class loadClass(String fullName) throws ClassNotFoundException {
        if(update(fullName)) {
            try {
                String url = "file:" + classPath + "/" + fullName.replace(".", "/") + ".class";
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

            } catch (MalformedURLException e) {

            } catch (IOException e) {
            }
        }
        try {
            return Class.forName(fullName);
        } catch (Exception e) {}
        return getParent().loadClass(fullName);
    }
}
