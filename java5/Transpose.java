import java.util.Arrays;

class Transpose {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3},
                       {3, 4, 5},
                       {6, 7, 8}};
        int[][] result = new int[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                result[i][j] = arr[j][i];
            }
        }
        for (int i = 0; i < result.length; i++) {
            System.out.println(Arrays.toString(result[i]));
        }
    }
}
