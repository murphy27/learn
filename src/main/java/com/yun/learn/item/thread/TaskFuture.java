package com.yun.learn.item.thread;

import java.util.concurrent.Callable;
import java.util.function.Supplier;

/**
 * @author Murphy
 * @date 2019/1/5
 */
public class TaskFuture implements Supplier<Integer> {

    Integer i;

    public TaskFuture(Integer i){

        this.i = i;
    }
    @Override
    public Integer get() {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return i;
    }
}
