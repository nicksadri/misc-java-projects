import java.util.*;

class Main {
  public static void main(String[] args) {
    int[][] tickets = {
      {10,10,10,10,10,10,10,10,10,10},     
      {10,10,10,10,10,10,10,10,10,10},
      {10,10,10,10,10,10,10,10,10,10},
      {10,10,20,20,20,20,20,20,10,10},
      {10,10,20,20,20,20,20,20,10,10},
      {10,10,20,20,20,20,20,20,10,10},
      {20,20,30,30,40,40,30,30,20,20},
      {20,30,30,40,50,50,40,30,30,20},
      {30,40,50,50,50,50,50,50,40,30}
    };

    Scanner input = new Scanner(System.in);

    int run = 1;
    
    while (run == 1) {
  
      System.out.println();
      
      for (int[] row : tickets) {
        for (int item : row) {
          System.out.print(item + "\t");
        }
        System.out.println();
      }

      
      System.out.println();
      
      System.out.print("Would you like to purchase a seat by location or by price? \nEnter \"l\" to shop by location, \"p\" to shop by price, or \"x\" to stop shopping: ");
      
      String selection = input.nextLine().toLowerCase();
      
      if (selection.equals("l")) {

        int row = -1;
        int col = -1;
        
        System.out.println("Enter row: ");
        row = input.nextInt();
        if (row > tickets.length || row < 1) {
          row = -1;
          System.out.println("This row does not exist. Please restart program and try again.");
        }
        
        System.out.println("Enter column: ");
        col = input.nextInt();
        if (col > tickets[0].length || col < 1) {
          col = -1;
          System.out.println("This column does not exist. Please restart program and try again.");
        }
        
        System.out.println("You selected the seat in row " + row + ", column " + col+ ". The price for this ticket is $" + TheaterSeating.getLocation(tickets, row-1, col-1) + ".");
        tickets[row-1][col-1] = 0;
        
      }
      else if (selection.equals("p")) {

        int price = 0;

        System.out.println("Enter price: ");
        price = input.nextInt();
        int location = TheaterSeating.getPrice(tickets, price);
        System.out.println("You purchased a seat for $" + location + ".");
        
      }
      else if (selection.equals("x")) {
        System.out.println("Thanks for shopping!");
        run -= 1;
      }

      input.nextLine();
      
    }
  }
}