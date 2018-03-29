package csci305.javalab;

public class TestElement {
    public static void main(String args[]) {
        Element rock = new Rock("Rock");
        Element paper = new Paper("Paper");
        Element scissors = new Scissors("Scissors");
        System.out.println(scissors.compareTo(rock));
        System.out.println(rock.compareTo(scissors));
        System.out.println(rock.compareTo(paper));
        System.out.println(paper.compareTo(rock));
        System.out.println(rock.compareTo(rock));
    }
}
