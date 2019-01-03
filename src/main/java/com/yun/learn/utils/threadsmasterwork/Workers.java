package com.yun.learn.utils.threadsmasterwork;

import com.yun.learn.item.thread.thread_master_worker.Data;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Workers implements Runnable {

    //定义每一个ConcurrentLinkedQueue队列去引用Master中的ConcurrentLinkedQueue
    private ConcurrentLinkedQueue<Object> workQueue;

    //定义一个ConcurrentHashMap去引用Master中的ConcurrentHashMap承装计算的结果集
    private ConcurrentHashMap<String, Object> resultMap;

    //真正执行业务的方法
    public static Object handle(Object input) {
        Object output = null;
        return output;
    }

    //创建ConcurrentLinkedQueue引用
    public void setResultMap(ConcurrentHashMap<String, Object> resultMap) {
        this.resultMap = resultMap;
    }

    //创建ConcurrentHashMap引用
    public void setWorkerQueue(ConcurrentLinkedQueue<Object> workQueue) {
        this.workQueue = workQueue;
    }

    //run方法中放计算逻辑
    @Override
    public void run() {
        while (true) {
            //从队列中取出任务并删除
            Object input = workQueue.poll();
            if (null == input){break;}
            Object output = Data.handle(input);
            this.resultMap.put(Integer.toString(input.hashCode()), output);
        }
    }
}
