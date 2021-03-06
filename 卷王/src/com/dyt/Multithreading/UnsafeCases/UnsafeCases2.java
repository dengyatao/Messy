package com.dyt.Multithreading.UnsafeCases;

//银行取钱

public class UnsafeCases2 {
    public static void main(String[] args) {
        //账户
        Account account = new Account(100,"学费");

        Drawing a = new Drawing(account, 50, "a");
        Drawing b = new Drawing(account, 100, "b");

        a.start();
        b.start();
    }
}

//账户
class Account{
    int money; //余额
    String name; //卡名

    public Account(int money, String name) {
        this.money = money;
        this.name = name;
    }
}

//银行:模拟取钱
class Drawing extends Thread{

    Account account; // 账户
    //取了多少钱
    int drawingMoney;
    //现在手里有多少钱
    int nowMoney;

    public Drawing(Account account,int drawingMoney,String name){
        super(name);
        this.account = account;
        this.drawingMoney = drawingMoney;

    }

    @Override
    public void run() {
        //所的对象就是变化的量
        synchronized (account){
            //判断有没有钱
            if (account.money-drawingMoney < 0){
                System.out.println(Thread.currentThread().getName()+"钱不够");
                return;
            }

            //sleep放大问题的发生性
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //卡内余额
            account.money -= drawingMoney;
            //手里的钱
            nowMoney += drawingMoney;

            System.out.println(account.name+"余额为"+account.money);
            System.out.println(this.getName()+"手里的钱"+nowMoney);
        }

    }
}