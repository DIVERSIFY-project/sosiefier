package fr.inria.diversify.kevoree;

/**
 * User: Erwan Daubert - erwan.daubert@gmail.com
 * Date: 04/04/14
 * Time: 14:43
 *
 * @author Erwan Daubert
 * @version 1.0
 */

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONStringer;
import org.kevoree.annotation.ComponentType;
import org.kevoree.annotation.Param;
import org.kevoree.library.javase.ws.api.AbstractWebSocketHandler;

import java.io.File;

@ComponentType
public class FileListWebSocketHandler extends AbstractWebSocketHandler {

    @Param
    String rootFolder;

    @Override
    public void onOpen(long id, String uri, String message) {

    }

    @Override
    public void onMessage(long id, String uri, String message) {
        try {
            JSONObject jsonReader = new JSONObject(message);
            if ("list".equalsIgnoreCase(jsonReader.get("request").toString())) {
                String path = jsonReader.get("path").toString();
                send(id, new JSONStringer().object().key("request").value("list").key("files").value(new JSONArray(listFiles(path))).endObject().toString());
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public String[] listFiles(String path) {
        return new File(rootFolder + File.separator + path).list();
    }

    @Override
    public void onClose(long id, String uri, String message) {

    }
}
