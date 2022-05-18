package Drugi;

public class Trade implements Comparable<Trade> {
    private User user;
    private int price;
    private Stock stock;
    private boolean isValid;

    public Trade(User user, int price, Stock stock) {
        this.user = user;
        this.price = price;
        this.stock = stock;
        if (user.isAdultStatus())
            isValid = true;
        else
            isValid = false;
    }

    public User getUser() {
        return user;
    }

    public int getPrice() {
        return price;
    }

    public Stock getStock() {
        return stock;
    }

    public boolean isValid() {
        return isValid;
    }

    @Override
    public int compareTo(Trade t1) {
        if (this.getPrice() > t1.getPrice())
            return 1;
        else if (this.getPrice() < t1.getPrice())
            return -1;
        else
            return 0;
    }
}
