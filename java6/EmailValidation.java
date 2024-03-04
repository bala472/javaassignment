import java.util.Scanner;

public class EmailValidation {
    public static void main(String[] args) {
       // String input = "balasubramanian3721@gmail.com";
       System.out.println("Enter Email id");
       Scanner in = new Scanner(System.in);
       String input = in.nextLine();
        System.out.println(emailValidation(input));

    }
    public static String emailValidation(String input){
        int atSymbol = input.indexOf("@");
        int dotIndex = input.indexOf(".",atSymbol);
        if(!(input.contains("@")))
        return "Email must contain @ symbol";
        else if(!(input.indexOf("@")==input.lastIndexOf("@")))
        return "Not valid - Enter valid email";
        else if(atSymbol==0 ||atSymbol==input.length()-1)
        return "Enter @ inbetween email id";
        else if(dotIndex==-1)
        return "Not Valid - Enter valid email address";
        else if(dotIndex == atSymbol+ 1 || dotIndex==input.length() - 1 )
        return "Not Valid - Enter valid email address";
        else if(!(Character.isLetterOrDigit(input.charAt(0))))
        return "Not valid - Enter valid email address";
        for(int i=0;i<input.length();i++){
            char c = input.charAt(i);
            if (!Character.isLetterOrDigit(c) && c != '@' && c != '.' && c != '_') {
                return "Not valid - Enter valid email";
            }
            else if(c=='.' && input.charAt(i+1)=='.')
            return "Not valid -Enter valid email address";
          else if((int)c>=65 && (int)c<=90)     
            return "Not valid - Only lowercase alphabets are allowed";   
        }
        return "Email is Valid !!!";
    }
}
