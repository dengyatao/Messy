package com.dyt.Multithreading.UnsafeCases;

//不安全买票

public class UnsafeCases1 {
    public static void main(String[] args) {
        BuyTicket station = new BuyTicket();

        new Thread(station ,"a").start();
        new Thread(station ,"b").start();
        new Thread(station ,"c").start();
    }
}

class BuyTicket implements Runnable{

    private int ticketnums = 10;
    boolean flag = true;

    @Override
    public void run() {
        while(flag){
            try {
                buy();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    //synchronized同步方法
    private synchronized void buy() throws InterruptedException {
        //判断是否有票
        if (ticketnums <= 0){
            flag = false;
            return ;
        }

        System.out.println(Thread.currentThread().getName()+"买到"+ticketnums--);
    }
}
