package csci305.javalab;

public abstract class Player {
    String name;
    public void Player(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public abstract Element play();
}
