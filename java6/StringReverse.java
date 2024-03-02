package Assignment6;

public class StringReverse {
    public static void main(String[] args) {
        /*System.out.println("Hi bala");
        System.out.println("Welcome");*/
        String input = "Today is Everything for you";
        String vowels="aeiou";
        int count = 0;
        String check= input.toLowerCase();
        for(int i=0;i<input.length();i++){
            if(vowels.contains(Character.toString(check.charAt(i))))
                count++;
        }
        System.out.println(count);
    }
}
