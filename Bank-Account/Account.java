import java.util.*;

public class Account {
  private String name;
  private double balance;

  public Account() {
    name = "John Doe";
    balance = 0.00;
  }

  public Account(String name, double balance) {
    this.name = name;
    this.balance = balance;
  }

  public String getName() {
    return name;
  }

  public double getBalance() {
    return balance;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public void deposit(double amount) {
    balance += amount;
  }

  public void withdrawal(double amount) {
    if (amount <= balance) {
      balance -= amount;
    }
    else {
      System.out.println("Insufficient funds");
    }
  }

  public String toString() {
    String balanceString = "";
    String output = "Name: " + name + "\n" + "Balance: $" + balanceString.format("%.2f", balance);
    return output;
  }
  
}