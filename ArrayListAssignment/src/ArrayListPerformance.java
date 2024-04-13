import java.util.ArrayList;
import java.util.Random;

class ArrayListPerformance {
    public static void main(String[] args) {
        //insertion
        int capacity =20;
        int elements = 10000;
        ArrayList<Integer> store = new ArrayList<>(capacity);
        long startTime = System.nanoTime();
        for(int i=0;i<elements;i++){
            store.add(i);
        }
        long endTime = System.nanoTime();
        System.out.println("The time taken for insertion of "+elements+" elements with capacity "+capacity +" is "+(endTime-startTime) +" NanoSeconds");
        //RandomAccess
        Random random = new Random();
        startTime = System.nanoTime();
        for(int i=0;i<elements;i++){
            int randoms = random.nextInt(elements)+1;
            store.get(randoms);
        }
        endTime =System.nanoTime();
        System.out.println("The time taken for getting random "+elements+" elements is "+(endTime-startTime)+" NanoSeconds");
        //SequentialAccess
        startTime=System.nanoTime();
        for(int i=0;i<elements;i++){
            store.get(i);
        }
        endTime=System.nanoTime();
        System.out.println("The time taken for getting sequential "+elements+" element is "+(endTime-startTime)+" NanoSeconds");

    }
}

