package com.yun.learn.item.thread.thread_CyclicBarrier;

import java.util.concurrent.CyclicBarrier;

/**
 * @author Murphy
 * @date 2018/12/22
 */
public class Tasktow extends TaskRunnable {


    public Tasktow(CyclicBarrier _latch) {
        super(Tasktow.class.getName(), _latch);
    }

    @Override
    public void execute(int...milians) throws Exception{
        System.out.println("start to process"+ this.getClass().getSimpleName());
        Thread.sleep(milians[1]);
        System.out.println("cost: " + milians[1]);
    }
}
