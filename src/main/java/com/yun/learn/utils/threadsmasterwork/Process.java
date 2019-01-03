package com.yun.learn.utils.threadsmasterwork;

import com.yun.learn.item.thread.thread_master_worker.Task;

import java.util.List;
import java.util.Map;

/**
 * @author Murphy
 * @date 2019/1/2
 */
public class Process extends Workers{


    public static Object handle(Object input) {
        Tasks tasks = (Tasks) input;
        int processdate = tasks.processdate();
        return processdate;
    }
}
