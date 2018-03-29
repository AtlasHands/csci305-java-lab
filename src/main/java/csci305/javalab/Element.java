package csci305.javalab;

public abstract class Element {
    String name;
    public void Element(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public abstract String compareTo(Element e);
}
