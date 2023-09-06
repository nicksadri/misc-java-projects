public class Person {
  
  private String name;
  private int birthYear;

  public Person() {
    name = "John Doe";
    birthYear = 2000;
  }

  public Person(String name, int birthYear) {
    this.name = name;
    this.birthYear = birthYear;
  }

  public String toString() {
    return "Name: " + name + "\nBirth year: " + birthYear;
  }
  
}