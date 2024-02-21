import java.util.Scanner;


public class RandomGenerator {

    public static void main(String[] args) {
       /*  System.out.println("Enter digit ");
        Scanner in=new Scanner(System.in);
        int input=in.nextInt();
        int random = (int) (Math.random()*(int) Math.pow(10, input));
        System.out.println("Generated "+input +" digit random number "+random);*/
        int result= (int)(Math.random()*100);
        System.out.println("Random number generated as "+result);
    }
}