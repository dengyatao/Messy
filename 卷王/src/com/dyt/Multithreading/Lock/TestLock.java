package com.dyt.Multithreading.Lock;

//测试Lock锁

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TestLock {
    public static void main(String[] args) {
        TestLock2 testLock2 = new TestLock2();

        new Thread(testLock2).start();
        new Thread(testLock2).start();
        new Thread(testLock2).start();
    }
}

class TestLock2 implements Runnable{
    int ticketNums = 10;

    //定义Lock锁
    private final Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true){
            try{
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                lock.lock();//加锁
                if (ticketNums > 0){
                    System.out.println(ticketNums--);
                }else{
                    break;
                }
            }finally {
                lock.unlock();//解锁
            }

        }
    }
}