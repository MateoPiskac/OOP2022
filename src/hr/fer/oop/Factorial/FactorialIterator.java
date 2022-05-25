package hr.fer.oop.Factorial;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class FactorialIterator implements Iterator<Integer> {
    private int num;
    private int[] sequence;

    public FactorialIterator(int num) {
        if(num<0)
            throw new IllegalArgumentException();
        this.num = num;
        this.sequence = new int[num];
        int current=1;
        for (int i = 0; i < num; i++) {
            current=1;
            for(int j = 2;j<i+1;j++){
                current*=j;
            }
            sequence[i]=current;
        }
    }
    int index=0;
    @Override
    public boolean hasNext() {
        return index<num;
    }

    @Override
    public Integer next() {
        if(!hasNext())
            throw new NoSuchElementException();
        return sequence[index++];
    }
}
