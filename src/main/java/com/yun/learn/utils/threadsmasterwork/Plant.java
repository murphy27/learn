package com.yun.learn.utils.threadsmasterwork;


import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * @author Murphy
 * @date 2019/1/2
 */
public class Plant {


    // 1.应该有一个装任务的集合ConcurrentLinkedQueue
    private ConcurrentLinkedQueue<Object> workQueue = new ConcurrentLinkedQueue<Object>();

    // 2.使用普通的HashMap去承装所有的Worker对象
    private Map<String, Thread> workers = new HashMap<String, Thread>();

    // 3.要用一个ConcurrentHashMap去承装每一个Worker执行任务的结果集合，并发执行
    private ConcurrentHashMap<String, Object> resultMap = new ConcurrentHashMap<String, Object>();

    // 4.要有一个构造方法
    public Plant(Workers worker, Integer workerCount) {
        // 创建worker对Maset中任务队列的引用,用于任务的领取
        worker.setWorkerQueue(this.workQueue);
        // 创建worker对Maset中结果集合的引用，用于任务的提交
        worker.setResultMap(this.resultMap);
        // 循环为多个worker创建线程

        for (int i = 0; i < workerCount; i++) {
            workers.put("W" + String.valueOf(i), new Thread(worker));
        }
    }

    // 5.提交方法
    public void submit(Object obj) {
        this.workQueue.add(obj);
    }

    // 6.启动应用程序，让所有的worker开始工作
    public void execute() {
        // 启动每个worker线程开始工作
        for (Map.Entry<String, Thread> me : workers.entrySet()) {
            me.getValue().start();
        }
    }

    // 7.判断线程是否执行完毕
    public boolean isComplete() {
        // 判断当所有的worker是否都停止
        for (Map.Entry<String, Thread> me : workers.entrySet()) {
            if (me.getValue().getState() != Thread.State.TERMINATED) {
                return false;
            }
        }
        return true;
    }

    // 8.获取worker的计算结果
    public int getResult() {
        int sum = 0;
        for (Map.Entry<String, Object> me : resultMap.entrySet()) {
            sum += (int) me.getValue();
        }
        return sum;
    }


}
