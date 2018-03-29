package csci305.javalab;

public class Paper extends Element {
    public Paper(String name){
        this.name = name;
    }
    public String compareTo(Element e){
        Outcome o = new Outcome(e.getName(),this.getName());
        return o.getResult() + " -- " + o.getOutcome();
    }
}
