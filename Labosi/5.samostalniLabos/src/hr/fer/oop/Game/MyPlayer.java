package hr.fer.oop.Game;

import java.util.*;


public class MyPlayer extends Player implements Iterable<Game>{
    Map<Game, List<Integer>> scores = new HashMap<>();

    @Override
    public Iterator<Game> iterator() {
        Set<Game> games = new TreeSet<>(scores.keySet());
        return games.iterator();
    }

    @Override
    Iterable<Integer> getScores(Game game) {
        return scores.get(game);
    }

    public Collection<Integer> getScores(Factory g) {
        return scores.get(g);
    }

    public MyPlayer(String name) {
        super(name);
    }

    @Override
    void addGameScore(Game game, int score) {
        if (!scores.containsKey(game)) {
            scores.put((Factory)game, new LinkedList<Integer>());
        }
        scores.get(game).add(score);
    }
}
