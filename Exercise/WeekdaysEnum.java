import java.util.Scanner;
public class WeekdaysEnum {
    public static void main(String[] args) {
        System.out.println("One Week has 7 days please enter number to get days ");
        Scanner in=new Scanner(System.in);
        int input=in.nextInt();
        switch(input){
            case 1: 
            System.out.println(Weekdays.SUNDAY);break;
            case 2:
            System.out.println(Weekdays.MONDAY);break;
            case 3:
            System.out.println(Weekdays.TUESDAY);break;
            case 4:
            System.out.println(Weekdays.WEDNESDAY);break;
            case 5:
            System.out.println(Weekdays.THURSDAY);break;
            case 6:
            System.out.println(Weekdays.FRIDAY);break;
            case 7:
            System.out.println(Weekdays.SATURDAY);break;
            default:
            System.out.println("please enter valid input");
       }
    }
    
}
enum Weekdays{
    SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;
}