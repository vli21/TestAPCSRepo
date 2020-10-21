public class Demo{
  public static void printLoop(int n) {
    int i, j;
    for(i=0; i<n; i++){
      for(j=n-i; j>0; j--){
        System.out.print(i+1);
      }
      System.out.println();
    }
  }

  public static void main(String args[]){
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
