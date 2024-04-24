import java.util.ArrayList;
import java.util.Scanner;

public class MaxArray4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length of the array ");
        int v = in.nextInt();
        ArrayList<Integer> arr =new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        int[] s = new int[v];
        for(int i=0;i<v;i++){
            System.out.println("Enter "+(i+1)+" element of array");
            s[i]=in.nextInt();
        }
        int max = Integer.MIN_VALUE;
        for(int i=0;i<s.length;i++){
            int add=0;
            for(int j=i;j<s.length;j++){
                if(s[j]<0){
                    break;
                }
                add = add + s[j];
                temp.add(s[j]);
            }
            if(add>max){
                max=add;
                arr = new ArrayList<>(temp);
                temp.clear();
            }
            temp.clear();
        }
        System.out.println("Maximum number "+max);
        System.out.println(arr);
    }
}
