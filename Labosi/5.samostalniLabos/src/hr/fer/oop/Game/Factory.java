package hr.fer.oop.Game;

public class Factory extends Game implements Comparable<Factory> {
    public Factory(String name,int rating) {
        super(name);
        super.setRating(rating);
    }

    static Game createGame(String name, int rating) {
         return new Factory(name,rating);
    }

    @Override
    public int compareTo(Factory o) {

        return super.getName().compareTo(o.getName());
    }
}
