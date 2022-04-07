package com.dyt.Multithreading.Runnable;

//多个线程同时操作同一个对象
//买火车票的例子

//发现问题：多个线程操作同一个资源，线程不安全，资源紊乱
public class TestRunnable2 implements Runnable{

    private int ticketNums = 10;

    @Override
    public void run() {
        while (true){
            if (ticketNums <= 0){
                break;
            }

            //模拟延时
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"买到了第"+ticketNums--+"票");
        }
    }

    public static void main(String[] args) {
        TestRunnable2 ticket = new TestRunnable2();

        new Thread(ticket,"A").start();
        new Thread(ticket,"B").start();
        new Thread(ticket,"C").start();
    }
}
