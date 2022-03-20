package com.Tzzzzz.juan;

import java.util.Scanner;

public class wanshu {
    public static void main(String[] args) {
        int c=1;
        Scanner sc = new Scanner(System.in);
        String st;
        st = sc.nextLine();
        String[] st1 = st.split(" ");
        int m = Integer.parseInt(st1[0]);
        int n = Integer.parseInt(st1[1]);


        int sum = 0;
        for (int i = m; i <= n; i++) {
            sum = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }

            if (sum == i) {
                c=0;
                System.out.print(i + " = " );
                for (int j = 1; j < sum; j++) {
                    if (sum % j == 0) {
                        System.out.print(j);
                    }
                    if (sum % (j + 1) == 0 && (j + 1) != sum) {
                        System.out.print(" + ");
                    }
                }
                System.out.println();

            }

        }
        if(c==1){
            System.out.println("None");
        }

    }
}
