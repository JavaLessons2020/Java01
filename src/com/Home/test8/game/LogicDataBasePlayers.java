package com.Home.test8.game;

import java.util.Scanner;

public class LogicDataBasePlayers {

    public LogicDataBasePlayers() {
    }

    public void workDataBase() {

        Menu menu = new Menu();
        MethodDataBasePlayer methodDataBasePlayers = new MethodDataBasePlayer();
        while (true) {
            menu.menu();
            Scanner scanner = new Scanner(System.in);
            switch (menu.getChoice()) {
                case 1:
                    System.out.println("Enter new player's name:");
                    String newName = scanner.nextLine();
                    methodDataBasePlayers.addNewPlayers(newName);
                    break;
                case 2:
                    System.out.println("Enter name player's name:");
                    String namePlayer = scanner.nextLine();
                    System.out.println("Enter name of game:");
                    String nameGame = scanner.nextLine();
                    System.out.println("Enter change writing (integer number):");
                    Integer changeWriting = scanner.nextInt();
                    methodDataBasePlayers.changeWritingPlayer(namePlayer, nameGame, changeWriting);
                    break;
                case 3:
                    methodDataBasePlayers.fullListGame();
                    break;
                case 4:
                    Player myPlayer = null;
                    String nameOfGame = null;
                    Integer myWriting = null;
                    while (true) {
                        System.out.println("Enter player's name:");
                        namePlayer = scanner.nextLine();
                        myPlayer = methodDataBasePlayers.findPlayer(namePlayer);
                        if (myPlayer == null) {
                            System.err.println("This player not be!!!");
                        } else {
                            break;
                        }
                    }
                    while (true) {
                        System.out.println("Enter name of the game:");
                        nameOfGame = scanner.nextLine();
                        myWriting = methodDataBasePlayers.findPlayerWriting(myPlayer, nameOfGame);
                        if (myWriting == null) {
                            System.err.println("This player don't play this the game!!!");
                        } else {
                            System.out.println(namePlayer + " [" + nameOfGame + "] writing - " + myWriting);
                            System.out.println();
                            break;
                        }
                    }
                    break;
                case 5:
                    System.out.println("Enter name of the game:");
                    nameOfGame = scanner.nextLine();
                    methodDataBasePlayers.writingPlayerOneGame(nameOfGame);
                    break;
                case 6:
                    methodDataBasePlayers.allWriting();
                    break;
                case 7:
                    methodDataBasePlayers.printToString();
                    break;


            }
        }
    }
}
