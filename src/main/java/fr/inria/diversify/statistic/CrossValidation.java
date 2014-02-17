package fr.inria.diversify.statistic;

import fr.inria.diversify.transformation.Transformation;

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
    protected Set<Transformation>[] subSet;
    protected int nbOfSubSet;
    protected char separator = ';';

    public CrossValidation(Collection<Transformation> transformations, int nbOfSubSet) {
        this.nbOfSubSet = nbOfSubSet;
        int subSetSize = (int) (((double)transformations.size())/(double)nbOfSubSet);
        subSet = new HashSet[nbOfSubSet];
        LinkedList<Transformation> tmp = new LinkedList<Transformation>(transformations);
        Random r = new Random();

        for (int i = 0; i < nbOfSubSet; i++) {
            subSet[i] = new HashSet<Transformation>();
            for(int j = 0; j < subSetSize; j++) {
                Transformation t = tmp.remove(r.nextInt(tmp.size()));
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

    protected int nbOfSosie(Set<Transformation> set) {
        int count = 0;

        for (Transformation transformation : set)
            if(transformation.getStatus() == 0)
                count++;

        return count;
    }

    protected int nbOfIncorrectVariant(Set<Transformation> set) {
        return set.size() - nbOfSosie(set);
    }
}
