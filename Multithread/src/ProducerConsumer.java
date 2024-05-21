import java.util.ArrayList;
import java.util.List;

public class ProducerConsumer {
    public static void main(String[] args) {
        List<Integer> buffer = new ArrayList<>();
        int capacity = 5;
        Thread producerThread = new Thread(new Producer(buffer, capacity));
        Thread consumerThread = new Thread(new Consumer(buffer));
        producerThread.start();
        consumerThread.start();
    }
}
class Producer implements Runnable {
    private List<Integer> buffer;
    private int capacity;
    private int value = 0;
    public Producer(List<Integer> buffer, int capacity) {
        this.buffer = buffer;
        this.capacity = capacity;
    }
    public void produce(int value) throws InterruptedException {
        synchronized (buffer) {
            while (buffer.size() == capacity) {
                System.out.println("Buffer is full...Producer is waiting");
                buffer.wait();
            }
            System.out.println("Producing:" + value);
            buffer.add(value);
            buffer.notify();
        }
    }


    public void run() {
        try {
            while (true) {
                produce(value++);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class Consumer implements Runnable {
    private List<Integer> buffer;
    public Consumer(List<Integer> buffer) {
        this.buffer = buffer;
    }
    public void consume() throws InterruptedException {
        synchronized (buffer) {
            while (buffer.isEmpty()) {
                System.out.println("Buffer is empty.Consumer is waiting...");
                buffer.wait();
                }
            int value = buffer.remove(0);
            System.out.println("Consuming:" + value);
            buffer.notify();
            }
        }
    
    public void run() {
        try {
            while (true) {
                consume();
                Thread.sleep(1500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
