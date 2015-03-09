package fr.inria.diversify.statistic;

import fr.inria.diversify.transformation.SingleTransformation;
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
    protected static String sourceCityFileSuffix  = "source.csv";;

    protected Collection<SingleTransformation> transformations;
    protected int numberOfFailureMax;

    public StatisticDiversification(Collection<SingleTransformation> transformations) {
        this.transformations = transformations;

        this.numberOfFailureMax = 0;
        for(SingleTransformation t : transformations)
            this.numberOfFailureMax = Math.max(this.numberOfFailureMax, t.getStatus());
    }


    public void writeStat(String directory) {
        try {
            writeSourceCity(directory + "/" + sourceCityFileSuffix);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    protected int candidate(Transformation tran) {
//        String type = tran.getType();
//        if(type.equals("delete"))
//            return 1;
//        Util util = new Util(codeFragmentList);
//        CodeFragment cf = ((ASTTransformation) tran).getTransplantationPoint();
//
//        if(type.equals("add") || type.equals("replace"))
//            return util.numberOfNotDiversification(cf).intValue();
//
//        if(type.contains("notContextMappingVariableName"))
//            return util.findCandidate(cf, true).size();
//
//        if(type.contains("notMapping"))
//            return util.findCandidate(cf, false).size();
//
//        if(type.contains("notContext"))
//            return codeFragmentList.size();
//
//        return 0;
//    }

    protected List<SingleTransformation> transformation(String type) {
        List<SingleTransformation> trans = new ArrayList<SingleTransformation>();
        for(SingleTransformation t : transformations)
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

    protected void writeSourceCity(String fileName) throws IOException {
        FileWriter fw = new FileWriter(fileName);
        BufferedWriter bw = new BufferedWriter(fw);
        Log.debug("write data for source city in file {}",fileName);
        bw.write("type"+separator+"name"+separator+"package"+separator+
                "class"+separator+"method"+separator+"status"+separator+
                "stmtType"+separator+"level"+separator+"line"+separator+"usedSubType\n");
        for(SingleTransformation trans : transformations) {
            StringBuffer sb = new StringBuffer();
            try {
                sb.append(trans.getType());
                sb.append(separator);
                sb.append(trans.getName());
                sb.append(separator);
                sb.append(trans.packageLocationName());
                sb.append(separator);
                sb.append(trans.classLocationName());
                sb.append(separator);
                sb.append(trans.methodLocationName());
                sb.append(separator);
                sb.append(trans.getStatus()+"");
//                sb.append(separator);
//                sb.append(trans.stmtType());
//                sb.append(separator);
//                sb.append(trans.getLevel());
                sb.append(separator);
                sb.append(trans.line());
                sb.append(separator);
                sb.append(((ASTTransformation)trans).usedOfSubType());
                sb.append("\n");
                bw.write(sb.toString());
            }catch (Exception e) {
                Log.error("writeSourceCity",e);
                e.printStackTrace();
            }
        }
        bw.close();
    }
}
