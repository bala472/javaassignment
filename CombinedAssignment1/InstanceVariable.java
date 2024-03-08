public class InstanceVariable {
    byte byteValue =126;
    short shortValue = 1000;
    int integerValue = 100000;
    long longValue = 10000000;
    String stringValue = "Testing";
    boolean booleanValue = true;
    char charValue = 'B';
    float floatValue = 99.99f;
    double doubleValue = 66.22;
    public static void main(String[] args){
        InstanceVariable obj = new InstanceVariable();
        System.out.println("byte value : "+obj.byteValue);
        System.out.println("short value : "+obj.shortValue);
        System.out.println("integer value : "+obj.integerValue);
        System.out.println("long value : "+obj.longValue);
        System.out.println("float value : "+obj.floatValue);
        System.out.println("double value : "+obj.doubleValue);
        System.out.println("string value : "+obj.stringValue);
        System.out.println("char value : "+obj.charValue);
    }



}
