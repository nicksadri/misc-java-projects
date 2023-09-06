import java.util.*;

class Main {
  public static void main(String[] args) {
    Person a = new Person("Jack", 2001);
    Person b = new Person("Sophia", 2005);
    Scholar c = new Scholar("Bob", 2010, "English");
    Scholar d = new Scholar("Finn", 2009, "Math");
    Instructor e = new Instructor("Bill", 1984, 58000);
    Instructor f = new Instructor("Jennifer", 1990, 22000);

    ArrayList<Person> people = new ArrayList<Person>();
    people.add(a);
    people.add(b);
    people.add(c);
    people.add(d);
    people.add(e);
    people.add(f);

    for (Person x : people) {
      System.out.println();
      System.out.println(x);
    }
    
  }
}