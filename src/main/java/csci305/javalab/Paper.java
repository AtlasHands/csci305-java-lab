package csci305.javalab;

public class Paper extends Element {
    public Paper(String name){
        this.name = name;
    }
    public Outcome compareTo(Element e){
        return new Outcome(e.getName(),this.getName());
    }
}
