import java.util.Arrays;

public class MatrixMultiply {
    public static void main(String[] args) {
       int[][] one = {{1,2,3},
                        {4,5,6},
                        {7,8,9}};
        int[][] two = {{1,2,3},
                        {4,5,6},
                        {7,8,9}};
        int[][] result = new int[one.length][one[0].length];
       
        for(int i=0;i<one.length;i++){
            for(int j=0;j<one[i].length;j++){
               result[i][j]=0;
               for(int k=0;k<one[i].length;k++){
                result[i][j]+=one[i][k]*two[k][j];
               }
            }
        }
        for(int i=0;i<one.length;i++){
            System.out.println(Arrays.toString(result[i]));
        }
    }
}
