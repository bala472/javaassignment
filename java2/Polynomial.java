import java.util.Scanner;

public class Polynomial {
    public static void main(String[] args) {
        System.out.println("Enter value for x^2 coefficient : ");
        Scanner in =new Scanner(System.in);
        double a=in.nextDouble();
        System.out.println("Enter value for x coefficient : ");
        double b=in.nextDouble();
        System.out.println("Enter value for last : ");
        double c=in.nextDouble();
        double deltaValue=b*b-4*a*c;
        if(deltaValue>0){
        double value1= (-b + Math.sqrt(deltaValue)/(2*a));
        double value2= ((-b - Math.sqrt(deltaValue))/(2*a));
        System.out.println("The values are "+value1+" "+value2);
      //  System.out.println("value 2:"+(result2));
        }
        else if(deltaValue==0){
            double value =-b/(2*a);
            System.out.println("The value is : "+value);
        }
        else{
            deltaValue= Math.abs(deltaValue);
            double result1=(-b+Math.sqrt(deltaValue))/(2*a);
            double result2=(-b-Math.sqrt(deltaValue))/(2*a);
            System.out.println("The values are : "+result1+"i "+result2+"i ");
        }
    }   
}

