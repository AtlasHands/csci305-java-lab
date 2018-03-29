package csci305.javalab;

public class Spock extends Element {
    public Spock(String name){
        this.name = name;
    }
    public String compareTo(Element e){
        Outcome o = new Outcome(e.getName(),this.getName());
        return o.getResult() + " -- " + o.getOutcome();
    }
}
