import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("Enter the Number to print Mutiplication table : ");
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        for(int i=1;i<=20;i++){
            System.out.println(i+" x "+input+" = "+input*i);
        }
    }
}
