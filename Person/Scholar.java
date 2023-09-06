public class Scholar extends Person {
  
  private String major;

  public Scholar() {
    super();
    major = "Computer science";
  }

  public Scholar(String name, int birthYear, String major) {
    super(name, birthYear);
    this.major = major;
  }

  public String toString() {
    return "" + super.toString() + "\nMajor: " + major;
  }

}