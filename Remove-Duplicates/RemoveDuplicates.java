import java.util.*;

public class RemoveDuplicates {
  
  public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> x) {
    
    ArrayList<Integer> secondary = new ArrayList<Integer>();
    
    for (int i : x) {
      if (!secondary.contains(i)) {
        secondary.add(i);
      }
      else {
        System.out.println("Removed: " + i);
      }
    }

    return secondary;
  
  }
  
}
