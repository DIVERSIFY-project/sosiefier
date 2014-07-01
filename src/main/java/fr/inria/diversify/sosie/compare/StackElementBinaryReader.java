package fr.inria.diversify.sosie.compare;

import fr.inria.diversify.sosie.compare.stackElement.StackTraceElement;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * A class to read stack elements from a file
 * <p/>
 * Created by marodrig on 01/07/2014.
 */
public class StackElementBinaryReader extends StackElementReader {

    DataInputStream inputStream;


    public StackElementBinaryReader(DataInputStream dataInputStream) {
        inputStream = dataInputStream;
    }

    public StackElementBinaryReader(String fileName) throws FileNotFoundException {
        inputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(fileName)));
    }

    @Override
    public StackTraceElement next() {
        return null;
    }

    //private String

}
