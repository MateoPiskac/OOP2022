package hr.fer.oop.labos.Sesti;

public class main {
    public static void main(String[] args) {
        double x = Vector3D.dotProduct(new Vector3D(-1, 2, 5), new Vector3D(4, -3, 7));
//x je 25.0 zbog -1 * 4 + 2 * -3 + 5 * 7
//
        Triple<Number>  t1 = new Vector3D(-1, 2.3, 5);
        System.out.println(x);
    }
}
