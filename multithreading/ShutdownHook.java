package multithreading;

public class ShutdownHook extends Thread {

    @Override
    public void run() {
        super.run();

        System.out.println("shut down hook task completed..");
    }

    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        r.addShutdownHook(new ShutdownHook());

        System.out.println("Now main sleeping... press ctrl+c to exit");
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
        }
    }
}


