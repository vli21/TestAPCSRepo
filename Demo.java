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


  public static String arrayDeepToString(int[][]arr){
    //int x=0; Test to see if my code was able to count every value in array.
    String TwoDArray= "{";
    for (int i=0; i< arr.length; i++ ){
      for (int j=0;j<arr[i].length;j++){
        //x+=1; Test to see if my code was able to count every value in array.
        if (j==0){
          TwoDArray=TwoDArray+ "{"+ arr[i][j]+",";
        }
        if (j!=0 && j!=arr.length-1){
          TwoDArray=TwoDArray+ arr[i][j] + ",";
        }
        if (j==arr[i].length-1){
          if (i !=arr.length-1){
          TwoDArray=TwoDArray+ arr[i][j]+ "}, ";
        }
        else{
        TwoDArray=TwoDArray+ "}";
      }
        }
      }
      if (i==arr.length-1){
        TwoDArray=TwoDArray+ "}";
      }
    }
    //return Integer.toString(x); Test to see if my code was able to count every value in array.
    return TwoDArray;
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
