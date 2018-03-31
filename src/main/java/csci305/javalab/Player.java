package csci305.javalab;

import java.util.HashMap;
import java.util.Map;

public abstract class Player {
    String name;
    private int wins = 0;
    public static Map<String,Element> moves = makeMoves();
    public String getName() {
        return name;
    }
    public abstract Element play();
    private static Map makeMoves(){
        Map<String, Element> move = new HashMap<String, Element>();
        move.put("Rock",new Rock("Rock"));
        move.put("Paper",new Rock("Paper"));
        move.put("Scissors",new Rock("Scissors"));
        move.put("Lizard",new Rock("Lizard"));
        move.put("Spock",new Rock("Spock"));
        return move;
    }
    public void won(){
        wins++;
    }
    public int getWins(){
        return wins;
    }
    public Element lastPlay;
}
