import java.util.Scanner;

public class SwapTwoValues {
    public static void main(String[] args) {
        System.out.println("Enter value for A : ");
        Scanner in =new Scanner(System.in);
        int a=in.nextInt();
        System.out.println("Enter value for B : ");
        int b=in.nextInt();
        int temp = a;
        a=b;
        b=temp;
        System.out.println("Value for A after swapping "+a);
        System.out.println("Value for B after swapping "+b);
    }
}
