import java.util.Arrays;
import java.util.Scanner;

public class WeightOfPerson {
    public static void main(String[] args){
        System.out.println("Enter No of persons");
        Scanner in = new Scanner(System.in);
        int persons = in.nextInt();
        int[][] arr = new int[persons][];
        int[] result = new int[persons];
        int minValue = Integer.MAX_VALUE;
        for(int i=0;i<persons;i++){
            System.out.println("Enter No. of weight for person "+(i+1));
            int noOfWeights = in.nextInt();
            arr[i] = new int[noOfWeights];
            for(int j=0;j<noOfWeights;j++){
                System.out.println("Enter weight "+(j+1)+" of person "+(i+1));
                arr[i][j]= in.nextInt();
                if(arr[i][j]<minValue){
                    minValue=arr[i][j];
                    result[i] = minValue;
                }
            }
            minValue=Integer.MAX_VALUE;
        }
        /*for(int i=0;i< arr.length;i++){
            System.out.println(Arrays.toString(arr[i]));
        }*/
        System.out.println("Enter minimum weight of person you want to display");
        int getResult = in.nextInt();
        if(getResult>persons){
            System.out.println("you entered more than no. of person !!! please enter valid input ");
        }else {
            System.out.println("The minimum weight of person " + getResult + " is " + result[getResult - 1]);
        }
    }
}
