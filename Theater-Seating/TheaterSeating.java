public class TheaterSeating {

  public static int getLocation(int[][] array, int row, int col) {

    int seat = array[row][col];

    return seat;
    
  }

  public static int getPrice(int[][] array, int price) {

    int x = -1;
    
    outerloop:
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[0].length; j++) {
        if (array[i][j] == price) {
          x = array[i][j];
          array[i][j] = 0;
          break outerloop;
        }
      }
    } 
    return x;
  }
  
}