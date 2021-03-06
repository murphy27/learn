package com.yun.learn.item.thread.thread_CountDownLatch;

import java.util.concurrent.CountDownLatch;

/**
 * @author Murphy
 * @date 2018/12/22
 */
public class Taskone extends TaskRunnable {


    public Taskone(CountDownLatch _latch) {
        super(Taskone.class.getName(), _latch);
    }

    @Override
    public void execute(int...milians) throws Exception{
        System.out.println("start to process"+ this.getClass().getSimpleName());
        Thread.sleep(milians[2]);
        System.out.println("cost: " + milians[2]);
    }

}
