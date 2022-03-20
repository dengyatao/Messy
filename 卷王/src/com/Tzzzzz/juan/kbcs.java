package com.Tzzzzz.juan;

public class kbcs {
    public static void main(String[] args) {
        kbcs kbcs = new kbcs();
        kbcs.test(1,2,3,1,3,4);
    }

    public void test(int... i){
        System.out.println(i[0]);
        System.out.println(i[1]);
        System.out.println(i[2]);
        System.out.println(i[3]);
    }
}

