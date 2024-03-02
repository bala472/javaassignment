import java.util.Arrays;

public class RotateElement{
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7,8,9,10,11,12};
        int[] result = new int[arr.length];
        int rotate=4;
       // result= Arrays.copyOfRange(arr,arr.length-rotate,arr.length);
        int index=0;
        for(int i=arr.length-rotate;i<arr.length;i++){
            result[index] = arr[i];
            index++;
        }
       for(int i=0;i<arr.length-rotate;i++){
           result[index]=arr[i];
           index++;
       }
        System.out.println(Arrays.toString(result));
    }
}
