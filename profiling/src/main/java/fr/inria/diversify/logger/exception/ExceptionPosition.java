package fr.inria.diversify.logger.exception;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * User: Simon
 * Date: 23/06/15
 * Time: 10:48
 */
public class ExceptionPosition {
    private final String name;
    Map<String, Set<String>> throwPosition;
    Map<String, Set<String>> catchPosition;

    public ExceptionPosition(String name) {
        this.name = name;
        throwPosition = new HashMap<>();
        catchPosition = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void addThrow(String methodName, String localPosition, String type, String value) {
//        String key = methodName + "." + localPosition;
        String key = methodName;
        if(!throwPosition.containsKey(key)) {
            throwPosition.put(key, new HashSet<>());
        }
        throwPosition.get(key).add(type);
    }

    public void addCatch(String methodName, String localPosition, String type, String value) {
//        String key = methodName + "." + localPosition;
        String key = methodName;
        if(!catchPosition.containsKey(key)) {
            catchPosition.put(key, new HashSet<>());
        }
        catchPosition.get(key).add(type);
    }

    protected void diff(ExceptionPosition exceptionPosition,  ExceptionDiff diff) throws Exception {

        for(String position : throwPosition.keySet()) {
            if(!exceptionPosition.throwPosition.containsKey(position)) {
                diff.addThrows(name, position);
            } else {
                Set<String> set = new HashSet<>(exceptionPosition.throwPosition.get(position));
                set.removeAll(throwPosition.get(position));
                if(!set.isEmpty()) {
                    diff.addThrows(name, position);
                }
            }
        }

        for(String position : catchPosition.keySet()) {
            if(!exceptionPosition.catchPosition.containsKey(position)) {
                diff.addCatchs(name, position);
            } else {
                Set<String> set = new HashSet<>(exceptionPosition.catchPosition.get(position));
                set.removeAll(catchPosition.get(position));
                if(!set.isEmpty()) {
                    diff.addCatchs(name, position);
                }
            }
        }
    }

    public ExceptionDiff diff(ExceptionPosition other) throws Exception {
        ExceptionDiff diff = new ExceptionDiff();

        this.diff(other, diff);
        other.diff(this, diff);

        return diff;
    }
}
