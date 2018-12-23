package com.yun.learn.daytoday.thread_CountDownLatch;

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
        boolean b = threadMng.checkResultService();
        System.out.println(b?"执行完成":"执行失败");
    }
}
