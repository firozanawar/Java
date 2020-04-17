package multithreading.threadpoolexecutors;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPoolExecutorExample {

    public static void main(String[] args) {

        ScheduledThreadPoolExecutor executor = (ScheduledThreadPoolExecutor) Executors.newScheduledThreadPool(2);
        TaskForScheduled task = new TaskForScheduled("Repeat Task");
        System.out.println("Created : " + task.getName());

        executor.scheduleWithFixedDelay(task, 2, 2, TimeUnit.SECONDS);
    }
}

class TaskForScheduled implements Runnable {
    private String name;

    public TaskForScheduled(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void run() {
        System.out.println("Executing : " + name + ", Current Seconds : " + new Date().getSeconds());
    }
}
