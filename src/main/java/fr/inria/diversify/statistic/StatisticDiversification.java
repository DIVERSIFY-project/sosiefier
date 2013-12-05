package fr.inria.diversify.statistic;

import fr.inria.diversify.CodeFragmentList;
import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.transformation.ITransformation;
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

    protected Collection<ITransformation> transformations;
    protected int numberOfFailureMax;
    protected CodeFragmentList codeFragmentList;

    public StatisticDiversification(Collection<ITransformation> transformations, CodeFragmentList codeFragmentList) {
        this.transformations = transformations;
        this.codeFragmentList = codeFragmentList;

        this.numberOfFailureMax = 0;
        for(ITransformation t : transformations)
            this.numberOfFailureMax = Math.max(this.numberOfFailureMax, t.numberOfFailure());
    }

//    public StatisticDiversification() {
//        this.transformations = new HashSet<ITransformation>();
//        this.numberOfFailureMax = 0;
//    }

//    public void addTransformation(ASTTransformation t) {
//        transformations.add(t);
//    }

    public void writeStat(String output) {
        try {
            writeDetail(output+detailFileSuffix);
            writeSourceCity(output+sourceCityFileSuffix);
            writeDetailForTransformationType(output+typeFileSuffix);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected void writeDetailForTransformationType(String fileName) throws IOException {
        FileWriter fw = new FileWriter(fileName);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("type"+separator+"trial"+separator+"varient"+separator+"sosie"+separator+"space");
        for(String type : getAllTransformationType(transformations)) {
            List<ITransformation> trans = transformation(type);

            bw.write(type+separator);
            bw.write("nan"+separator);
            bw.write(trans.size()+separator);
            bw.write(sosie(trans)+separator);
            bw.write(space(trans, type)+""+separator);
        }
    }

    protected double space(List<ITransformation> trans, String type) {
        double nb = 0;
        if(type.equals("delete"))
            return 1;
        Util util = new Util(codeFragmentList);
        for(ITransformation t : trans) {
            CodeFragment cf = ((ASTTransformation) t).getPosition();
            if(type.equals("add") || type.equals("replace")) {
                int i = util.numberOfNotDiversification(cf).intValue();
                nb = nb + ((double)i)/((double)trans.size());
            }
            else {
                int i = util.findCandidate(cf).size();
                nb = nb + ((double)i)/((double)trans.size());
            }
        }
        return nb;
    }

    protected List<ITransformation> transformation(String type) {
        List<ITransformation> trans = new ArrayList<ITransformation>();
        for(ITransformation t : transformations)
            if(t.getType().equals(type))
                trans.add(t);
        return trans;
    }

    protected int sosie(List<ITransformation> list) {
        int count = 0;
        for (ITransformation t : list) {
            if(t.numberOfFailure() == 0)
                count++;
        }
        return count;
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

    protected void writeDetail(String fileName) throws IOException {
        FileWriter fw = new FileWriter(fileName);
        BufferedWriter bw = new BufferedWriter(fw);

        ((ASTTransformation)transformations.toArray()[0]).writeHead(bw,separator);

        bw.write("\n");

        for(ITransformation trans : transformations) {
            StringBuffer sb = new StringBuffer();
            try {
                trans.write(sb, separator);
            sb.append("\n");
                bw.write(sb.toString());
            }catch (Exception e) {}
        }
        bw.close();
    }

    protected void writeSourceCity(String fileName) throws IOException {
        FileWriter fw = new FileWriter(fileName);
        BufferedWriter bw = new BufferedWriter(fw);
        Log.debug("write data for source city");
        bw.write("type"+separator+"package"+separator+"class"+separator
                +"classReplaceOrAdd"+separator+"method"+separator+
                "size"+separator+"nbMethod"+separator+"compile"+separator+"sosie\n");
        for(ITransformation trans : transformations) {
            StringBuffer sb = new StringBuffer();
            try {
                sb.append(trans.getType());
                sb.append(separator);
                sb.append(trans.packageLocationName());
                sb.append(separator);
                sb.append(trans.classLocationName());
                sb.append(separator);
                sb.append(trans.classReplaceOrAddPositionName());
                sb.append(separator);
                sb.append(trans.methodLocationName());
                sb.append(separator);
                sb.append(trans.classSize());
                sb.append(separator);
                sb.append(trans.nbMethodInClassLocation());
                sb.append(separator);
                sb.append(trans.isCompile());
                sb.append(separator);
                sb.append(trans.numberOfFailure() == 0);
                sb.append("\n");
                bw.write(sb.toString());
            }catch (Exception e) {
                Log.error("writeSourceCity",e);
            }
        }
        bw.close();
    }

    protected Set<String> getAllTransformationType(Collection<ITransformation> transformations) {
        Set<String> types = new HashSet<String>();
        for (ITransformation t : transformations)
            types.add(t.getType());
        return types;
    }
}
