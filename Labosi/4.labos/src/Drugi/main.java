package Drugi;

public class main {
    public static void main(String[] args) {
        StockDatabase db = new StockDatabase();
        User user1 = new User("Damir", 1, 26);
        User user2 = new User("Petar", 2, 15);

        Trade trade1 = new Trade(user1, 100, Stock.TSLA);
        Trade trade2 = new Trade(user2, 100, Stock.TSLA);

        Trade trade3 = new Trade(user1, 20, Stock.AAPX);
        Trade trade4 = new Trade(user2, 50, Stock.AAPX);

        db.addTradeToDatabase(trade1);
        db.addTradeToDatabase(trade2);
        db.addTradeToDatabase(trade3);
        db.addTradeToDatabase(trade4);

        System.out.println(user1.getName());
        System.out.println(user2.isAdultStatus());

        System.out.println(trade1.getPrice());

        System.out.println("\nTrades by user Damir");
        for (Trade t: db.getTradesByUserID(1)) {
            System.out.println(t.getPrice());
        }

        System.out.println("\nAll trades");
        for (Trade t: db.getAllTrades()) {
            System.out.println(t.getPrice());
        }
    }
}
