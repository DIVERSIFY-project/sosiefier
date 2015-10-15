package fr.inria.diversify.buildSystem;


import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * User: Simon
 * Date: 15/10/15
 * Time: 13:59
 */
public class DiversifyClassLoader extends ClassLoader {
    String classPath;
    public DiversifyClassLoader(ClassLoader parent, String classPath) {
        super(parent);
        this.classPath = classPath;
    }

    public Class loadClass(String fullName) throws ClassNotFoundException {
        try {
            String url = "file:" + classPath + "/" + fullName.replace(".", "/") + ".class";
            URL myUrl = new URL(url);
            URLConnection connection = myUrl.openConnection();
            InputStream input = connection.getInputStream();
            ByteArrayOutputStream buffer = new ByteArrayOutputStream();
            int data = input.read();

            while(data != -1){
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

        return getParent().loadClass(fullName);
    }
}
