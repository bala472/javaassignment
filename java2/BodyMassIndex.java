import java.util.Scanner;

/**
 * BitwiseOperatorinput
 */
public class BodyMassIndex {

    public static void main(String[] args) {
        System.out.println("Enter Weight in Kilograms : ");
        Scanner in = new Scanner(System.in);
        float Kilograms=in.nextFloat();
        System.out.println("Enter your height in meters : ");
        float meters=in.nextFloat();
        float bodyMassIndex= Kilograms/(meters*meters);
        System.out.println("Body Mass Index for given values : "+bodyMassIndex);
    }
}
