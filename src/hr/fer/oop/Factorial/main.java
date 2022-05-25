package hr.fer.oop.Factorial;

import java.util.Iterator;

public class main {
    public static void main(String[] args) {
        Iterator<Integer> iterator = new FactorialIterator(10);
        while(iterator.hasNext())
            System.out.println(iterator.next());
    }
}
