package multithreading;

public class ThreadExample1 extends Thread {

    public void run(){
        System.out.println("Inside: "+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        System.out.println("Inside: "+Thread.currentThread().getName());

        System.out.println("Creating thread");
        ThreadExample1 threadExample1 = new ThreadExample1();

        System.out.println("Starting thread...");
        threadExample1.start();
    }
}
