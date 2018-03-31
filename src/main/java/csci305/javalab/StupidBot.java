package csci305.javalab;

public class StupidBot extends Player{
    public StupidBot(String name){
        this.name = name;
    }
    public Element play(){
        Element play = moves.get("Rock");
        if(TrackHistory.isTrackingHistory()){
            TrackHistory.addHistory(play);
        }
        return play;
    }
}
