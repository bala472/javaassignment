import java.util.Scanner;

public class BitwiseOperator {
    public static void main(String[] args) {
        System.out.println("Enter number 1 : " );
        Scanner in = new Scanner(System.in);
        int input1=in.nextInt();
        System.out.println("Enter number 2 : ");
        int input2=in.nextInt();
        System.out.println(" AND operation (&) : "+ (input1&input2));
        System.out.println(" OR operation (|) : "+ (input1|input2));
        System.out.println(" XOR operation (^) : "+ (input1^input2));
        System.out.println("COMPLEMENT operation (~) : "+ "complement of 1st input is "+(~input1) +" complement of 2nd input "+(~input2));
        System.out.println("Left shift operator (<<) : "+ (input1<<input2));
        System.out.println("Right shift operator (>>) : "+(input1>>input2));
    }
}
