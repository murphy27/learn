package com.yun.learn;

/**
 * @author Murphy
 * @date 2018/12/27
 */
public class Test {


    public static void main(String[] args) {
        String a = "1234567890abcdefg";
        int l = a.length();
        int page = l/5;
        for (int i=0;i<page;i++){
            System.out.println(a.substring(i*5,(i+1)*5));
        }
        System.out.println(a.substring(page*5,l));
    }
}
