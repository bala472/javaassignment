import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args){
        System.out.println("Enter number of person to compare : ");
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        String[] name = new String[count];
        double[] weight= new double[count];
        double[] height = new double[count];
        double[] bmi = new double[count];
        String[] remarks = new String[count];
        in.nextLine();
        for(int i=0;i<count;i++){
            System.out.println("Enter the name of the "+(i+1)+" person : ");
            name[i] = in.nextLine();
            System.out.println("Enter weight of the "+(i+1)+" person");
            weight[i] = in.nextDouble();
            System.out.println("Enter height of the "+(i+1)+" person in cms");
            height[i] = in.nextDouble()/100;
            bmi[i] = weight[i]/(height[i]*height[i]);
            if (bmi[i] < 18.5) {
                remarks[i] = "underweight";
            } else if (bmi[i] >= 18.5 && bmi[i] < 24.9)
                remarks[i] = "Healthy";
            else if (bmi[i] >= 24.9 && bmi[i] < 30)
                remarks[i] = "overweight";
            else if (bmi[i] >= 30)
               remarks[i] = "Suffering from Obesity";
            in.nextLine();
        }
        System.out.println("    Name    |   BMI   |   Remarks ");
        for(int i=0;i<count;i++){
            System.out.println("    "+name[i]+"     |   "+ String.format("%.1f",bmi[i])+"  |   "+remarks[i]+"  |");
        }
    }
}
