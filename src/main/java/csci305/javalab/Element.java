package csci305.javalab;

public abstract class Element {
    String name;
    public String getName(){
        return name;
    }
    public abstract Outcome compareTo(Element e);
}
