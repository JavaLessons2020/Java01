package com.Home.test8.game;

import java.util.Comparator;
import java.util.Objects;

public class Player {
    private String name;
    private Game game;
    private Integer fullWriting;

    public Player(){ game = new Game(); }

    public Player(String name, Game game, Integer fullWriting) {
        this.name = name;
        this.game = game;
        this.fullWriting = fullWriting;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public Integer getFullWriting() {
        return fullWriting;
    }

    public void setFullWriting(Integer fullWriting) {
        this.fullWriting = fullWriting;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return Objects.equals(name, player.name) &&
                Objects.equals(game, player.game);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, game);
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", game=" + game +
                ", fullWriting=" + fullWriting +
                '}' + "\n";
    }
}

class ComparePlayer implements Comparator<Player> {
    @Override
    public int compare(Player o1, Player o2) {
        return o2.getFullWriting().compareTo(o1.getFullWriting());
    }
}
