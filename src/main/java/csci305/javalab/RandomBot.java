package csci305.javalab;

import java.util.Random;

public class RandomBot extends Player {
    public RandomBot(String name){
        this.name = name;
    }
    public Element play(){
        Element play = null;
        Random r = new Random();
        int random = r.nextInt(moves.size()) + 1;
        if(random == 1){
            play = moves.get("Rock");
        }
        else if(random == 2){
            play = moves.get("Paper");
        }
        else if(random == 3){
            play = moves.get("Scissors");
        }
        else if(random == 4){
            play = moves.get("Lizard");
        }
        else if(random == 5) {
            play = moves.get("Spock");
        }
        if(TrackHistory.isTrackingHistory()){
            TrackHistory.addHistory(play);
        }
        return play;
    }
}
