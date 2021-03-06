package com.dyt.Multithreading.ProducerCustomer;

//测试：生产者消费者模型--->利用缓冲区解决：管程法

import com.sun.corba.se.impl.orbutil.concurrent.Sync;

//生产者、消费者、产品、缓冲区
public class TestPC1 {

    public static void main(String[] args) {
        SynContainer container = new SynContainer();

        new Producer(container).start();
        new Customer(container).start();
    }
}

//生产者
class Producer extends Thread{
    SynContainer container;
    public Producer(SynContainer container){
        this.container = container;
    }

    //生产

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("生产了第"+i+"只鸡");
            container.push(new Chicken(i));
        }
    }
}

//消费者
class Customer extends Thread{
    SynContainer container;
    public Customer(SynContainer container){
        this.container = container;
    }

    //消费

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("消费了第"+container.pop().id+"只鸡");
        }
    }
}

//产品
class Chicken{
    int id;//产品编号

    public Chicken(int id) {
        this.id = id;
    }
}

//缓冲区
class SynContainer{
    //需要一个容器大小
    Chicken[] chickens = new Chicken[10];
    //计数器
    int count = 0;

    //生产者放入产品
    public synchronized void push(Chicken chicken){
        //如果容器满了，等待消费者消费
        while (count == chickens.length-1){
            //通知消费者消费，生产等待
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //如果没有满，添加产品
        chickens[count] = chicken;
        count++;

        //通知消费者消费
        this.notifyAll();
    }

    //消费者消费产品
    public synchronized Chicken pop(){
        //判断是否能消费
        while (count <= 0){
            //通知生产者生产，消费者等待
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        //如果可以消费
        count--;
        Chicken chicken = chickens[count];

        //吃完了，通知生产者生产
        this.notifyAll();
        return chicken;
    }


}