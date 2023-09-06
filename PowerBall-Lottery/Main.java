import java.util.*;

class Main {
  public static void main(String[] args) {
    int winningNum1 = (int) (Math.random()*59+1);
    int winningNum2 = (int) (Math.random()*59+1);
    int winningNum3 = (int) (Math.random()*59+1);
    int winningNum4 = (int) (Math.random()*59+1);
    int winningNum5 = (int) (Math.random()*59+1);
    int powerBallNum = (int) (Math.random()*39+1);

    int prizeMoney = 0;
    
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter your 1st number: ");
    int inputNum1 = input.nextInt();
    if (inputNum1 > 59 || inputNum1 < 1) {
      System.out.println("Please ensure your inputted number is between 1 and 59. Restart program and try again.");
    }
    else {
      System.out.println("Please enter your 2nd number: ");
    }
    
    int inputNum2 = input.nextInt();
    if (inputNum2 > 59 || inputNum2 < 1) {
      System.out.println("Please ensure your inputted number is between 1 and 59. Restart program and try again.");
    }
    else {
      System.out.println("Please enter your 3rd number: ");
    }

    int inputNum3 = input.nextInt();
    if (inputNum3 > 59 || inputNum3 < 1) {
      System.out.println("Please ensure your inputted number is between 1 and 59. Restart program and try again.");
    }
    else {
      System.out.println("Please enter your 4th number: ");
    }
    
    int inputNum4 = input.nextInt();
    if (inputNum4 > 59 || inputNum4 < 1) {
      System.out.println("Please ensure your inputted number is between 1 and 59. Restart program and try again.");
    }
    else {
      System.out.println("Please enter your 5th number: ");
    }

    int inputNum5 = input.nextInt();
    if (inputNum5 > 59 || inputNum5 < 1) {
      System.out.println("Please ensure your inputted number is between 1 and 59. Restart program and try again.");
    }
    else {
      System.out.println("Please enter your PowerBall number: ");
    }

    int inputPowerBallNum = input.nextInt();
    if (inputPowerBallNum > 39 || inputPowerBallNum < 1) {
      System.out.println("Please ensure your inputted number is between 1 and 39. Restart program and try again.");
    }
      
    if (inputNum1 == winningNum1) {
      prizeMoney += 50;
    }
    if (inputNum2 == winningNum2) {
      prizeMoney += 50;
    }
    if (inputNum3 == winningNum3) {
      prizeMoney += 50;
    }
    if (inputNum4 == winningNum4) {
      prizeMoney += 50;
    }
    if (inputNum5 == winningNum5) {
      prizeMoney += 50;
    }
    if (inputPowerBallNum == powerBallNum) {
      prizeMoney += 500;
    }

    System.out.println("The winning numbers are: ");
    System.out.println(winningNum1 + "     " + winningNum2 + "     " + winningNum3 + "     " + winningNum4 + "     " + winningNum5 + "     PowerBall: " + powerBallNum);
    System.out.println("Your numbers are : ");
    System.out.println(inputNum1 + "     " + inputNum2 + "     " + inputNum3 + "     " + inputNum4 + "     " + inputNum5 + "     PowerBall: " + inputPowerBallNum);

    if (prizeMoney > 0) {
      System.out.println("Congratulations! You won " + prizeMoney + " dollars!");
    }
    else {
      System.out.println("Sorry, you did not win any money.");
    }
    
  }
}