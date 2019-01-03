package com.yun.learn.item.thread;

import java.util.concurrent.Callable;

/**
 * @author Murphy
 * @date 2019/1/3
 */
public class TestPool implements Callable<Integer> {

    Integer a;

    public TestPool(Integer a){
        this.a = a;
    }

    @Override
    public Integer call() throws Exception {
        Thread.sleep(1000);
        System.out.println("任务" + a);
        return a;
    }
}
