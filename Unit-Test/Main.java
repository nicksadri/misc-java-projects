import java.util.*;

class Main {
  public static void main(String[] args) {
    
    String[] answerArray = new String[20];
    Scanner s = new Scanner(System.in);
    for (int i = 0; i < 20; i++) {
      System.out.println("Enter answer " + (int)(i+1) + ": ");
      answerArray[i] = s.nextLine();
    }

    UnitTest test = new UnitTest(answerArray);
    System.out.println(test.toString());
    System.out.println("Number of correct answers: " + test.totalCorrect());
    System.out.println("Number of incorrect answers: " + test.totalMistakes());
    if (test.isPassing()) {
      System.out.println("The student passed!");
    }
    else {
      System.out.println("The student failed.");
    }
    
  }
}