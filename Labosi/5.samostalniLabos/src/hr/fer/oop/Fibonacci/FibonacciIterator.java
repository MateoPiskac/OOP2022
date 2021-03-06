package hr.fer.oop.Fibonacci;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class FibonacciIterator implements Iterator<Integer> {
    private int num;
    private int[] sequence;
    int index=0;
    FibonacciIterator(int num){
        if(num<0)
            throw new IllegalArgumentException();
        this.num=num;
        this.sequence=new int[num];
        for(int i = 0;i<num;i++ ){
            if(i==0)
                sequence[i]=0;
            else if (i==1)
                sequence[i]=1;
            else
                sequence[i]=sequence[i-1]+sequence[i-2];
        }
    }

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
