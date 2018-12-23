package com.yun.learn.item.thread.thread_master_worker;

import java.util.Random;

/**
 * @author Murphy
 * @date 2018/12/23
 */
public class Putong {

    public static void main(String[] args) {
        int result = 0;
        System.out.println("开始执行代码 .");
        long start = System.currentTimeMillis();
        Random random = new Random();
        for (int i=0;i<100;i++){
            result+=random.nextInt(1000);
        }
        System.out.println(result);
        System.out.println(System.currentTimeMillis()-start);
    }
}
