
public class PrimeNumber {
public static void main(String[] args) {
    System.out.println("The list of prime numbers are ...");
    for(int i=0;i<=30;i++){
        if(i==2 || i==3){
            System.out.println(i);
        }
        else if(i>3){
            int temp=0;
            for(int j=2;j<=(int)Math.sqrt(i);j++){
                    if(i%j==0){
                        temp++;
                    }
            }
            if(temp==0){
                System.out.println(i);
                temp=0;
            }else{
                temp=0;
            }
        }
    }
}
    
}