package exception.checked;
public class ThreadInterruptExample {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            try {
                Thread.sleep(5000); // Simulate some work
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted!");
                Thread.currentThread().interrupt(); // Re-interrupt the thread
            }
        });
        t.start();
        t.interrupt(); // Interrupt the thread
    }
}