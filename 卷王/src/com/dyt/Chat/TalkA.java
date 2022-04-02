package com.dyt.Chat;

public class TalkA {
    public static void main(String[] args) {
        //开启两个线程
        new Thread(new TalkSend(7777,"localhost",9999)).start();
        new Thread(new TalkReceive(8888,"B")).start();
    }
}
