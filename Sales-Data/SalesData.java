public class SalesData {
  
  private double[] sales;

  public SalesData(double[] x) {
    sales = new double[x.length];
    for (int i = 0; i < x.length; i++) {
      sales[i] = x[i];
    }
  }

  public double getTotal() {
    double counter = 0.0;
    
    for (int i = 0; i < sales.length; i++) {
      counter += sales[i];
    }

    return counter;
      
  }

  public double getAverage() {
    return getTotal() / sales.length;
  }

  public double getHighest() {

    int highest = -1;
    
    for (int i = 0; i < sales.length; i++) {
      if (sales[i] > (double) highest) {
        highest = (int) sales[i];
      }
    }

    return highest;
    
  }

   public double getLowest() {

    int lowest = 99999999;
    
    for (int i = 0; i < sales.length; i++) {
      if (sales[i] < (double) lowest) {
        lowest = (int) sales[i];
      }
    }

    return lowest;
    
  }

  public String toString() {
    String result = "Sales data: \n";

    for (int i = 0; i < sales.length; i++) {
      result += "$" + String.format("%.2f", sales[i]) + "\n";
    }

    return result;
    
  }
  
}