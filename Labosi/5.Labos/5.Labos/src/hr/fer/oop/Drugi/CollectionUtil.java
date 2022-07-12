package hr.fer.oop.Drugi;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.function.BiFunction;
import java.util.Collection;

public class CollectionUtil {
    public static <T, R, S> LinkedList<S> myZip(Collection<T> colla, Collection<R> collb, BiFunction<T,R,S> zipper){
        //calls bifunction on each element of colla and collb, returns results in a linked list
        //if collections are different sizes only apply zipper to the smaller collection
        //zipper: bifunction that takes two elements of colla and collb and returns a result of type S
        //returns: collection of type S
        LinkedList<S> ret = new LinkedList<>();
        int aSize=colla.size();
        int bSize=collb.size();
        int minSize=Math.min(aSize, bSize);
        Iterator<T> ita=colla.iterator();
        Iterator<R> itb=collb.iterator();
        while (ita.hasNext() && itb.hasNext()){
            T a=ita.next();
            R b=itb.next();
            ret.add(zipper.apply(a,b));
        }

        return ret;
    }
}
