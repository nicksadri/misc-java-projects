import java.util.*;

class Main {
  public static void main(String[] args) {
    ArrayList<Integer> data = new ArrayList<Integer>();

    System.out.println();
    System.out.print("Original list: ");
    
    for (int i = 0; i < 20; i++) {
      data.add((int)(Math.random() * 10 + 1));
      System.out.print(data.get(i) + " ");
    }
    
    System.out.println();
    ArrayList<Integer> newList = RemoveDuplicates.removeDuplicates(data);
    System.out.print("New list: ");
    for (int i : newList) {
      System.out.print(i + " ");
    }
    
  }
}