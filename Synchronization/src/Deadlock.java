public class Deadlock {

    static class ResourceA {
        public synchronized void methodA(ResourceB b) {
            System.out.println(Thread.currentThread().getName() + ": Locked ResourceA");
            try {
                // Simulate some work with resource A
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + ": Trying to lock ResourceB");
            synchronized (b) {
                System.out.println(Thread.currentThread().getName() + ": Locked ResourceB");
            }
        }
    }

    static class ResourceB {
        public synchronized void methodB(ResourceA a) {
            System.out.println(Thread.currentThread().getName() + ": Locked ResourceB");
            try {
                // Simulate some work with resource B
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + ": Trying to lock ResourceA");
            synchronized (a) {
                System.out.println(Thread.currentThread().getName() + ": Locked ResourceA");
            }
        }
    }

    public static void main(String[] args) {
        ResourceA a = new ResourceA();
        ResourceB b = new ResourceB();

        Runnable task1 = () -> a.methodA(b);
        Runnable task2 = () -> b.methodB(a);

        Thread thread1 = new Thread(task1, "Thread-1");
        Thread thread2 = new Thread(task2, "Thread-2");

        thread1.start();
        thread2.start();
    }
}

