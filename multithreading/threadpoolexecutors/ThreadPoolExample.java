package multithreading.threadpoolexecutors;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExample {

    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);

        for (int i = 0; i < 5; i++) {
            Task task = new Task("Task: " + i);
            System.out.println("Created : " + task.getName());
            threadPoolExecutor.execute(task);
        }

        threadPoolExecutor.shutdown();
    }
}

class Task implements Runnable {

    String name;

    public Task(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void run() {
        long duration = (long) (Math.random() * 10);
        System.out.println("Executing : " + name);
        try {
            TimeUnit.SECONDS.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
