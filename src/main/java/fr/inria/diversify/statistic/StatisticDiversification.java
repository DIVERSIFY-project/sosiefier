package fr.inria.diversify.statistic;

import fr.inria.diversify.CodeFragmentList;
import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.ast.ASTTransformation;
import fr.inria.diversify.util.Log;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

/**
 * User: Simon
 * Date: 5/7/13
 * Time: 8:48 AM
 */
public class StatisticDiversification {
    protected static char separator = ';';
    protected static String detailFileSuffix = "_diversification_detail.csv";
    protected static String typeFileSuffix = "_diversification_type.csv";
    protected static String sourceCityFileSuffix  = "_source.csv";;

    protected Collection<Transformation> transformations;
    protected int numberOfFailureMax;
    protected CodeFragmentList codeFragmentList;

    public StatisticDiversification(Collection<Transformation> transformations, CodeFragmentList codeFragmentList) {
        this.transformations = transformations;
        this.codeFragmentList = codeFragmentList;

        this.numberOfFailureMax = 0;
        for(Transformation t : transformations)
            this.numberOfFailureMax = Math.max(this.numberOfFailureMax, t.getStatus());
    }

//    public StatisticDiversification() {
//        this.transformations = new HashSet<Transformation>();
//        this.numberOfFailureMax = 0;
//    }

//    public void addTransformation(ASTTransformation t) {
//        transformations.add(t);
//    }

    public void writeStat(String output) {
        try {
//            writeDetail(output+detailFileSuffix);
            writeSourceCity(output+sourceCityFileSuffix);
//            writeDetailForTransformationType(output+typeFileSuffix);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected int candidate(Transformation tran) {
        String type = tran.getType();
        if(type.equals("delete"))
            return 1;
        Util util = new Util(codeFragmentList);
        CodeFragment cf = ((ASTTransformation) tran).getTransplantationPoint();

        if(type.equals("add") || type.equals("replace"))
            return util.numberOfNotDiversification(cf).intValue();

        if(type.contains("notContextMappingVariableName"))
            return util.findCandidate(cf, true).size();

        if(type.contains("notMapping"))
            return util.findCandidate(cf, false).size();

        if(type.contains("notContext"))
            return codeFragmentList.size();

        return 0;
    }

    protected List<Transformation> transformation(String type) {
        List<Transformation> trans = new ArrayList<Transformation>();
        for(Transformation t : transformations)
            if(t.getType().equals(type))
                trans.add(t);
        return trans;
    }

    protected void write(Map<String, Map<Integer,Integer>> result, String fileName) throws IOException {
        FileWriter fw = new FileWriter(fileName);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("item");
        for (int i = -1; i <= numberOfFailureMax; i++)
            bw.write(separator+""+i);
        bw.write("\n");

        for(String key : result.keySet()) {
            bw.write(key);
            for (int i = -1; i <= numberOfFailureMax; i++)
                bw.write(separator+""+result.get(key).get(i));
            bw.write("\n");
        }
        bw.close();
    }

//    protected void writeAllPossibleTransformation(String fileName) throws IOException {
//
//        FileWriter fw = new FileWriter(fileName);
//        BufferedWriter bw = new BufferedWriter(fw);
//        Util util = new Util(codeFragmentList);
//
//        bw.write("stmtClass"+separator+"stmtPackage"+separator+"stmtInputContextSize"+separator+"stmtType"+separator+"nbCandidate"+separator+"nbDiversification\n");
//        for (CodeFragment cf1 : codeFragmentList) {
////            long nb = 0;
//            BigInteger nb = new BigInteger("0");
//            StringBuffer sb = new StringBuffer();
//            try {
//
//            List<CodeFragment> candidate = util.findCandidate(cf1);
//            for (CodeFragment cf2 : candidate) {
////                nb = nb + util.getNumberOfVarMapping(cf1, cf2);
//                BigInteger tmp = new BigInteger(util.getNumberOfVarMapping(cf1, cf2)+"");
//                nb = nb.add(tmp);
//            }
//           sb.append(cf1.getSourceClass().getQualifiedName());
//                sb.append(separator);
//
//                sb.append(cf1.getSourcePackage().getQualifiedName());
//                sb.append(separator);
//
//                sb.append(cf1.getInputContext().size()+"");
//                sb.append(separator);
//
//                sb.append(cf1.getCodeFragmentType().getSimpleName());
//                sb.append(separator);
//
//                sb.append(candidate.size());
//                sb.append(separator);
//
//                sb.append(nb);
//                sb.append("\n");
//            bw.write(sb.toString());
//            } catch (Exception e) {}
//        }
//        bw.close();
//    }

//    protected void writeDetail(String fileName) throws IOException {
//        FileWriter fw = new FileWriter(fileName);
//        BufferedWriter bw = new BufferedWriter(fw);
//
//        ((ASTTransformation)transformations.toArray()[0]).writeHead(bw,separator);
//
//        bw.write("\n");
//
//        for(Transformation trans : transformations) {
//            StringBuffer sb = new StringBuffer();
//            try {
//                trans.write(sb, separator);
//            sb.append("\n");
//                bw.write(sb.toString());
//            }catch (Exception e) {}
//        }
//        bw.close();
//    }

    protected void writeSourceCity(String fileName) throws IOException {
        FileWriter fw = new FileWriter(fileName);
        BufferedWriter bw = new BufferedWriter(fw);
        Log.debug("write data for source city in file {}",fileName);
        bw.write("type"+separator+"package"+separator+"class"+separator
                +"classReplaceOrAdd"+separator+"method"+separator+
                "size"+separator+"nbMethod"+separator+"compile"+separator+
                "sosie"+separator+"stmtType"+separator+"level"+separator+
                "candidate"+separator+"line"+separator+"methodReplaceOrAdd"+
                separator+"lineReplaceOrAdd"+"\n"); //separator+"inputContextSize"+separator+"inputContextSizeRA"+"\n");
        for(Transformation trans : transformations) {
            StringBuffer sb = new StringBuffer();
            try {
//                sb.append(trans.getType());
//                sb.append(separator);
//                sb.append(trans.packageLocationName());
//                sb.append(separator);
//                sb.append(trans.classLocationName());
//                sb.append(separator);
//                sb.append(trans.classReplaceOrAddPositionName());
//                sb.append(separator);
//                sb.append(trans.methodLocationName());
//                sb.append(separator);
//                sb.append(trans.classSize());
//                sb.append(separator);
//                sb.append(trans.nbMethodInClassLocation());
//                sb.append(separator);
//                sb.append(trans.getCompile());
//                sb.append(separator);
//                sb.append(trans.numberOfFailure() == 0);
//                sb.append(separator);
//                sb.append(trans.stmtType());
//                sb.append(separator);
//                sb.append(trans.level());
//                sb.append(separator);
//                sb.append(0+"");
//                // sb.append(candidate(trans));
//                sb.append(separator);
//                sb.append(trans.line());
//                sb.append(separator);
//                sb.append(trans.methodReplaceOrAdd());
//                sb.append(separator);
//                sb.append(trans.lineReplaceOrAdd());
//                sb.append("\n");
                bw.write(sb.toString());
            }catch (Exception e) {
                Log.error("writeSourceCity",e);
            }
        }
        bw.close();
    }

    protected Set<String> getAllTransformationType(Collection<Transformation> transformations) {
        Set<String> types = new HashSet<String>();
        for (Transformation t : transformations)
            types.add(t.getType());
        return types;
    }
}
