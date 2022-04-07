package com.dyt.Multithreading.Runnable;

//创建线程方式2，实现Runnable接口，重写run方法，执行线程需丢入runnable接口实现类，调用start方法


public class TestRunnable1 implements Runnable{
    @Override
    //run方法线程体
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("1 "+i);
        }
    }

    //main线程
    public static void main(String[] args) {
        //创建runnable接口的实现类对象
        TestRunnable1 testRunnable = new TestRunnable1();

        //创建线程对象，通过线程对象来开启线程，代理
        new Thread(testRunnable).start();

        for (int i = 0; i < 20; i++) {
            System.out.println("2 "+i);
        }
    }
}
