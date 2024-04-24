import java.util.Scanner;

public class Addition3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length of first array");
        String ww = in.next();
        int n=Integer.parseInt(ww);
        String[] arr1 = new String[n];
        for(int e=0;e<n;e++){
            System.out.println("Enter "+(e+1)+" number");
            arr1[e]=in.next();
        }
        System.out.println("---- Enter length of second array ");
        String ee = in.next();
        int l=Integer.parseInt(ee);
        String[] arr2 = new String[l];
        for(int i=0;i<l;i++){
            System.out.println("Enter "+(i+1)+" number ");
            arr2[i]=in.next();
        }
        int carry=0;
        int s = (arr1.length>arr2.length) ? arr1.length : arr2.length;
        String[] temparr = new String[s];
        int less = arr1.length<arr2.length ? arr1.length : arr2.length;
        int index=0;
        if(arr2.length<arr1.length){
            int z = s-less;
            for(int y=0;y<z;y++){
                temparr[y]="0";
            }
            for(int w=z;w<s;w++){
                temparr[w]= arr2[index++];
            }
        }
        if(arr1.length<arr2.length){
            int z = s-less;
            for(int y=0;y<z;y++){
                temparr[y]="0";
            }
            for(int w=z;w<s;w++){
                temparr[w]= arr1[index++];
            }
        }
        String result = "";
        for(int i=s-1;i>=0;i--){
            int add;
            if(arr1.length>arr2.length)
             add = Integer.parseInt(arr1[i]) + Integer.parseInt(temparr[i]) + carry;
            else
                add = Integer.parseInt(arr2[i]) + Integer.parseInt(temparr[i]) + carry;
            String temp = Integer.toString(add);
            if(temp.length()==2){
                carry=0;
                carry = Integer.parseInt(Character.toString(temp.charAt(0)));
                result = temp.charAt(1) + result;
            }else {
                carry=0;
                result=temp.charAt(0)+result;
            }
        }
        System.out.println();
        System.out.println("Addition of the number is "+result);

    }
}
