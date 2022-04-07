package com.dyt.Multithreading.Thread;

//创建线程方式1：继承Thread类，重写run()方法，调用start开启线程
//线程开启不一定立即执行，由CPU调度执行

public class TestThread1 extends Thread{

    @Override
    //run方法线程体
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("1 "+i);
        }
    }

    //main线程
    public static void main(String[] args) {
        //创建一个线程对象，调用start()开启线程
        TestThread1 testThread1 = new TestThread1();
        testThread1.start();

        for (int i = 0; i < 20; i++) {
            System.out.println("2 "+i);
        }
    }
}
