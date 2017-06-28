package fr.inria.diversify.transformation.query;

import fr.inria.diversify.transformation.RandomProtocol;
import org.junit.Test;

import java.util.List;
import java.util.Random;

import static org.junit.Assert.*;

/**
 * Created by nharrand on 27/06/17.
 */
public class RandomProtocolQueryTest {
    public int sum(List<Integer> l) {
        int r = 0;
        for(Integer i : l) r += i;
        return r;
    }

    @Test
    public void testComposition() {
        List res;
        int n = 5;
        Random rand = new Random();
        for(int a = 0; a < 10; a++) {
            int i = rand.nextInt((int) Math.pow(2,n-1));
            res = RandomProtocol.composition(i,n-1);
            assertTrue(res.size() <= n);
            assertTrue(sum(res) == n);
        }
    }
}