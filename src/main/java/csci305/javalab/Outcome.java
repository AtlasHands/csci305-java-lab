package csci305.javalab;

import java.util.Map;

public class Outcome{
    private String result;
    private String outcome;
    public static final Map<String,Element> moves = null;
    public Outcome(String one, String two){
        String[] both = {one,two};
        if(contains(both,"Scissors") && contains(both,"Rock")){
            result = "Rock crushes Scissors";
            if(one.equals("Scissors")){
                outcome = "Lose";
            }else{
                outcome = "Win";
            }
        }
        if(contains(both,"Paper") && contains(both,"Rock")){
            result = "Paper covers Rock";
            if(one.equals("Paper")){
                outcome = "Win";
            }else{
                outcome = "Lose";
            }
        }
        if(contains(both,"Lizard") && contains(both,"Rock")){
            result = "Rock crushes Lizard";
            if(one.equals("Lizard")){
                outcome = "Lose";
            }else{
                outcome = "Win";
            }
        }
        if(contains(both,"Scissors") && contains(both,"Paper")){
            result = "Scissors cut Paper";
            if(one.equals("Paper")){
                outcome = "Lose";
            }else{
                outcome = "Win";
            }
        }
        if(contains(both,"Lizard") && contains(both,"Spock")){
            result = "Lizard poisons Spock";
            if(one.equals("Spock")){
                outcome = "Lose";
            }else{
                outcome = "Win";
            }
        }
        if(contains(both,"Scissors") && contains(both,"Spock")){
            result = "Spock smashes Scissors";
            if(one.equals("Scissors")){
                outcome = "Lose";
            }else{
                outcome = "Win";
            }
        }
        if(contains(both,"Scissors") && contains(both,"Lizard")){
            result = "Scissors decapitate Lizard";
            if(one.equals("Lizard")){
                outcome = "Lose";
            }else{
                outcome = "Win";
            }
        }
        if(contains(both,"Lizard") && contains(both,"Paper")){
            result = "Lizard eats Paper";
            if(one.equals("Paper")){
                outcome = "Lose";
            }else{
                outcome = "Win";
            }
        }
        if(contains(both,"Paper") && contains(both,"Spock")){
            result = "Paper disproves Spock";
            if(one.equals("Spock")){
                outcome = "Lose";
            }else{
                outcome = "Win";
            }
        }
        if(contains(both,"Spock") && contains(both,"Rock")){
            result = "Spock vaporizes Rock";
            if(one.equals("Rock")){
                outcome = "Lose";
            }else{
                outcome = "Win";
            }
        }

    if(result == null){
        result = one + " equals " + two + "Tie";
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
    public String getOutcome(){
        return outcome;
    }

}
