package multithreading;

public class ThreadExample2 implements Runnable{

    public static void main(String[] args) {
        Runnable r = new ThreadExample2();
        Thread t = new Thread(r);
        t.start();
    }
    @Override
    public void run() {
        System.out.println("Inside: "+Thread.currentThread().getName());
    }
}
