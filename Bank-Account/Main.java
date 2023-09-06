class Main {
 public static void main(String[] args) {
   // instantiating two objects of type Account
  Account free = new Account();
  Account what = new Account("Whatever R Us", 4000);
 
  //setting inital values to the objects
  free.setName("Y. P. Freely");
  free.setBalance(300);
 
  //Outputting the results
  System.out.println(free.toString() + "\n" + what.toString());
  System.out.println();
 
  //using mutator methods to make withdrawals
  free.withdrawal(50.25);
  what.withdrawal(350.25);
 
  //Outputting the results
  System.out.println(free.toString() + "\n" + what.toString());
  System.out.println();
 
  //using mutator methods to make withdrawals
  free.withdrawal(150);
  what.withdrawal(19.95);
 
  //Outputting the results
  System.out.println(free.toString() + "\n" + what.toString());
  System.out.println();
 
  //using mutator methods to make deposits
  free.deposit(87.34);
  what.deposit(50);
 
  //Outputting the results
  System.out.println(free.toString() + "\n" + what.toString());
 }
}