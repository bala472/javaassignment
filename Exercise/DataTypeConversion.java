import java.util.Scanner;

public class DataTypeConversion {
    public static void main(String[] args) {
        System.out.print("Enter value for float ");
        Scanner in=new Scanner(System.in);
        float input=in.nextFloat();
        int convertedInt=(int)input;
        short convertedShort = (short) convertedInt;
        byte convertedByte =(byte) convertedShort;
        System.out.println("Given value converted as integer "+ convertedInt );
        System.out.println("Given value converted as Short "+ convertedShort );
        System.out.println("Given value converted as Byte "+  convertedByte);
    }
}
