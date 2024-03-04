import java.util.Scanner;

class CapitalizeFirst{
    public static void main(String[] args) {
       // String input = "prepare the troops for revenge";
       System.out.println("Enter Sentence to capitalize first letter");
       Scanner in = new Scanner(System.in);
       String input = in.nextLine();
        String[] arr = input.split(" ");
        String result="";
        for(int i=0;i<arr.length;i++){
           result += Character.toString(arr[i].charAt(0)).toUpperCase() + arr[i].substring(1)+" ";
        }
        System.out.println(result);
    }
}