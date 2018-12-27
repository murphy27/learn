package com.yun.learn.item.thread.thread_future;

import java.util.*;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureTest2 {
    private static class Task implements Callable<List<Map<String,Object>>> {
        @Override
        public List<Map<String,Object>> call() throws Exception {
            // 模拟真实事务的处理过程，这个过程是非常耗时的。
            List<Map<String,Object>> objects = new ArrayList<>();
            Map<String,Object> map = new HashMap<>();
            Random random = new Random();
            map.put(random.nextInt(100)+"",random.nextInt(100));
            objects.add(map);
            return objects;
        }
    }

    public static void main(String[] args) throws InterruptedException,
            ExecutionException {
        List<Future<List<Map<String,Object>>>> futures = new ArrayList<Future<List<Map<String,Object>>>>();
        ExecutorService executorService = Executors.newCachedThreadPool();

        System.out.println("已经提交资源申请");
        for (int i = 0; i < 10; i++) {
            futures.add(executorService.submit(new Task()));
        }
        int times = 1;
        for (Future<List<Map<String,Object>>> future : futures) {
            // 判断资源是不是已经准备完毕，准备完毕直接获取。
            int i=1;
            while (!future.isDone()) {
                Thread.sleep(50);
                System.out.println("第 "+ times+"资源还没有准备好 获取次数 "+1);
                i++;
            }
            System.out.println(future.get()+" "+times);
            times++;
        }
        executorService.shutdown();
    }
}
