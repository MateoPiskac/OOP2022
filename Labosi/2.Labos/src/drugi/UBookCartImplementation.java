package drugi;

public class UBookCartImplementation implements UBookCart {

    private float cost;
    private String[] cart;
    private int[] quantity;

    private static int index = 0;
    private static int isAdded = -1;
    private static int existsRemoved = -1;
    private static float unit;

    public UBookCartImplementation() {
        this.cost = 0;
        cart = new String[10];
        quantity = new int[10];
    }

    @Override
    public void add(String ISBN, int quantity) {
        if (index == 0) {
            unit = 1.21f; //(float) Math.random() * 10;
        }
        for (int i = 0; i < index; i++) {
            if (cart[i].equals(ISBN)) {
                isAdded = i;
            }
        }
        if (isAdded != -1) {
            this.quantity[isAdded] += quantity;
        } else {
            cart[index] = ISBN;
            this.quantity[index] += quantity;
            index++;
        }
        cost += unit * quantity;
        isAdded = -1;
    }

    @Override
    public void remove(String ISBN, int quantity) {
        for (int i = 0; i < index; i++) {
            if (cart[i].equals(ISBN)) {
                existsRemoved = i;
            }
        }
        this.quantity[existsRemoved] -= quantity;
        cost -= unit * quantity;
        if (this.quantity[existsRemoved] < 0) {
            this.quantity[existsRemoved] = 0;
        }
        if (cost < 0) {
            cost = 0.f;
        }
        existsRemoved = -1;
    }

    @Override
    public float getCost() {
        return cost;
    }
}