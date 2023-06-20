import java.util.Scanner;

public class UseThreads {
    public static void main(String[] args) {

        boolean running = true;
        MyThread thread = new MyThread();
        thread.start();
        MyThread thread2 = new MyThread();
        thread2.start();

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        thread.shutdown();
        thread2.shutdown();

        // Все потоки начинаются с main потока
        //

    }
}

class MyThread extends Thread {
    private volatile boolean running = true;
    int count = 0;

    @Override
    public void run() {
        while (running) {
            System.out.printf("Hello %d \n", count++);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void shutdown() {
        this.running = false;
    }
}