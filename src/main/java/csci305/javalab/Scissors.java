package csci305.javalab;

public class Scissors extends Element {
    public Scissors(String name){
        this.name = name;
    }
    public String compareTo(Element e){
        Outcome o = new Outcome(e.getName(),this.getName());
        return o.getResult() + " -- " + o.getOutcome();
    }
}
