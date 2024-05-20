import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {7,5,10,2,1,8,6};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public void bubbleSort(int[] arr){
        boolean swapped =false;
        int n = arr.length;
        do{
                swapped = false;
                for (int i = 0;  i<n-1; i++) {
                    if (arr[i] > arr[i + 1]) {
                        int temp = arr[i];
                        arr[i] = arr[i + 1];
                        arr[i + 1] = temp;
                        swapped = true;
                    }
                }
        } while(swapped);

    }
}
