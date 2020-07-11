package com.Home.test8.game;

import java.util.Comparator;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;


//это класс необходим для сортировки по рейтингу по одной игре
public class WritingOneGame {
    private String name;
    private Integer writing;
    private TreeMap<String, Integer> writingPlayerOneGame = new TreeMap<>();

    public WritingOneGame() {
    }

    public WritingOneGame(String name, Integer writing) {
        this.name = name;
        this.writing = writing;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWriting() {
        return writing;
    }

    public void setWriting(Integer writing) {
        this.writing = writing;
    }

    public TreeMap<String, Integer> getWritingPlayerOneGame() {
        return writingPlayerOneGame;
    }

    public void setWritingPlayerOneGame(TreeMap<String, Integer> writingPlayerOneGame) {
        this.writingPlayerOneGame = writingPlayerOneGame;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WritingOneGame that = (WritingOneGame) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(writing, that.writing) &&
                Objects.equals(writingPlayerOneGame, that.writingPlayerOneGame);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, writing, writingPlayerOneGame);
    }

    @Override
    public String toString() {
        return writing + "\t" + name;
    }
}

class CompareWritingOneGame implements Comparator<WritingOneGame> {
    @Override
    public int compare(WritingOneGame o1, WritingOneGame o2) {
        return o2.getWriting().compareTo(o1.getWriting());
    }
}


