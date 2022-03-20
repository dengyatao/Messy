package com.Tzzzzz.juan;

import java.util.Arrays;
import java.util.Scanner;

public class Mainn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int x[] = new int[k];
        int y[] = new int[k];
        for (int i = 0; i <k ; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        int a = 0;
        for (int j = 1; j < k; j++) {
            for (int m = 0; m < j ; m++) {
                if(y[j] == 0){
                    a++;
                    break;
                }
                if(y[j] == x[m]){
                    a++;
                    for (int q = j+1; q < k; q++) {
                        if(y[j] == y[q]){
                            y[q] = 0;
                        }
                    }
                    break;
                }
            }
        }
        System.out.println(k-a);
    }
}
