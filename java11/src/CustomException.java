public class CustomException {
    public static void main(String[] args) {
        try{
            int a=1000;
            if(a>100){
                throw new Exception("Exception thrown successfully");
            }
        }catch (Exception e){
         //   e.printStackTrace();
            System.out.println("Printing thrown message : "+e.getMessage());
        }
    }
}

