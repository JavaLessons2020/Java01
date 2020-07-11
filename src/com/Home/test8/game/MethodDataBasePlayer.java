package com.Home.test8.game;


import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class MethodDataBasePlayer {

    private DataBasePlayer dataBasePlayer;
    WritingOneGame writingOneGame=new WritingOneGame();
    ComparePlayer comparePlayer = new ComparePlayer();

    public MethodDataBasePlayer() {
        dataBasePlayer = new DataBasePlayer();
        //create defaulted data base players
        dataBasePlayer.defaultedDataBasePlayers();
    }

    //добавление нового игрока
    public void addNewPlayers(String newName) {
        boolean flag = true;
        String nameNewGame = null;
        Game newGame = new Game();
        Integer newWriting = 0;
        for (int i = 0; i < dataBasePlayer.getPlayers().size(); i++) {
            if (newName.equalsIgnoreCase(dataBasePlayer.getPlayers().get(i).getName())) {
                System.err.println("This name is busy!!!");
                flag = false;
                break;
            }
        }
        if (flag) {
            while (true) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter name of game:");
                nameNewGame = scanner.nextLine();
                System.out.println("Enter his writing (integer number):");
                try {
                    newWriting = scanner.nextInt();
                } catch (InputMismatchException e) {
                    System.err.println("You enter not integer number!!!");
                    e.printStackTrace();
                }
                newGame.games.put(nameNewGame, newWriting);

                scanner = new Scanner(System.in);
                System.out.println("You wont continue enter games? Yes(press any kay)/No ");
                String choice = scanner.next();
                if (choice.equalsIgnoreCase("no")) {
                    break;
                }
            }
        }
        if (flag) {
            dataBasePlayer.getPlayers().add(new Player(newName, newGame, null));                            // недостижимое значение!!! Внутри  предыдущего if вне while
        }
    }

    //изменение рейтинга игрока
    public void changeWritingPlayer(String namePlayer, String nameGame, Integer changeWriting) {
        for (int i = 0; i < dataBasePlayer.getPlayers().size(); i++) {
            if (namePlayer.equalsIgnoreCase(dataBasePlayer.getPlayers().get(i).getName())) {
                if (dataBasePlayer.getPlayers().get(i).getGame().getGames().get(nameGame) != null) {
                    Integer cashWriting = dataBasePlayer.getPlayers().get(i).getGame().getGames().get(nameGame);
                    dataBasePlayer.getPlayers().get(i).getGame().getGames().put(nameGame, cashWriting + changeWriting);
                    break;
                } else if (dataBasePlayer.getPlayers().get(i).getGame().getGames().get(nameGame) == null && i == dataBasePlayer.getPlayers().size() - 1) {
                    System.err.println("This player not play this game!!!");
                }
            } else if (!namePlayer.equalsIgnoreCase(dataBasePlayer.getPlayers().get(i).getName()) && i == dataBasePlayer.getPlayers().size() - 1) {
                System.err.println("This player not is in the data base!!!");
            }
        }
    }

    //список игор
    public void fullListGame() {
        TreeSet<String> listGame = new TreeSet<>();
        for (int i = 0; i < dataBasePlayer.getPlayers().size(); i++) {
            Set<String> cashListGame = dataBasePlayer.getPlayers().get(i).getGame().getGames().keySet();
            listGame.addAll(cashListGame);
        }
        //System.out.println(listGame.toString());
        Iterator<String> itr = listGame.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println();                       // для красоты)))
    }

    //поиск игрока по имени (если игрока нет, то возвнращает null)
    public Player findPlayer(String namePlayer) {
        for (int i = 0; i < dataBasePlayer.getPlayers().size(); i++) {
            if (namePlayer.equalsIgnoreCase(dataBasePlayer.getPlayers().get(i).getName())) {
                return dataBasePlayer.getPlayers().get(i);
            }
        }
        return null;
    }

    //поиск рейтинга в MAP игрока по игре (если нет такой игры в его маре то возвращает null)
    public Integer findPlayerWriting(Player myPlayer, String nameOfGame) {
        return myPlayer.getGame().getGames().get(nameOfGame);
    }

    //размер ArrayList Players
    public int sizePlayers() {
        return dataBasePlayer.getPlayers().size();
    }

    //создание рейтинга по определнной игре
    public void writingPlayerOneGame(String nameOfGame) {
        int flag = 0;
        ArrayList< WritingOneGame>writingPlayerOneGame = new ArrayList<>();

        for (int i = 0; i < dataBasePlayer.getPlayers().size(); i++) {
            if (dataBasePlayer.getPlayers().get(i).getGame().getGames().get(nameOfGame) != null) {
                //получили элемент мар с именем игрока и его рейтингом в определенной игре
                writingPlayerOneGame.add(new WritingOneGame(dataBasePlayer.getPlayers().get(i).getName(), dataBasePlayer.getPlayers().get(i).getGame().getGames().get(nameOfGame)));
                flag++;
            } else if (i == dataBasePlayer.getPlayers().size() - 1 && flag == 0) {
                System.err.println("This game not be!!!");
            }
        }
        writingPlayerOneGame.sort(new CompareWritingOneGame());   //отсортированно
        for (WritingOneGame oneGame : writingPlayerOneGame) {
            System.out.println(oneGame.toString());
        }
    }

    //создание рейтинга по всем играм
    public void allWriting(){
        Integer sumWriting = 0;
        for (int i = 0; i < dataBasePlayer.getPlayers().size(); i++) {
            Collection<Integer> sum ;
            sum =  dataBasePlayer.getPlayers().get(i).getGame().getGames().values();
            Iterator<Integer>iter = sum.iterator();
            while(iter.hasNext()){
                sumWriting += iter.next();
            }
            System.out.println("sumWriting = " + sumWriting);
            dataBasePlayer.getPlayers().get(i).setFullWriting( sumWriting/ sum.size());
        }
        dataBasePlayer.getPlayers().sort(new ComparePlayer());  //отсортированно
        for (int i = 0; i < dataBasePlayer.getPlayers().size(); i++) {
            System.out.println(dataBasePlayer.getPlayers().get(i).getFullWriting()+"\t"+dataBasePlayer.getPlayers().get(i).getName());
        }
    }

    public void printToString() {
        System.out.println(dataBasePlayer.getPlayers().toString());
    }
}
