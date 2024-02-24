import java.util.Scanner;

public class SumOfEven {
    public static void main(String[] args) {
        //int[] arr = {1,2,3,4,5,77,44,90,5,34,21,33,76,55};
        System.out.println("Enter number of Array ");
        Scanner in = new Scanner(System.in);
        int size=in.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter "+(i+1)+" element of array : ");
            arr[i] = in.nextInt();
        }
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                continue;
            }
                sum=sum+arr[i];
        }
        System.out.println("Sum of even number in the array : "+sum);
    }
}
