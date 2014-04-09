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
import org.kevoree.log.Log;

import java.io.*;

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
                String path = jsonReader.get("path").toString().replace("/", File.separator);
                send(id, new JSONStringer().object()
                        .key("request").value("list")
                        .key("files").value(new JSONArray(listFiles(path)))
                        .endObject()
                        .toString());
            }
            if("jsonArray".equalsIgnoreCase(jsonReader.get("request").toString())) {
                String file = jsonReader.get("file").toString().replace("/", File.separator);
                send(id, new JSONStringer().object()
                        .key("request").value("jsonArray")
                        .key("object").value(getJsonArray(file))
                        .endObject()
                        .toString());
            }
            if("jsonObject".equalsIgnoreCase(jsonReader.get("request").toString())) {
                String file = jsonReader.get("file").toString().replace("/", File.separator);
                send(id, new JSONStringer().object()
                        .key("request").value("jsonObject")
                        .key("object").value(getJsonObject(file))
                        .endObject()
                        .toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String[] listFiles(String path) {
        File f = new File(rootFolder + File.separator + path);
        if (f.exists()) {
            return new File(rootFolder + File.separator + path).list();
        } else {
            Log.error("Unable to find {}", f.getAbsolutePath());
            return new String[0];
        }
    }

    protected JSONObject getJsonObject(String file) throws IOException, JSONException {
        BufferedReader br = new BufferedReader(new FileReader(rootFolder + File.separator + file));
        StringBuilder sb = new StringBuilder();
        String line = br.readLine();

        while (line != null) {
            sb.append(line);
            line = br.readLine();
        }
        return new JSONObject(sb.toString());
    }

    protected JSONArray getJsonArray(String file) throws IOException, JSONException {
        BufferedReader br = new BufferedReader(new FileReader(rootFolder + File.separator + file));
        StringBuilder sb = new StringBuilder();
        String line = br.readLine();

        while (line != null) {
            sb.append(line);
            line = br.readLine();
        }
        return new JSONArray(sb.toString());
    }

    @Override
    public void onClose(long id, String uri, String message) {

    }
}
