package hr.fer.oop.MyFilter;

import java.util.Collection;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

public class CollectionUtil {
    //return agregate all elements in collection coll after applying binary operator op to all elements that satisfy predicate pred
    //init is the initial value of the reduction
    //if coll is empty, return init
    public static <T> T myFilterReduce(Collection<T> coll,  T init, Predicate<T> pred,BinaryOperator<T> op) {
        if(coll==null)
            throw new NullPointerException();
        T result = init;
        for (T t : coll) {
            if (pred.test(t)) {
                result = op.apply(result, t);
            }
        }
        return result;
    }

}
