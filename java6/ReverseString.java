import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args){
       // String input = "What ever happen!!! happens!!!";
       System.out.println("Enter sentence to revese");
       Scanner in = new Scanner(System.in);
       String input = in.nextLine();
        String result = "";
        for(int i=input.length()-1;i>=0;i--){
            result=result + Character.toString(input.charAt(i));
        }
        System.out.println("original : "+input);
        System.out.println("Reversed : "+result);
    }
}
