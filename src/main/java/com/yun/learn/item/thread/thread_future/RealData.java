package com.yun.learn.item.thread.thread_future;

public class RealData implements Data {
    protected String result;

    public RealData(String para) {
        StringBuffer sb = new StringBuffer(para +" ");
        for (int i = 0; i < 10; i++) {
            sb.append(i+" ");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
            result = sb.toString();
        }
    }

    @Override
    public String getResult() {
        return result;
    }

}
