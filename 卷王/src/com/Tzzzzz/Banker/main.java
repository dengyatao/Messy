package com.Tzzzzz.Banker;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Banker bank = new Banker();
        bank.showData();
        //请求线程资源存放的数组
        int[] request =new int[3];
        int requestNum;
        String[] source = new String[]{"A","B","C"};
        Scanner cs = new Scanner(System.in);
        String choice = new String();
        while(true){                //循环执行，直到用户输入n（NO）
            System.out.println("请输入要请求的进程号（0--4）：");
            requestNum = cs.nextInt();
            System.out.print("请输入请求的资源数目");
            for(int i = 0;i<3;i++) {
                System.out.println(source[i]+"资源的数目：");
                request[i] = cs.nextInt();
            }
            bank.change(requestNum, request);  //分配数据
            System.out.println("是否再请求分配(y/n)");
            choice = cs.next();
            if(choice.equals("n"))
                break;
        }
    }
}
