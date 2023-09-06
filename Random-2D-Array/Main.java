import java.util.*;

class Main {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    System.out.println();
    System.out.print("Enter square array's integer side length: ");
    int n = input.nextInt();
    System.out.println("The random array is: ");

    int[][] array = new int[n][n];
    ArrayList<Integer> rows = new ArrayList<Integer>();
    ArrayList<Integer> cols = new ArrayList<Integer>();

    int rowCounter = 0;
    int colCounter = 0;
    
    for (int i = 0; i < n; i++) {
      for (int x = 0; x < n; x++) {
        int randomNum = (int)(Math.random() * 2);
        array[i][x] = randomNum;
        System.out.print(array[i][x] + " ");
        if (randomNum == 1) {
          rowCounter++;
        }
      }
      System.out.println();
      rows.add(rowCounter);
      rowCounter = 0;
    }
    
    for (int i = 0; i < n; i++) {
      for (int x = 0; x < n; x++) {
        if (array[x][i] == 1) {
          colCounter++;
        }
      }
      cols.add(colCounter);
      colCounter = 0;
    }

    ArrayList<Integer> rowIndexes = new ArrayList<Integer>();
    ArrayList<Integer> colIndexes = new ArrayList<Integer>();
    
    int rowMax = Collections.max(rows);
    int colMax = Collections.max(cols);

    for (int i = 0; i < rows.size(); i++) {
      if (rows.get(i) == rowMax) {
        rowIndexes.add(i);
        rows.remove(i);
        rows.add(i, 0);
      }
      if (cols.get(i) == colMax) {
        colIndexes.add(i);
        cols.remove(i);
        cols.add(i, 0);
      }
    }
    
    System.out.println("Row index with most non-zero digits: " + rowIndexes);
    System.out.println("Column index with most non-zero digits: " + colIndexes);
    
  }
}