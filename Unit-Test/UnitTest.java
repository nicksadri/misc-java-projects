public class UnitTest {
  private String[] answerKey = {"B", "D", "C", "A", "E", "A", "B", "A", "E", "B", "B", "E", "E", "D", "D", "A", "C", "C", "A", "E"};
  private String[] studentAns;
  private int numCorrect = 0;
  
  public UnitTest(String[] ans) {
    
    studentAns = new String[ans.length];
    
    for (int i = 0; i < ans.length; i++) {
      studentAns[i] = ans[i].toUpperCase();
    }
    
  }
  
  public String[] getStudentAns() {
    return studentAns;
  }

  public int totalCorrect() {
      
    for (int i = 0; i < studentAns.length; i++) {
      if (studentAns[i].equals(answerKey[i])) {
        numCorrect++;
      }
    }

    return numCorrect;
      
    }

  public int totalMistakes() {
    int numIncorrect = studentAns.length - numCorrect;
    return numIncorrect;
  }

  public boolean isPassing() {
    if (numCorrect >= 14) {
      return true;
    }
    else {
      return false;
    }
    
  }

  public String toString() {
    String header = "ANSWER KEY \t STUDENT ANSWER \n";
    String ans = "";
    for (int i = 0; i < studentAns.length; i++) {
      ans += "" + answerKey[i] + "\t" + "\t" + "\t" + "\t" + studentAns[i] + "\n";
    }
    return "" + header + ans;
    
  }
  
}
