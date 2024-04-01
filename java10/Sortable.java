import java.util.Arrays;
import java.util.Scanner;

public interface Sortable{
    public int[] sort(int[] arr);
}
class BubbleSort implements Sortable{
    public int[] sort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
        for (int j = 0; j < n-i-1; j++)
        if (arr[j] > arr[j+1])
        {
        int temp = arr[j];
        arr[j] = arr[j+1];
        arr[j+1] = temp;
        }
        return arr;
    }
}
class QuickSort implements Sortable {
        public int[] sort(int[] arr) {
            quickSort(arr, 0, arr.length - 1);
            return arr;
        }
    
        private void quickSort(int[] arr, int low, int high) {
            if (low < high) {
                int pi = partition(arr, low, high);
                quickSort(arr, low, pi - 1);
                quickSort(arr, pi + 1, high);
            }
        }
    
        private int partition(int[] arr, int low, int high) {
            int pivot = arr[high];
            int i = (low - 1);
            for (int j = low; j < high; j++) {
                if (arr[j] < pivot) {
                    i++;
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            int temp = arr[i + 1];
            arr[i + 1] = arr[high];
            arr[high] = temp;
            return i + 1;
        }
}
class MergeSort implements Sortable {
        public int[] sort(int[] arr) {
            mergeSort(arr, 0, arr.length - 1);
            return arr;
        }
        private void mergeSort(int[] arr, int l, int r) {
            if (l < r) {
                int m = (l + r) / 2;
                mergeSort(arr, l, m);
                mergeSort(arr, m + 1, r);
                merge(arr, l, m, r);
            }
        }
        private void merge(int[] arr, int l, int m, int r) {
            int n1 = m - l + 1;
            int n2 = r - m;
            int[] L = new int[n1];
            int[] R = new int[n2];
            for (int i = 0; i < n1; ++i)
                L[i] = arr[l + i];
            for (int j = 0; j < n2; ++j)
                R[j] = arr[m + 1 + j];
            int i = 0, j = 0;
            int k = l;
            while (i < n1 && j < n2) {
                if (L[i] <= R[j]) {
                    arr[k] = L[i];
                    i++;
                } else {
                    arr[k] = R[j];
                    j++;
                }
                k++;
            }
    
            while (i < n1) {
                arr[k] = L[i];
                i++;
                k++;
            }
    
            while (j < n2) {
                arr[k] = R[j];
                j++;
                k++;
            }
        }
    }
     class Main {
        public static void main(String[] args) {
           BubbleSort bubbleSort = new BubbleSort();
           MergeSort mergeSort = new MergeSort();
           QuickSort quickSort = new QuickSort();
           System.out.println("Enter length of the array : ");
           Scanner in = new Scanner(System.in);
           int input = in.nextInt();
           int[] arr = new int[input];
           for(int i=1;i<=input;i++){
            System.out.println("Enter "+i+" th element of the array : ");
            arr[i-1] = in.nextInt();
           }
           System.out.println("Click 1 ---> Bubble sort the array \n Click 2 ---> Merge sort array \n Clcik 3 ---> Quick sort array \n ");
           int userIn = in.nextInt();
           if(userIn == 1)
           System.out.println("Bubble sorted array : "+Arrays.toString(bubbleSort.sort(arr)));
          else if(userIn ==2)

           System.out.println("Merge sorted array : "+Arrays.toString(mergeSort.sort(arr)));
           else if (userIn==3)
           System.out.println("Quick sorted array "+Arrays.toString(quickSort.sort(arr)));
           else
           System.out.println("Enter valid input");
        }
    }  
