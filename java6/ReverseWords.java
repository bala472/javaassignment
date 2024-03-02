package java6;

import java.util.Arrays;

public class ReverseWords {
    public static void main(String[] args){
        String input ="We need to learn something";
        String result="";
        String[] arr = input.split(" ");
       // System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){
            for(int j=arr[i].length()-1;j>=0;j--){
                result= result+Character.toString(arr[i].charAt(j));
            }
            result=result+" ";
        }
        System.out.println("Original string : "+input);
        System.out.println("Revesed each word : "+result);

    }

}
