package com.Home.test8.game;

import java.util.ArrayList;

public class DataBasePlayer {
    private Player player;
    private ArrayList<Player> players = new ArrayList<>();

    public DataBasePlayer(){ player = new Player(); }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public void defaultedDataBasePlayers(){
        Game game0 = new Game();
        game0.games.put("Срелялка 1", 15);
        game0.games.put("Срелялка 2", 25);
        game0.games.put("Бродилка 1", 31);
        game0.games.put("Бродилка 2", 2);
        game0.games.put("Леталка 1", 7);
        players.add(new Player("Маленький таракан", game0, null));

        Game game1 = new Game();
        game1.games.put("Срелялка 2", 2);
        game1.games.put("Бродилка 1", 3);
        game1.games.put("Леталка 1", 42);
        players.add(new Player("Крылатый клоп", game1, null));

        Game game2 = new Game();
        game2.games.put("Срелялка 1", 7);
        game2.games.put("Срелялка 2", 1);
        game2.games.put("Бродилка 1", 13);
        game2.games.put("Головоломка 1", 62);
        game2.games.put("Леталка 1", 15);
        players.add(new Player("Леди ПФФФ", game2, null));

        Game game3 = new Game();
        game3.games.put("Бродилка 1", 54);
        game3.games.put("Головоломка 1", 36);
        players.add(new Player("Кошка)))", game3, null));

        Game game4 = new Game();
        game4.games.put("Леталка 1", 71);
        players.add(new Player("Тень", game4, null));

        Game game5 = new Game();
        game5.games.put("Срелялка 2", 13);
        game5.games.put("Бродилка 1", 6);
        game5.games.put("Головоломка 1", 8);
        players.add(new Player("Хвостатая Строшилище", game5, null));

        Game game6 = new Game();
        game6.games.put("Срелялка 2", 7);
        game6.games.put("Бродилка 1", 53);
        game6.games.put("Головоломка 1", 8);
        game6.games.put("Леталка 1", 2);
        players.add(new Player("Носорог", game6, null));

        Game game7 = new Game();
        game7.games.put("Бродилка 1", 82);
        game7.games.put("Леталка 1", 21);
        players.add(new Player("БуБуБу", game7, null));

        Game game8 = new Game();
        game8.games.put("Срелялка 1", 10);
        game8.games.put("Срелялка 2", 11);
        game8.games.put("Бродилка 1", 13);
        game8.games.put("Бродилка 2", 12);
        game8.games.put("Головоломка 1", 2);
        game8.games.put("Леталка 1", 25);
        players.add(new Player("Топор", game8, null));

        Game game9 = new Game();
        game9.games.put("Бродилка 1", 71);
        game9.games.put("Бродилка 2", 63);
        players.add(new Player("Красная Сталкерша", game9, null));

        Game game10 = new Game();
        game10.games.put("Бродилка 2", 12);
        game10.games.put("Леталка 1", 22);
        players.add(new Player("Страшила", game10, null));
    }

    @Override
    public String toString() {
        return "DataBasePlayers{" +
                "players=" + players +
                '}';
    }
}
