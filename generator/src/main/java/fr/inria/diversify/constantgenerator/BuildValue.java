package fr.inria.diversify.constantgenerator;

import org.apache.commons.math3.primes.Primes;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * User: Simon
 * Date: 03/04/15
 * Time: 10:26
 */
public class BuildValue {
    Map<Integer, Set<ObjectCreation>> valuesToObject;


    public BuildValue() {

    }


    public ObjectCreation build(int integer) {
        if(valuesToObject.containsKey(integer)) {
            return randomPick(valuesToObject.get(integer));
        }

        if(Primes.isPrime(integer)) {
            ObjectCreation minus = new ArithmeticObject(randomPick(valuesToObject.get(1)), build(integer - 1), "minus");
            addValue(integer, minus);
            return minus;
        } else {
            ObjectCreation result = null;
            int rest = integer;
            for(Integer factor : Primes.primeFactors(integer)) {
                int pow = 0;
                while((rest/factor) * factor == rest) {
                    pow++;
                    rest = rest/factor;
                }
                ObjectCreation object = new ArithmeticObject(randomPick(valuesToObject.get(1)), build(pow), "pow");
                addValue((int)Math.pow(factor, pow), object);
                if(result == null) {
                    result = object;
                } else {
                    ObjectCreation plus = new ArithmeticObject(result, object, "multi");
                    result = plus;
                    addValue((Integer) plus.getValue() + (Integer) result.getValue(), plus);
                }
            }
            return result;
        }
    }


    protected void init() {
        int[] values = {0,1,2,3,5,7,11};
        for(int integer : values) {
            if(!valuesToObject.containsKey(integer)) {
                build(integer);
            }
        }
    }

    protected ObjectCreation randomPick(Set<ObjectCreation> objectCreations) {
        return objectCreations.stream().findFirst().orElse(null);
    }

    protected void addValue(Integer value, ObjectCreation object) {
        if(!valuesToObject.containsKey(value)) {
            valuesToObject.put(value, new HashSet<>());
        }
        valuesToObject.get(value).add(object);
    }
}
