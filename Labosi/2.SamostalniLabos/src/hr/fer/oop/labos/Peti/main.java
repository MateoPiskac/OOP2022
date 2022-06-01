package hr.fer.oop.labos.Peti;

public class main {
    public static void main(String[] args) {
        KeyValue<String, Integer> kv = new KeyValue<>("pero", 5);

        XY[] data = new XY[5];

        data[0] = new XY(6, 8);
        data[1] = new XY(7.5, 8.5);
        data[2] = new XY(9, 9);
        data[3] = new XY(10, 10);
        data[4] = new XY(8, 8.9);

        System.out.println(XY.isIncreasingFunction(data));


    }
}
