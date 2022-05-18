package Drugi;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class StockDatabase {
    Set<Trade> trades;

    public StockDatabase() {
        this.trades = new HashSet<>();
    }

    public void addTradeToDatabase(Trade trade){
        trades.add(trade);
    }

    public List<Trade> getTradesByUserID(int id) {
        List<Trade> temp = Collections.emptyList();
        for (Trade t : trades) {
            if (t.getUser().getId() == id) {
                temp.add(t);
            }
        }
        Collections.sort(temp);
        return temp;
    }

    public List<Trade> getAllTrades(){
        Collections.sort(trades.stream().toList());
        return trades;

    }

}
