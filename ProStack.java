//Scan all primitive data types
import java.util.ArrayList;


public class ProStackk<S> {
  
  private static final ArrayList<Integer> stacke = new ArrayList<Integer>();

  // Adds integers onto stack
  public void push(int numbero) {
    stacke.add(numbero);
  }
  public String toString() {
    String ending = "";

    for (Integer element : stacke) {
      ending += element + "\n";
    }

    return ending.toString();
  }

}
