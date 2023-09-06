import java.util.*;

class Main {
  public static void main(String[] args) {

    double[] weekSales = new double[7];
    Scanner input = new Scanner(System.in);

    for (int i = 0; i < weekSales.length; i++) {
      System.out.println("Enter sales value " + (int)(i+1) + ": ");
      Double x = input.nextDouble();
      if (x >= 0) {
        weekSales[i] = x;
      }
      else {
        System.out.println("Invalid value. Please try again.");
      }
      
    }

    SalesData salesObject = new SalesData(weekSales);
    System.out.println("\n");
    System.out.println("Total: $" + String.format("%.2f", salesObject.getTotal()));
    System.out.println("Average: $" + String.format("%.2f", salesObject.getAverage()));
    System.out.println("Highest: $" + String.format("%.2f", salesObject.getHighest()));
    System.out.println("Lowest: $" + String.format("%.2f", salesObject.getLowest()));
    System.out.println("\n");
    System.out.println(salesObject.toString());
    
  }
}