package hr.fer.oop.labos.Sesti;

public class Vector3D<T extends Number> extends Triple<T>{
    public Vector3D(T first, T second, T third) {
        super(first, second, third);
    }
    static <T extends Number> double dotProduct(Vector3D<T> v1, Vector3D<T> v2){
        double vs1 = v1.getElement(1).doubleValue()*v2.getElement(1).doubleValue();
        double vs2 = v1.getElement(2).doubleValue()*v2.getElement(2).doubleValue();
        double vs3 = v1.getElement(3).doubleValue()*v2.getElement(3).doubleValue();
        return (vs1+vs2+vs3);
    }
}
