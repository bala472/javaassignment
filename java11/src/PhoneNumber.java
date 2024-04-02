import java.util.InputMismatchException;
import java.util.Scanner;

public class PhoneNumber {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter phone number : ");
    String phoneNumber = in.nextLine();
    try{
        for(char a : phoneNumber.toCharArray()){
            if(! Character.isDigit(a))
            throw new InputMismatchException("Given phone number contains character other than Number");
        }
        System.out.println("The given number is phone number ");
    }catch(InputMismatchException e){
        System.out.println(e.getMessage());
    }
}
    
}