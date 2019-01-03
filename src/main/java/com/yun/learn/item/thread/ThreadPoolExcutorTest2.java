package com.yun.learn.item.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ThreadPoolExcutorTest2{

    public Integer count;

    public ThreadPoolExcutorTest2(Integer count) {
        this.count = count;
    }

    /*@Override
    public void run() {
        System.out.println("任务" + count);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }*/

    public static void main(String[] args) throws InterruptedException {

        List<Future<Integer>> future = new ArrayList<>();


        BlockingQueue<Runnable> workQueue = new LinkedBlockingQueue<>();

        ThreadPoolExecutor pool = new ThreadPoolExecutor(2,
                3, 1L, TimeUnit.SECONDS, workQueue);
        for (int i = 1; i <= 20; i++) {
            future.add(pool.submit(new TestPool(i)));
        }
        Thread.sleep(1000);
        System.out.println("线程池中队列中的线程数量：" + workQueue.size());


        pool.shutdown();
    }


}

