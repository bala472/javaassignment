public class VariableScope {
    public static void main (String[] args){
    int i =10;
    if(i>=10){
        int j =20;
        System.out.println("variable created outside if condition "+i);
        System.out.println("variable created inside if condition "+j);
    }
        System.out.println("printing variable outside if condition : "+i);
      //  System.out.println("Printing variable inside if condition : "+j);

    }
}
