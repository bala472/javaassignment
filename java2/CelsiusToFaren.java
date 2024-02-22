import java.util.Scanner;

class CelsiusToFaren{
    public static void main(String[] args) {
        System.out.println("Enter Celsius ");
        Scanner in=new Scanner(System.in);
        float input= in.nextFloat();
        float farenheit = input*(9.0f/5.0f)+32.0f;
        System.out.println("The celius converted as Farenheit "+farenheit);
    }
}