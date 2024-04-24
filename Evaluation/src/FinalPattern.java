import java.util.Scanner;

public class FinalPattern {
    static Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter number to print pattern");
        int n=scanner.nextInt();
        int[][] arr=new int[n][n];
        int rs=0,re=n-1,cs=0,ce=n-1;
        int count=1;
        while(rs<=re) {
            for(int i=rs;i<=re;i++) {
                   arr[rs][i]=count;
            }rs++;
            for(int i=rs;i<=ce;i++) {
                arr[i][ce]=count;
            }
            ce--;
            for(int i=ce;i>=cs;i--) {

                arr[re][i]=count;
            }re--;
            for(int i=re;i>=rs;i--) {
                       arr[i][cs]=count;
            }
            cs++;
            if(count==1)
                count=0;
            else
                count=1;
        }
        for(int[] i:arr ) {
            for(int j:i) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }

}