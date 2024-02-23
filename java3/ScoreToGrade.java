import java.util.Scanner;

public class ScoreToGrade {
    public static void main(String[] args) {
        System.out.println("Enter your Score maximum limit is 100 ");
        Scanner in = new Scanner(System.in);
        int score = in.nextInt();
        if(score>=91&&score<=100)System.out.println("You obtained grade 'A' ");
        else if(score>=77 && score<=90)System.out.println("Your obtained grade 'B' ");
        else if(score>=64 && score<=76)System.out.println("You obtained grade 'C' ");
        else if(score>=51 && score<=63)System.out.println("You obtained grade 'D'");
        else if(score>=36 && score<=50)System.out.println("you obtained grade 'E' ");
        else if(score>=0&& score<=35)System.out.println("you obtained grade 'F'");
        else System.out.println("Please enter valid score");
    }
}
