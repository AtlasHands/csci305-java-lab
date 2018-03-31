package csci305.javalab;

public class Rock extends Element {
    public Rock(String name){
        this.name = name;
    }
    public Outcome compareTo(Element e){
        return new Outcome(e.getName(),this.getName());
    }
}
