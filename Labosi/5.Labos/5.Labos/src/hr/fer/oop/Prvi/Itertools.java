package hr.fer.oop.Prvi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Itertools {

    public static <T> Iterable<T> chain(Iterable<T>... iterables) {
        return () -> new ChainIterator<>(iterables);
    }

    private static class ChainIterator<T> implements Iterator<T> {

        private List<T> list = new ArrayList<>();
        private Iterator<T> it = null;

        public ChainIterator(Iterable<T>...iterables) {
            for (var itrbl : iterables) {
                for (T el : itrbl) {
                    list.add(el);
                }
            }
            it = list.iterator();
        }

        @Override
        public boolean hasNext() {
            // TODO Auto-generated method stub
            return it.hasNext();
        }

        @Override
        public T next() {
            // TODO Auto-generated method stub
            return it.next();
        }

    }

}