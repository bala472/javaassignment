import java.util.Scanner;

public class FirstPattern {
    public static void main(String[] args) {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] arr = alphabet.toCharArray();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter capital letter (eg. F) :");
        char t = in.nextLine().toUpperCase().charAt(0); // Convert input to uppercase
        int n = t - 'A' + 1;
        for(int i=0;i<=2*n;i++){
            if(i<=n){
                if(i==0){
                    for(int j=0;j<=n;j++){
                        System.out.print(" ");
                    }
                    System.out.print(arr[i]);
                    System.out.println();
                    continue;
                }
                for(int s=0;s<n-i;s++){
                    System.out.print(" ");
                }
                System.out.print(arr[i]);
                for(int l=0;l<2*i;l++){
                    System.out.print(" ");
                }
                System.out.print(arr[i]);
                System.out.println();
            }
            if(i>n){
                if(i==2*n){
                    for(int k=0;k<=n;k++){
                        System.out.print(" ");
                    }
                    System.out.print(arr[0]);
                    System.out.println();
                    continue;
                }
                for(int z=0;z<i-n;z++){
                    System.out.print(" ");
                }
                System.out.print(arr[2*n-i]);
                for(int y=2*(n-(i-n));y>=0;y--){
                    System.out.print(" ");
                }
                System.out.print(arr[2*n-i]);
                System.out.println();
            }
        }
    }
}
