public class ArrayIndex {
    public static void main(String[] args) {
        int[] arr = { 1,2,3,4,5 };
        try{
            System.out.println(arr[100]);

        }catch(ArrayIndexOutOfBoundsException e){
            System.err.println("Exception : "+e.getMessage());
        }
    }
}
