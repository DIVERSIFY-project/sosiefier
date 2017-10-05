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
    Map<String, Map<String, Map<Integer, LineReport>>> report;

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
            NodeList nList = doc.getElementsByTagName("report");
            if(nList.getLength() == 1) {
                readReport(nList.item(0));
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

    void readReport(Node r) {
        NodeList reportChild = r.getChildNodes();
        for(int i = 0; i < reportChild.getLength(); i++) {
            if(reportChild.item(i).getNodeName().equals("package")) {
                readPackage(reportChild.item(i));
            } else if (reportChild.item(i).getNodeName().equals("class")) {
                readClass(reportChild.item(i));
            }
        }
    }

    void readPackage(Node p) {
        String packageName = p.getAttributes().getNamedItem("name").getNodeValue().replace('/','.');
        report.put(packageName,new HashMap<>());
        NodeList packageChild = p.getChildNodes();
        for(int i = 0; i < packageChild.getLength(); i++) {
            if(packageChild.item(i).getNodeName().equals("sourcefile")) {
                readSourceFile(packageChild.item(i), packageName);
            }
        }
    }

    void readClass(Node c) {}

    void readMethod() {}

    void readSourceFile(Node s, String packageName) {
        String fileName = s.getAttributes().getNamedItem("name").getNodeValue();
        report.get(packageName).put(fileName, new HashMap<>());
        NodeList sourceFileChild = s.getChildNodes();
        for(int i = 0; i < sourceFileChild.getLength(); i++) {
            if(sourceFileChild.item(i).getNodeName().equals("line")) {
                Node l = sourceFileChild.item(i);
                int nr = Integer.parseInt(l.getAttributes().getNamedItem("nr").getNodeValue());
                int mi = Integer.parseInt(l.getAttributes().getNamedItem("mi").getNodeValue());
                int ci = Integer.parseInt(l.getAttributes().getNamedItem("ci").getNodeValue());
                int mb = Integer.parseInt(l.getAttributes().getNamedItem("mb").getNodeValue());
                int cb = Integer.parseInt(l.getAttributes().getNamedItem("cb").getNodeValue());
                report.get(packageName).get(fileName).put(nr, new LineReport(mi,ci,mb,cb));
            }
        }
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

        String packageName = cl.getPackage().getQualifiedName();
        String sourceFile = cl.getSimpleName() + ".java";

        if(!report.containsKey(packageName)
                || !report.get(packageName).containsKey(sourceFile)) {
            return 0;
        }

        double ret = 0;
        int start = position.getLine();
        int end = position.getEndLine();
        Map<Integer, LineReport> lineReports = report.get(packageName).get(sourceFile);
        for (int i = start; i <= end; i++) {
            if (lineReports.containsKey(i)) {
                LineReport l = lineReports.get(i);
                ret += ((double) l.ci) / (((double) l.mi) + ((double) l.ci));
            }
        }
        return ret/(double)(end - start + 1);
    }

    public class LineReport {
        public int mi;
        public int ci;
        public int mb;
        public int cb;

        public LineReport(int mi, int ci, int mb, int cb) {
            this.mi = mi;
            this.ci = ci;
            this.mb = mb;
            this.cb = cb;
        }
    }
}
