package fr.inria.diversify.coverage;

import fr.inria.diversify.codeFragment.CodeFragment;
import javassist.CtMethod;
import org.jacoco.core.analysis.IClassCoverage;
import org.jacoco.core.analysis.ICounter;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtType;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by nharrand on 16/08/17.
 */
public class XMLCoverageReport implements ICoverageReport {

    File reportFile;
    Map<String,Map<Integer, Double>> report;

    public XMLCoverageReport(File reportFile) {
        this.reportFile = reportFile;
        report = new HashMap<>();
    }

    @Override
    public void create() throws IOException {
        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            dbFactory.setFeature("http://apache.org/xml/features/nonvalidating/load-external-dtd", false);
            DocumentBuilder dBuilder = null;
            dBuilder = dbFactory.newDocumentBuilder();
            /*dBuilder.setEntityResolver(new EntityResolver() {
                @Override
                public InputSource resolveEntity(String publicId, String systemId)
                        throws SAXException, IOException {
                    if (systemId.contains("foo.dtd")) {
                        return new InputSource(new StringReader(""));
                    } else {
                        return null;
                    }
                }
            });*/
            Document doc = dBuilder.parse(reportFile);
            NodeList nList = doc.getElementsByTagName("packages");
            if(nList.getLength() == 1) {
                readPackages(nList.item(0));
                System.out.println("OK");
            } else {
                System.err.println("Error in xml report coverage format");
                //error
            }
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        }
    }

    void readPackages(Node r) {
        NodeList reportChild = r.getChildNodes();
        for(int i = 0; i < reportChild.getLength(); i++) {
            if(reportChild.item(i).getNodeName().equals("package")) {
                readPackage(reportChild.item(i));
            }
        }
    }

    void readPackage(Node p) {
        NodeList nList = p.getChildNodes();
        for(int j = 0; j < nList.getLength(); j++) {
            if (nList.item(j).getNodeName().equals("classes")) {
                NodeList classes = nList.item(j).getChildNodes();
                for (int i = 0; i < classes.getLength(); i++) {
                    if (classes.item(i).getNodeName().equals("class")) {
                        readClass(classes.item(i));
                    }
                }
            }
        }
    }

    void readClass(Node c) {
        NodeList nList = c.getChildNodes();
        String fileName = c.getAttributes().getNamedItem("filename").getNodeValue();
        for(int j = 0; j < nList.getLength(); j++) {
            if (nList.item(j).getNodeName().equals("methods")) {
                NodeList methods = nList.item(j).getChildNodes();
                for (int i = 0; i < methods.getLength(); i++) {
                    if (methods.item(i).getNodeName().equals("method")) {
                        readMethod(methods.item(i), fileName);
                    }
                }
            }
        }
    }

    void readMethod(Node m, String fileName) {
        NodeList nList = m.getChildNodes();
        for(int j = 0; j < nList.getLength(); j++) {
            if(nList.item(j).getNodeName().equals("lines")) {
                NodeList lines = nList.item(j).getChildNodes();
                for(int i = 0; i < lines.getLength(); i++) {
                    if(lines.item(i).getNodeName().equals("line")) {
                        readLine(lines.item(i), fileName);
                    }
                }
            }
        }
    }

    void readLine(Node l, String fileName) {
        double score;
        int hits = Integer.parseInt(l.getAttributes().getNamedItem("hits").getNodeValue());
        int number = Integer.parseInt(l.getAttributes().getNamedItem("number").getNodeValue());
        if(hits != 0) {
            Node conditionCov = l.getAttributes().getNamedItem("condition-coverage");
            if(conditionCov != null) {
                score = Integer.parseInt(conditionCov.getNodeValue().split("%")[0]) / 100.0;
            } else {
                score = 1;
            }
        } else {
            score = 0;
        }
        if(!report.containsKey(fileName)) report.put(fileName,new HashMap<>());
        Map<Integer,Double> lines = report.get(fileName);
        lines.put(number,score);
        /*NodeList nList = l.getChildNodes();
        if(nList.getLength() == 1 && nList.item(0).getNodeName().equals("conditions")) {
            NodeList lines = nList.item(0).getChildNodes();
            for(int i = 0; i < lines.getLength(); i++) {
                if(lines.item(i).getNodeName().equals("condition")) {
                    //readLine(lines.item(i));
                }
            }
        }*/
    }


    @Override
    public double codeFragmentCoverage(CodeFragment stmt) {
        return 0;
    }

    @Override
    public int opCodeCoverage(CtMethod method, int indexOpcode) {
        return 0;
    }

    @Override
    public double elementCoverage(CtElement operator) {
        return 0;
    }

    @Override
    public List<Integer> getCoverageDistribution(CodeFragment stmt) {
        return null;
    }

    @Override
    public double positionCoverage(SourcePosition position) {
        CtType<?> cl = position.getCompilationUnit().getMainType();

        String packageName = cl.getPackage().getQualifiedName().replace(".","/");
        String sourceFile = packageName + "/" + cl.getSimpleName() + ".java";

        if(!report.containsKey(sourceFile)) {
            return 0;
        }

        double ret = 0;
        int start = position.getLine();
        int end = position.getEndLine();
        Map<Integer, Double> lineReports = report.get(sourceFile);
        for (int i = start; i <= end; i++) {
            if (lineReports.containsKey(i)) {
                Double l = lineReports.get(i);
                ret += l;
            }
        }
        return ret/(double)(end - start + 1);
    }
}
