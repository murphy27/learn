package com.yun.learn.item.thread;

import java.util.concurrent.Callable;

/**
 * @author Murphy
 * @date 2019/1/5
 */
public class TaskRunuble implements Callable<Integer> {
    @Override
    public Integer call() {
        return 1;
    }
}
