package hr.fer.oop.labos.Peti;

public class XY extends SingleTypeKeyValue<Double> {
    public XY(double key, double value) {
        super(key, value);
    }

    public static boolean isIncreasingFunction(XY[] data) {
        boolean increasing=true;
        for (int i = 0; i < data.length-1; i++) {
            if (((data[i + 1].getKey() - data[i].getKey()) * (data[i + 1].getValue() - data[i].getValue())) < 0)
                increasing = false;
        }
        return increasing;
    }
}
