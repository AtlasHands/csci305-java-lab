package csci305.javalab;

public class IterativeBot extends Player{
    private int counter = 0;
    public IterativeBot(String name){
        this.name = name;
    }
    public Element play(){
        Element play = null;
        if(counter == 5){
            counter = 0;
        }
        if(counter == 0){
            play = moves.get("Rock");
        }
        else if(counter == 1){
            play = moves.get("Paper");
        }
        else if(counter == 2){
            play = moves.get("Scissors");
        }
        else if(counter == 3){
            play = moves.get("Lizard");
        }
        else if(counter == 4){
            play = moves.get("Spock");
        }
        if(TrackHistory.isTrackingHistory()){
            TrackHistory.addHistory(play);
        }
        counter++;
        return play;
    }
}
