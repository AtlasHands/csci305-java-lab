package csci305.javalab;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static Map<String,Element> moves = makeMoves();
    public static void main(String[] args) {
        Player p = new StupidBot("StupidBot");
        Player p1 = new RandomBot("RandomBot");

        System.out.println(p1.play().getName() + " " +p1.play().getName());
    }
    public static Map makeMoves(){
        Map<String, Element> move = new HashMap<String, Element>();
        move.put("Rock",new Rock("Rock"));
        move.put("Paper",new Rock("Paper"));
        move.put("Scissors",new Rock("Scissors"));
        move.put("Lizard",new Rock("Lizard"));
        move.put("Spock",new Rock("Spock"));
        return move;
    }
}
