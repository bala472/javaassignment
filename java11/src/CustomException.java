class  CustomException extends Exception{
    public CustomException(String message){
        super(message);
    }
}
class UseCustomException {
    public static void main(String[] args) {
        try{
            int age = -2;
            if(age<0){
                throw new CustomException("Custom Exception thrown successfully");
            }
        }catch (CustomException e){
         //   e.printStackTrace();
            System.out.println("Printing custom thrown exception message : "+e.getMessage());
        }catch (Exception e){
            System.out.println("Printing Exception");
        }
    }
}

