package com.yun.learn.daytoday.thread_CyclicBarrier;

/**
 * @author Murphy
 * @date 2018/12/22
 */
public class Main {

    public static void main(String[] args) throws Exception {
        boolean finish = false;
        ThreadMng threadMng = new ThreadMng() {
            @Override
            public void innit() {

            }
        };
        threadMng.checkResultService();
        System.out.println("执行完成");
    }
}
