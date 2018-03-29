package csci305.javalab;

public class StupidBot extends Player{
    public StupidBot(String name){
        this.name = name;
    }
    public Element play(){
        return Main.moves.get("Rock");
    }
}
