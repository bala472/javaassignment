import java.util.Scanner;

class GreatestNumber{
    public static void main(String[] args) {
        System.out.println("Enter value 1 : ");
        Scanner in= new Scanner(System.in);
        float val1=in.nextFloat();
        System.out.println("Enter value 2 : ");
        float val2=in.nextFloat();
        System.out.println("Enter value 3 : ");
        float val3 = in.nextFloat();
        float compare=(val1>val2)?val1:val2;
        float result=(compare>val3)?compare:val3;
        System.out.println("The Greatest Number is : "+result);
    }
}