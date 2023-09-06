import java.util.*;

class Main {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Enter radius: ");
    double radius = input.nextDouble();

    double area = RoundThings.calcAreaCircle(radius);
    double circumference = RoundThings.calcCircumCircle(radius);;
    double surfaceArea = RoundThings.calcAreaSphere(radius);;
    double volume = RoundThings.calcVolumeSphere(radius);;

    outPut("area", "circle", radius, area);
    outPut("circumference", "circle", radius, circumference);
    outPut("area", "sphere", radius, surfaceArea);
    outPut("volume", "sphere", radius, volume);
    
  }

  public static void outPut(String quantity, String shape, double radius, double finalValue) {
    System.out.println("The " + quantity + " of a " + shape + " with a radius of " + radius + " is " + finalValue);
  }
  
}