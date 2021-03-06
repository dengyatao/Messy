package com.dyt.Multithreading.State;

//测试Stop
//1.建议线程正常停止--->利用次数，不建议死循环
//2.建议利用标志位--->设置一个标志位
//3.不要使用stop或者destroy等过时或者JDK不建议使用的方法

public class TestStop implements Runnable{

    //1.设置一个标志位
    private boolean flag =true;

    @Override
    public void run() {
        int i = 0;
        while (flag){
            System.out.println("run Thread"+i++);
        }
    }

    //2.设置一个公开的方法停止线程，转换标志位
    public void stop(){
        this.flag = false;
    }
    public static void main(String[] args) {
        TestStop testStop = new TestStop();
        new Thread(testStop).start();

        for (int i = 0; i < 10000000; i++) {
            if(i == 9999999){
                testStop.stop();
                System.out.println("stop");
            }
        }
    }
}
