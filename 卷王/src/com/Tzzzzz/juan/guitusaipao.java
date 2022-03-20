package com.Tzzzzz.juan;

import java.util.Scanner;

public class guitusaipao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v1 = sc.nextInt();
        int v2 = sc.nextInt();
        int t = sc.nextInt();
        int s = sc.nextInt();
        int l = sc.nextInt();
        sc.close();

        run(1, v1, v2, t, s, l, 0, 0, 0);
    }

    private static void run(int time, int v1, int v2, int t, int s, int l, int x1, int x2,int left) {
        //计算第time秒的状态
        if(left>0) {
            //第time秒兔子在休息，x1不增加，x2增加
            x2 += v2;
            //这一秒消耗掉
            left--;
        }else {
            //第time秒兔子没有休息，x1增加，x2增加
            x1+=v1;
            x2+=v2;
            //计算兔子是否需要休息
            if(x1-x2>=t) {
                left = s;
            }
        }

        if(x1 == l) {
            if(x1 == x2) {
                System.out.println("D");
            }else {
                System.out.println("R");
            }
            System.out.println(time);
            return;
        }

        if(x2 == l) {
            if(x1 == x2) {
                System.out.println("D");
            }else {
                System.out.println("T");
            }
            System.out.println(time);
            return;
        }

        run(time+1, v1, v2, t, s, l, x1, x2, left);
    }
}
