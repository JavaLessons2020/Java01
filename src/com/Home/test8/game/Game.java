package com.Home.test8.game;

import java.util.Comparator;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

public class Game  {
    private String game;
    private Integer positionWriting;
    Map<String, Integer> games = new TreeMap<>();

    public Game(){ }

    public String getGame() {
        return game;
    }

    public void setGame(String game) {
        this.game = game;
    }

    public Game(Map<String, Integer> games) {
        this.games = games;
    }

    public Map<String, Integer> getGames() {
        return games;
    }

    public void setGames(Map<String, Integer> games) {
        this.games = games;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game game1 = (Game) o;
        return Objects.equals(game, game1.game) &&
                Objects.equals(positionWriting, game1.positionWriting) &&
                Objects.equals(games, game1.games);
    }

    @Override
    public int hashCode() {
        return Objects.hash(game, positionWriting, games);
    }

    @Override
    public String toString() {
        return "Game{" +
                "games=" + games +
                '}';
    }
}


