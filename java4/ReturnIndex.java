public class ReturnIndex {
    public static void main(String[] args) {
        int[] arr = {2,3,4,2,8,7};
        int number = 2;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(number==arr[i]){
                count++;
            }
            if(count==2){
                System.out.println("index of given number : "+i);
                break;
            }
        }
        if(count==0){
            System.out.println("Given number not found on array");
        }
        if(count==1){
            System.out.println("Given number occurs only one time ");
        }
    }
}
