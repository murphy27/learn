package com.yun.learn.item.thread.thread_master_worker;

public class Data extends Worker{

    public static Object handle(Object input) {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
        Task task = (Task) input;
        Object output = task.getPrice();
        return output;
    }
}
