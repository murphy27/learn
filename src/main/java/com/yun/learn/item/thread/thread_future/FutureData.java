package com.yun.learn.item.thread.thread_future;


public class FutureData implements Data {

    protected RealData realData = null;
    protected boolean isReady = false;

    @Override
    public synchronized String getResult() {
        while (!isReady) {
            try {
                wait();
            } catch (Exception e) {
            }
        }
        return realData.result;
    }

    public synchronized void setRealData(RealData realData) {
        if (isReady) {
            return;
        }
        this.realData = realData;
        isReady = true;
        notifyAll();
    }

}
