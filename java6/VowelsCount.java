import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
       // String input = "Today is Everything for you";
       System.out.println("Enter Sentence to count vowels");
       Scanner in = new Scanner(System.in);
       String input = in.nextLine();
        String vowels="aeiou";
        int count = 0;
        String check= input.toLowerCase();
        for(int i=0;i<input.length();i++){
            if(vowels.contains(Character.toString(check.charAt(i))))
                count++;
        }
        System.out.println("Vowels count "+count);
    }
}
