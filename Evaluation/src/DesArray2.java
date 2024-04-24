import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class DesArray2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length of the array");
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter "+(i+1)+" element of array");
            arr[i]=in.nextInt();
        }
    // int[] arr = {4,1,2,2,1,2,3,5};
      LinkedHashMap<Integer,Integer> result = new LinkedHashMap<>();
      for(int i=0;i<arr.length;i++){
        if(result.containsKey(arr[i])){
            result.put(arr[i],result.get(arr[i])+1);
        }else{
            result.put(arr[i],1);
        }
      }
     int maxValue=0;
     for(int k : result.values()){
        if(k>maxValue){
            maxValue=k;
        }
     }
     String finalResult ="";
     for(int i=maxValue;i>0;i--){
        for(int k:result.keySet()){
            if(result.get(k)==i){
                for(int z=0;z<i;z++){
                    finalResult = finalResult+k;
                }
            }
        }
     }
      System.out.println("The result is "+finalResult);

    }
}