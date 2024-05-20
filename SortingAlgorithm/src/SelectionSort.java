import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr ={2,7,1,4,10,3,6};
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public void selectionSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
        {
            int min = i;
            for (int j = i+1; j < n; j++){
                if (arr[j] < arr[min])
                    min = j;
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
}