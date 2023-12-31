import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    final double Quarter = 0.25;
    final double Dime = 0.10;
    final double Nickel = 0.05;
    final double Penny = 0.01;

    System.out.print("Number of quarters: ");
    Scanner quartersInput = new Scanner(System.in);
    int numQuarters = quartersInput.nextInt();

    System.out.print("Number of dimes: ");
    Scanner dimesInput = new Scanner(System.in);
    int numDimes = dimesInput.nextInt();

    System.out.print("Number of nickels: ");
    Scanner nickelsInput = new Scanner(System.in);
    int numNickels = nickelsInput.nextInt();

    System.out.print("Number of pennies: ");
    Scanner penniesInput = new Scanner(System.in);
    int numPennies = penniesInput.nextInt();

    double quarterTotal = (double) (numQuarters * Quarter);
    double dimeTotal = (double) (numDimes * Dime);
    double nickelTotal = (double) (numNickels * Nickel);
    double pennyTotal = (double) (numPennies * Penny);

    double totalMoney = quarterTotal + dimeTotal + nickelTotal + pennyTotal;

    System.out.println("You have " + numQuarters + " quarters.");
    System.out.println("You have " + numDimes + " dimes.");
    System.out.println("You have " + numNickels + " nickels.");
    System.out.println("You have " + numPennies + " pennies.");
    System.out.println("Total value: $" + totalMoney);
    
  }
}