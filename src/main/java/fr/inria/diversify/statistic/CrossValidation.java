package fr.inria.diversify.statistic;

import fr.inria.diversify.transformation.ITransformation;
import fr.inria.diversify.transformation.ast.ASTTransformation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

/**
 * User: Simon
 * Date: 10/15/13
 * Time: 4:30 PM
 */
public class CrossValidation {
    protected Set<ITransformation>[] subSet;
    protected int nbOfSubSet;
    protected char separator = ';';

    public CrossValidation(Collection<ITransformation> transformations, int nbOfSubSet) {
        this.nbOfSubSet = nbOfSubSet;
        int subSetSize = (int) (((double)transformations.size())/(double)nbOfSubSet);
        subSet = new HashSet[nbOfSubSet];
        LinkedList<ITransformation> tmp = new LinkedList<ITransformation>(transformations);
        Random r = new Random();

        for (int i = 0; i < nbOfSubSet; i++) {
            subSet[i] = new HashSet<ITransformation>();
            for(int j = 0; j < subSetSize; j++) {
                ITransformation t = tmp.remove(r.nextInt(tmp.size()));
                subSet[i].add(t);
            }
        }
    }


    public void write(String fileName) throws IOException {
        FileWriter fw = new FileWriter(fileName);
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("nb");
        for (int i = 0; i < nbOfSubSet; i++)
            bw.write(separator+"subSet_"+i);
        bw.write("\n");

        bw.write("incorrectVariant");
        for (int i = 0; i < nbOfSubSet; i++)
            bw.write(separator+""+nbOfIncorrectVariant(subSet[i]));
        bw.write("\n");

        bw.write("sosie");
        for (int i = 0; i < nbOfSubSet; i++)
            bw.write(separator+""+ nbOfSosie(subSet[i]));

        bw.close();
    }

    protected int nbOfSosie(Set<ITransformation> set) {
        int count = 0;

        for (ITransformation transformation : set)
            if(transformation.numberOfFailure() == 0)
                count++;

        return count;
    }

    protected int nbOfIncorrectVariant(Set<ITransformation> set) {
        return set.size() - nbOfSosie(set);
    }
}
