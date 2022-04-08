package com.dyt.Lambda;

public class TestLambda2 {
    public static void main(String[] args) {
        ILove love = null;

        love = a -> System.out.println("lambda"+a+a);

        love.love(20);
    }
}

interface ILove{
    void love(int a);
}
