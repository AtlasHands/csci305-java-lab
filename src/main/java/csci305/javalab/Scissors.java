package csci305.javalab;

public class Scissors extends Element {
    public Scissors(String name){
        this.name = name;
    }
    public Outcome compareTo(Element e){
        return new Outcome(e.getName(),this.getName());
    }
}
