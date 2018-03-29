package csci305.javalab;

import java.util.Random;

public class RandomBot extends Player {
    public RandomBot(String name){
        this.name = name;
    }
    public Element play(){
        Random r = new Random();
        int random = r.nextInt(Main.moves.size()) + 1;
        if(random == 1){
            return Main.moves.get("Rock");
        }
        if(random == 2){
            return Main.moves.get("Paper");
        }
        if(random == 3){
            return Main.moves.get("Scissors");
        }
        if(random == 4){
            return Main.moves.get("Lizard");
        }
        if(random == 5) {
            return Main.moves.get("Spock");
        }
        return null;
    }
}
