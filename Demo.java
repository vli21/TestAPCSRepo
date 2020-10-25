public class Demo{
  //HW 9
  public static void printLoop(int n) {
    int i, j;
    for(i=0; i<n; i++){
      for(j=n-i; j>0; j--){
        System.out.print(i+1);
      }
      System.out.println();
    }
  }


//HW 10  Part2a
  public static String arrToString(int[] arr){
    String OneDArray = "{";
    if (arr.length == 0){
      OneDArray="{}";
    }
    for (int i=0; i< arr.length; i++){
      if (i == arr.length-1){
        OneDArray= OneDArray + arr [i] +"}";
      }
      else{
      OneDArray= OneDArray + arr [i] + ", ";
      }
    }
    return OneDArray;
  }


  public static String arrayDeepToString(int[][] arr){
    String TwoDArray = "{";
    if (arr.length == 0){
      TwoDArray="{}";
    }
    for (int i=0; i< arr.length; i++){
      if (i==arr.length-1){
        TwoDArray= TwoDArray+arrToString(arr[i])+"}";
      }
      else{
      TwoDArray= TwoDArray+arrToString(arr[i])+", ";
    }
    }
    return TwoDArray;
  }


    //HW10 Part2b
    public static int[][] create2DArray(int rows, int cols, int maxValue ){
      int[][] Array2 = new int[rows][cols];

      for(int i=0; i<rows; i++) {
        for(int j=0; j<cols; j++) {
          int x = (int )(Math.random() * (maxValue+1));
          Array2[i][j] = x;
        }
      }
      return Array2;
    }


    public static int[][] create2DArrayRandomized(int rows, int cols, int maxValue){
      int[][] Array2 = new int[rows][];

      for(int i=0; i<rows; i++) {
        Array2[i]= new int [(int) (Math.random() * (cols+1))];
        for(int j=0; j<Array2[i].length; j++) {
          int x = (int) (Math.random() * (maxValue+1));
          Array2[i][j] = x;
        }
      }
      return Array2;
    }


  public static void main(String args[]){
    // HW 10 Part 2a
    int[][] arr= {
       {1, 2, 3},
       {4, 5, 6},
       {7, 8, 9},
       {10,11,12}
    };

    System.out.println (arrayDeepToString(arr));
    System.out.println (arrayDeepToString(arr).replace("}, ","},\n "));
    System.out.println ((int )(Math.random() * (5)));
    //Testing to see if random function truly gave a random value

    //HW10 Part2b
    System.out.println (arrayDeepToString(create2DArray(5,4,4)).replace("}, ","},\n "));
    System.out.println (arrayDeepToString(create2DArrayRandomized(6,4,4)).replace("}, ","},\n "));


    //HW 9
    if (args.length == 0){
      int n=5;
      printLoop(n);
    }
    else{
    int n= Integer.parseInt(args[0]);
    printLoop(n);
  }
  }
}
