import java.util.Arrays;
import java.util.Scanner;

class Spiral{
    public static void main(String[] args) {
      System.out.println("Enter N value for generate N x N matrix");
      Scanner in = new Scanner(System.in);
      int input = in.nextInt();
      int[][] arr = new int[input][input];
      int count =1;
      for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr.length;j++){
            arr[i][j]=count;
            count++;
        }
      }
      System.out.println("N x N Matrix");
     for(int i=0;i<input;i++){
        System.out.println(Arrays.toString(arr[i]));
      }
      int rowStart = 0;
      int rowEnd = arr.length-1;
      int columnStart = 0;
      int coulmnEnd = arr[0].length-1;
      System.out.println("Spiral form :");
      while(rowStart <= rowEnd && columnStart <= coulmnEnd){
        for(int i=rowStart;i<=coulmnEnd;i++){
          System.out.print(arr[rowStart][i] + " ");
        }
        for(int i = rowStart+1;i<=rowEnd;i++){
          System.out.print(arr[i][coulmnEnd] + " ");
        }
        if(rowStart+1<=rowEnd){
          for (int i = coulmnEnd-1; i >= columnStart; i--) {
            System.out.print(arr[rowEnd][i] + " ");
         }
        }
        if(columnStart+1 <= coulmnEnd){
          for (int i = rowEnd-1; i > rowStart; i--) {
             System.out.print(arr[i][columnStart] + " ");
          }
       }
       rowStart++;
       rowEnd--;
       columnStart++;
       coulmnEnd--;
      }
    }
}