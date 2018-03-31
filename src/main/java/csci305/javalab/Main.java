package csci305.javalab;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Player player1 = null;
        Player player2 = null;
        System.out.println("Welcome to Rock, Paper, Scissors, Lizard, Spock, implemented by Keefer Sands.\n");
        System.out.print("Please choose two players:\n" +
                "     (1) Human\n" +
                "     (2) StupidBot\n" +
                "     (3) RandomBot\n" +
                "     (4) IterativeBot\n" +
                "     (5) LastPlayBot\n" +
                "     (6) MyBot\n\n");
        Scanner in = new Scanner(System.in);
        int player1Choice;
        int player2Choice;
        while(true){
            System.out.print("Select player 1: ");
            player1Choice = in.nextInt();
            if(player1Choice > 6 || player1Choice<1){
                System.out.println("Invalid player one choice. Please try again.");
            }else{
                break;
            }
        }
        while(true){
            System.out.print("Select player 2: ");
            player2Choice = in.nextInt();
            if(player2Choice > 6 || player2Choice<1){
                System.out.println("\nInvalid player one choice. Please try again.");
            }else{
                break;
            }
        }
        switch(player1Choice){
            case 1:
                player1 = new Human("Human");
                break;
            case 2:
                player1 = new StupidBot("StupidBot");
                break;
            case 3:
                player1 = new RandomBot("RandomBot");
                break;
            case 4:
                player1 = new IterativeBot("IterativeBot");
                break;
            case 5:
                player1 = new LastPlayBot("LastPlayBot");
                break;
            case 6:
                player1 = new MyBot("MyBot");
                break;
        }
        switch(player2Choice){
            case 1:
                player2 = new Human("Human");
                break;
            case 2:
                player2 = new StupidBot("StupidBot");
                break;
            case 3:
                player2 = new RandomBot("RandomBot");
                break;
            case 4:
                player2 = new IterativeBot("IterativeBot");
                break;
            case 5:
                player2 = new LastPlayBot("LastPlayBot");
                break;
            case 6:
                player2 = new MyBot("MyBot");
                break;
        }
        System.out.println("\n" + player1.getName() + " vs " + player2.getName() + ". Go!\n\n");
        for(int x =1;x<6;x++){
            System.out.println("Round " + x);
            Element p1Play = player1.play();
            Element p2Play = player2.play();
            System.out.println("Player 1 chooses " + p1Play.getName());
            System.out.println("Player 2 chooses " + p2Play.getName());
            Outcome o = p1Play.compareTo(p2Play);
            System.out.println(o.getResult());
            if(o.didWin() == 1){
                System.out.println("Player 1 won the round!");
                player1.won();
            }else if(o.didWin() == 0) {
                System.out.println("Player 2 won the round!");
                player2.won();
            }else{
                System.out.println("Round was a tie");
            }
            System.out.println("");
        }
        int p1Wins = player1.getWins();
        int p2Wins = player2.getWins();
        System.out.println("Score is " + p1Wins + " to " + p2Wins);
        if(p1Wins > p2Wins){
            System.out.println("Player 1 won!");
        }else if(p1Wins < p2Wins){
            System.out.println("Player 2 won!");
        }else{
            System.out.println("Game was a draw");
        }
    }

}
