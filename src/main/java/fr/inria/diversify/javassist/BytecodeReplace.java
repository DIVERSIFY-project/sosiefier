package fr.inria.diversify.javassist;

import javassist.bytecode.BadBytecode;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedWriter;
import java.io.IOException;

/**
 * User: Simon
 * Date: 11/6/13
 * Time: 5:29 PM
 */
public class BytecodeReplace extends ByteCodeTransformation {
    @Override
    public String getType() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void write(StringBuffer sb, char separator) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void writeHead(BufferedWriter sb, char separator) throws IOException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public JSONObject toJSONObject() throws JSONException {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    protected void apply() throws BadBytecode {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
