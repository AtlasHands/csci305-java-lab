package csci305.javalab;

public class Spock extends Element {
    public Spock(String name){
        this.name = name;
    }
    public Outcome compareTo(Element e){
        return new Outcome(e.getName(),this.getName());
    }
}
