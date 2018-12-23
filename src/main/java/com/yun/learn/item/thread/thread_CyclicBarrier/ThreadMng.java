package com.yun.learn.item.thread.thread_CyclicBarrier;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * @author Murphy
 * @date 2018/12/22
 */
public abstract class ThreadMng {


    private List<TaskRunnable> taskRunnableList;

    private CyclicBarrier _latch;

    public ThreadMng() {

    }

    /**
     * 初始化方法
     */
    public abstract void innit();

    /**
     * 取得结果的方法
     *
     * @return
     */
    public boolean checkResultService() throws Exception {

        if (null == taskRunnableList) {
            taskRunnableList = new ArrayList<>();
        }
        if (taskRunnableList.size() == 0) {
            taskRunnableList.add(new Taskone(_latch));
            taskRunnableList.add(new Tasktow(_latch));
            taskRunnableList.add(new Taskthrea(_latch));
            _latch = new CyclicBarrier(taskRunnableList.size());
        } else {
            _latch = new CyclicBarrier(3);
            taskRunnableList.add(new Taskone(_latch));
            taskRunnableList.add(new Tasktow(_latch));
            taskRunnableList.add(new Taskthrea(_latch));
        }
        Executor executors = Executors.newFixedThreadPool(taskRunnableList.size());

        for (TaskRunnable taskRunnable : taskRunnableList) {
            executors.execute(taskRunnable);
        }
        /*for (TaskRunnable taskRunnable : taskRunnableList) {
            if (!taskRunnable.is_taskUp()) {
                System.out.println("未完成全部");
                return false;
            }
        }*/
        return true;
    }
}
