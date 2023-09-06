public class Instructor extends Person {

  private int salary;

  public Instructor() {
    super();
    salary = 25000;
  }

  public Instructor(String name, int birthYear, int salary) {
    super(name, birthYear);
    this.salary = salary;
  }

  public String toString() {
    return "" + super.toString() + "\nSalary: $" + salary;
  }
  
}