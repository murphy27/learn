package com.yun.learn.daytoday.thread_CountDownLatch;

import java.util.concurrent.CountDownLatch;

/**
 * @author Murphy
 * @date 2018/12/22
 */
public abstract class TaskRunnable implements Runnable {

    /**
     *  任务计数器
     *  完成任务后跑 _latch.countDown();
     */
    private CountDownLatch _latch;

    /**
     *  实例线程任务名
     */
    private String _taskName;

    /**
     *  完成任务的标识 默认为false
     */
    private boolean _taskUp;

    public boolean is_taskUp() {
        return _taskUp;
    }

    public void set_taskUp(boolean _taskUp) {
        this._taskUp = _taskUp;
    }

    public TaskRunnable(String taskName, CountDownLatch _latch){
        super();
        this._latch=_latch;
        this._taskName = taskName;
        this._taskUp = false;
    }

    @Override
    public void run(){
        try {
            this.execute(5000,10000,15000);
            _taskUp = true;
        } catch (Throwable t){
            _taskUp = false;
            throw new RuntimeException(t);
        } finally{
            if (null!=_latch){
                _latch.countDown();
            }
        }
    }

    public abstract void execute(int...milians) throws Exception;
}
