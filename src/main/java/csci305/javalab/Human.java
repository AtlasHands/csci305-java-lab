package csci305.javalab;

import java.util.Scanner;

public class Human extends Player{
    public Human(String name){
        this.name = name;
    }
    public Element play() {
        Element play = null;
        System.out.println("  (1) : Rock\n" +
                "  (2) : Paper\n" +
                "  (3) : Scissors\n" +
                "  (4) : Lizard\n" +
                "  (5) : Spock");
        Scanner in = new Scanner(System.in);
        int answer;
        while(true){
            System.out.print("Enter your move: ");
            answer = in.nextInt();
            if(answer > 5 || answer < 1){
                System.out.println("Invalid move. Please try again.");
            }else{
                break;
            }
        }
        if(answer == 1){
            play = moves.get("Rock");
        }
        else if(answer == 2){
            play = moves.get("Paper");
        }
        else if(answer == 3){
            play = moves.get("Scissors");
        }
        else if(answer == 4){
            play = moves.get("Lizard");
        }
        else if(answer == 5){
            play = moves.get("Spock");
        }
        if(TrackHistory.isTrackingHistory()){
            TrackHistory.addHistory(play);
        }
        return play;
    }
}
