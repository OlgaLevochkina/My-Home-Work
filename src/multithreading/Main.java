package multithreading;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            Thread myThread = new MyThread(i);
            myThread.start();
        }
    }
}
