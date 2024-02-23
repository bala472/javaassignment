import java.util.Scanner;

public class FactorialLoop {
    public static void main(String[] args) {
        System.out.println("Enter number for factorial : ");
        Scanner in = new Scanner(System.in);
        int input=in.nextInt();
        int result=1;
        for(int i=1;i<=input;i++){
            result=result*i;
        }
        System.out.println("Factorial is : "+result);
    }
}
