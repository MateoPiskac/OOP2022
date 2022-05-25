package hr.fer.oop.Fibonacci;

import java.util.Iterator;

public class main {
    public static void main(String[] args) {
        Iterator<Integer> iterator = new FibonacciIterator(-1);
        while(iterator.hasNext())
            System.out.println(iterator.next());
    }
}
