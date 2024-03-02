package java6;

public class ReverseString {
    public static void main(String[] args){
        String input = "What ever happen!!! happens!!!";
        String result = "";
        for(int i=input.length()-1;i>=0;i--){
            result=result + Character.toString(input.charAt(i));
        }
        System.out.println("original : "+input);
        System.out.println("Reversed : "+result);
    }
}
