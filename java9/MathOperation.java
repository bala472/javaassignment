public class MathOperation {
    public static int add(int a, int b) {
        return a + b;
    }
    public static float add(float a, int b) {
        return a +  b;
    }
    public static double add(double a, double b) {
        return a + b;
    }
    public static int subtract(int a, int b) {
        return a - b;
    }
    public static double subtract(int a, double b) {
        return a - b;
    }
    public static int multiply(int a, int b) {
        return a * b;
    }
    public static double multiply(double a, double b) {
        return a * b;
    }
    public static double multiply(double a, double b,float c) {
        return a * b * c;
    }
    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
    public static double divide(int a, short b) {
        if (b == 0.0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
    public static void main(String[] args) {
        System.out.println("Integer addition: " + add(5, 3));
        System.out.println("Double addition: " + add(5.5, 3.3));
        System.out.println("Float - int addition : " +add(2.33,5));
        System.out.println("Integer subtraction: " + subtract(5, 3));
        System.out.println("Integer- Double subtraction: " + subtract(5, 3.3));
        System.out.println("Integer multiplication: " + multiply(5, 3));
        System.out.println("Double multiplication: " + multiply(5.5, 3.3));
        System.out.println("Method oveloaded with three parameter: "+multiply(10,20, 1.1F));
        System.out.println("Integer division: " + divide(10, 2));
        System.out.println("Integer - Short division: " + divide(10, 2));
    }
}

