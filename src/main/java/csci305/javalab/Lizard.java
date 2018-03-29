package csci305.javalab;

public class Lizard extends Element{
    public Lizard(String name){
        this.name = name;
    }
    public String compareTo(Element e){
        Outcome o = new Outcome(e.getName(),this.getName());
        return o.getResult() + " -- " + o.getOutcome();
    }
}
