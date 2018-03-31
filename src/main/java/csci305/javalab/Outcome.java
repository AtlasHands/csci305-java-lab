package csci305.javalab;

import java.util.Map;

public class Outcome{
    private String result;
    private int win = -1;
    public static final Map<String,Element> moves = null;
    public Outcome(String one, String two){
        String[] both = {one,two};
        if(contains(both,"Scissors") && contains(both,"Rock")){
            result = "Rock crushes Scissors";
            if(one.equals("Scissors")){
                win = 0;
            }else{
                win = 1;
            }
        }
        if(contains(both,"Paper") && contains(both,"Rock")){
            result = "Paper covers Rock";
            if(one.equals("Paper")){
                win = 1;
            }else{
                win = 0;
            }
        }
        if(contains(both,"Lizard") && contains(both,"Rock")){
            result = "Rock crushes Lizard";
            if(one.equals("Lizard")){
                win = 0;
            }else{
                win = 1;
            }
        }
        if(contains(both,"Scissors") && contains(both,"Paper")){
            result = "Scissors cut Paper";
            if(one.equals("Paper")){
                win = 0;
            }else{
                win = 1;
            }
        }
        if(contains(both,"Lizard") && contains(both,"Spock")){
            result = "Lizard poisons Spock";
            if(one.equals("Spock")){
                win = 0;
            }else{
                win = 1;
            }
        }
        if(contains(both,"Scissors") && contains(both,"Spock")){
            result = "Spock smashes Scissors";
            if(one.equals("Scissors")){
                win = 0;
            }else{
                win = 1;
            }
        }
        if(contains(both,"Scissors") && contains(both,"Lizard")){
            result = "Scissors decapitate Lizard";
            if(one.equals("Lizard")){
                win = 0;
            }else{
                win = 1;
            }
        }
        if(contains(both,"Lizard") && contains(both,"Paper")){
            result = "Lizard eats Paper";
            if(one.equals("Paper")){
                win = 0;
            }else{
                win = 1;
            }
        }
        if(contains(both,"Paper") && contains(both,"Spock")){
            result = "Paper disproves Spock";
            if(one.equals("Spock")){
                win = 0;
            }else{
                win = 1;
            }
        }
        if(contains(both,"Spock") && contains(both,"Rock")){
            result = "Spock vaporizes Rock";
            if(one.equals("Rock")){
                win = 0;
            }else{
                win = 1;
            }
        }

    if(result == null){
        result = one + " equals " + two;
    }
    }
    private boolean contains(String array[],String single){
        for(int x =0;x<array.length;x++){
            if(array[x].equals(single)){
                return true;
            }
        }
        return false;
    }

    public String getResult() {
        return result;
    }
    //returns 1 if win, 0 if loss, -1 if tie
    public int didWin(){
        return win;
    }

}
