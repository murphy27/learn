package com.yun.learn.item.thread.thread_future;

public class Main {
    public static void main(String[] args) {
        Client client = new Client();
        System.out.println("客户端发出请求!");
        Data data = client.request("name");
        System.out.println("等待结果");
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println("获取的数据:" +data.getResult());
    }
}
