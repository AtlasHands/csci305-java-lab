package csci305.javalab;
import java.util.LinkedList;

public class TrackHistory {
    private static boolean toggle = false;
    private static LinkedList<Element> history = null;
    public static Element lastMove(){
        if(history != null){
            return history.getLast();
        }
        return null;
    }
    public static void enableHistory(){
        toggle = true;
    }
    public static void disableHistory(){
        toggle = true;
    }
    public static void addHistory(Element e){
        if(history == null){
            history = new LinkedList<Element>();
        }
        history.addLast(e);
    }
    public static boolean isTrackingHistory(){
        return toggle;
    }
}
