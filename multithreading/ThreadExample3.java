package multithreading;

public class ThreadExample3 {
    public static void main(String[] args) {

        Runnable r  = () -> System.out.println("Inside: "+Thread.currentThread().getName());

        Thread t = new Thread(r);
        t.start();
    }
}
