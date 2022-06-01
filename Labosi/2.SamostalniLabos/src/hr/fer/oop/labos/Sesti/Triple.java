package hr.fer.oop.labos.Sesti;

public class Triple<T> {
    private T prvi;
    private T drugi;
    private T treci;
    public Triple(T first, T second, T third) {
        this.prvi=first;
        this.drugi=second;
        this.treci=third;
    }

    T getElement(int index) {
        if (index == 1)
            return prvi;
        else if (index == 2)
            return drugi;
        else if (index == 3)
            return treci;
        else
            throw new IllegalArgumentException();
    }

    void setElement(int index, T value) {
        if (index == 1)
            prvi = value;
        else if (index == 2)
            drugi = value;
        else if (index == 3)
            treci = value;
        else
            throw new IllegalArgumentException();
    }

}
