package com.yun.learn.daytoday.thread_CountDownLatch;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * @author Murphy
 * @date 2018/12/22
 */
public abstract class ThreadMng {


    private List<TaskRunnable> taskRunnableList;

    private CountDownLatch _latch;

    public ThreadMng(){

    }

    /**
     *   初始化方法
     */
    public abstract void innit();

    /**
     * 取得结果的方法
     * @return
     */
    public boolean checkResultService() throws Exception {

        if (null==taskRunnableList){
            taskRunnableList = new ArrayList<>();
        }
        if (taskRunnableList.size()==0){
            _latch = new CountDownLatch(3);
            taskRunnableList.add(new Taskone(_latch));
            taskRunnableList.add(new Tasktow(_latch));
            taskRunnableList.add(new Taskthrea(_latch));
        }
        Executor executors = Executors.newFixedThreadPool(taskRunnableList.size());

        for (TaskRunnable taskRunnable:taskRunnableList){
            executors.execute(taskRunnable);
        }
        _latch.await();
        for (TaskRunnable taskRunnable:taskRunnableList){
            if (!taskRunnable.is_taskUp()){
                return false;
            }
        }
        return true;
    }
}
