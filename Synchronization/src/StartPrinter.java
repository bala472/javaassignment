class Printer {
    public void printDocument(String documentName) {
        System.out.println(Thread.currentThread().getName() + " is printing document: " + documentName);
      synchronized (this) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " has finished printing document: " + documentName);
        }
    }
}
class DocumentPrinterRunnable implements Runnable {
    private Printer printer;
    private String documentName;

    public DocumentPrinterRunnable(Printer printer, String documentName) {
        this.printer = printer;
        this.documentName = documentName;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) { // Each thread prints the document 3 times
            printer.printDocument(documentName);
        }
    }
}
public class StartPrinter {
    public static void main(String[] args) {
        Printer printer = new Printer();

        Thread thread1 = new Thread(new DocumentPrinterRunnable(printer, "Document1"), "Thread1");
        Thread thread2 = new Thread(new DocumentPrinterRunnable(printer, "Document2"), "Thread2");
        Thread thread3 = new Thread(new DocumentPrinterRunnable(printer, "Document3"), "Thread3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
