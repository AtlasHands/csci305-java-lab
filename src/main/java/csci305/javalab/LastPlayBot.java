package csci305.javalab;

public class LastPlayBot extends Player{
    public LastPlayBot(String name){
        this.name = name;
        TrackHistory.enableHistory();
    }
    public Element play() {
        Element play;
        if(TrackHistory.lastMove() == null){
            play = moves.get("Lizard");
        }else{
            play = TrackHistory.lastMove();
        }
        return play;
    }
}
