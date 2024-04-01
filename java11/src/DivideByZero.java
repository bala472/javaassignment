import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

class DivideByZero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try{
            System.out.println("Enter dividend number : ");
            int dividend = in.nextInt();
            System.out.println("Enter divisor number : ");
            int divisor = in.nextInt();
            System.out.println("Result : "+dividend/divisor);
        }
        catch (InputMismatchException e){
            //e.printStackTrace();
            System.err.println("Please enter valid Input");
        }
        catch (ArithmeticException e){
          // e.printStackTrace();
            System.err.println("Error : "+ e.getMessage());
        }
    }
}