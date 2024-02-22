import java.util.Scanner;

public class HoursMinSec {
    public static void main(String[] args) {
        System.out.println("Enter seconds : ");
        Scanner in = new Scanner(System.in);
        int seconds = in.nextInt();
        int hours=seconds/3600;
        int minutes=(seconds%3600)/60;
        int secondsVal=seconds%60;
        System.out.println(hours+":"+minutes+":"+secondsVal);
    }
}
