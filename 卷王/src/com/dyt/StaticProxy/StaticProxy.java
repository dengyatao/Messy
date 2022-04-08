package com.dyt.StaticProxy;

//静态代理模式：
//真实对象和代理对象都要实现同一个接口
//代理对象必须代理真实角色

//优点：代理对象可以做很多真实对象做不了的事情

public class StaticProxy {
    public static void main(String[] args) {

        new Thread(()-> System.out.println("marry")).start();

        new WeddingCompany(new You()).HappyMarry();

    }
}

interface Marry{
    void HappyMarry();
}
//真实
class You implements Marry{
    @Override
    public void HappyMarry() {
        System.out.println("Happy Marry");
    }
}
//代理
class WeddingCompany implements Marry{

    //真实目标角色
    private Marry target;

    public WeddingCompany(Marry target) {
        this.target = target;
    }

    @Override
    public void HappyMarry() {
        before();
        this.target.HappyMarry();//真实对象
        after();
    }

    private void after() {
        System.out.println("after");
    }

    private void before() {
        System.out.println("before");
    }
}
