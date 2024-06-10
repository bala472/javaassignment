class Buffer {
    private Integer value = null;

    public synchronized void put(int newValue) throws InterruptedException {
        while (value != null) {
            wait();
        }
        value = newValue;
        System.out.println("Produced: " + newValue);
        notifyAll();
    }

    public synchronized int get() throws InterruptedException {
        while (value == null) {
            wait();
        }
        int result = value;
        value = null;
        System.out.println("Consumed: " + result);
        notifyAll();
        return result;
    }
}

class Producer implements Runnable {
    private final Buffer buffer;

    public Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                buffer.put(i);
                Thread.sleep((int) (Math.random() * 100));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

class Consumer implements Runnable {
    private final Buffer buffer;

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                buffer.get();
                Thread.sleep((int) (Math.random() * 100));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
public class ProducerConsumer {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();

        Thread producer1 = new Thread(new Producer(buffer), "Producer-1");
        Thread producer2 = new Thread(new Producer(buffer), "Producer-2");
        Thread consumer1 = new Thread(new Consumer(buffer), "Consumer-1");
        Thread consumer2 = new Thread(new Consumer(buffer), "Consumer-2");

        producer1.start();
        producer2.start();
        consumer1.start();
        consumer2.start();
    }
}

