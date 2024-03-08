import java.util.Scanner;

public class AverageWeight {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double weight = 0;
        for(int i=0;i<10;i++){
            System.out.println("Enter person "+(i+1)+" weight");
            double weightInput = in.nextDouble();
            weight = weight + weightInput;
        }
        double result = weight/10;
        System.out.println("The average weight of given 10 person weight : "+result);
    }
}
