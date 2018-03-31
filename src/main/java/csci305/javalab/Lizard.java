package csci305.javalab;

public class Lizard extends Element{
    public Lizard(String name){
        this.name = name;
    }
    public Outcome compareTo(Element e){
        return new Outcome(e.getName(),this.getName());
    }
}
