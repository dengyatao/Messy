package com.Tzzzzz.juan;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 将数字 1 - n进行全排列  按字典序从小到大输出
 * 如  1 - 3
 *  123 132 213 231 312 321
 */
class GenerateP{

    private int n;  //  求 1-n所有数字的全排列
    private final int maxn = 110;//最多可排列组合的长度  1-100
    private boolean [] hashTable;
    private int [] p;

    public GenerateP(int n) {
        // TODO Auto-generated constructor stub
        this.n = n;
        hashTable = new boolean[maxn];
        p = new int [maxn];
        Arrays.fill(hashTable, false);
        Arrays.fill(p, 0);
    }
    public void generatep(int index){
        if(index == n + 1){
            for(int i = 1; i <= n; i++){
                System.out.print(p[i]+" ");
            }
            System.out.println();
            return;
        }
        for(int x = 1; x <= n; x++){
            if(hashTable[x] == false){
                p[index] = x;
                hashTable[x] = true;
                generatep(index + 1);
                hashTable[x] = false;
            }
        }
    }
}
public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=1;
        GenerateP generateP = new GenerateP(n);
        generateP.generatep(1);
        for (int i = 1; i <=n ; i++) {
            sum*=i;
        }
        System.out.println(sum);
    }

}
