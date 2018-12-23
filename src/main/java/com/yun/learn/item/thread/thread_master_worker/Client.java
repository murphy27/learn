package com.yun.learn.item.thread.thread_master_worker;

import java.util.Random;

public class Client {

    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        //获取机器的可用线程
        Master master = new Master(new Data(),
                Runtime.getRuntime().availableProcessors());
        //提交任务
        Random random = new Random();
        for (int i = 1; i <= 100; i++) {
            Task task = new Task();
            task.setId(i);
            task.setName("name" + i);
            task.setPrice(random.nextInt(1000));
            master.Submit(task);
        }
        //开始执行
        master.execute();
        //执行开始时间
        long start = System.currentTimeMillis();
        while (true) {
            //判断当所有线程都结束后打印结果
            if (master.isComplete()) {
                long end = System.currentTimeMillis() - start;//看执行耗时
                int result = master.getResult();
                System.out.println("执行结果  " + result + " 执行时间   " + end);
                break;
            }
        }

    }
}

