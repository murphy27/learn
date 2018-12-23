package com.yun.learn.item.thread.thread_CyclicBarrier;

import java.util.concurrent.CyclicBarrier;

/**
 * @author Murphy
 * @date 2018/12/22
 */
public class Taskthrea extends TaskRunnable {


    public Taskthrea(CyclicBarrier _latch) {
        super(Taskthrea.class.getName(), _latch);
    }

    @Override
    public void execute(int...milians) throws Exception{
        System.out.println("start to process"+ this.getClass().getSimpleName());
        Thread.sleep(milians[0]);
        System.out.println("cost: " + milians[0]);
    }
}
