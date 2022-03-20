package com.Tzzzzz.Banker;

public class Banker {
    int[] available = new int[]{3,3,2};//可利用资源向量
    int[][] max = new int[][]{{7,5,3},{3,2,2},{9,0,2},{2,2,2},{4,3,3}};//最大需求矩阵
    int[][] allocation = new int[][]{{0,1,0},{2,0,0},{3,0,2},{2,1,1},{0,0,2}};//分配矩阵
    int[][] need = new int[][]{{7,4,3},{1,2,2},{6,0,0},{0,1,1},{4,3,1}};//需求矩阵
    void showData() {        //将各矩阵数据输出
        System.out.println("进程号   Max            All            Need   ");
        System.out.println("     A  B  C        A  B  C         A  B  C");
        for(int i = 0;i<5;i++){
            System.out.print(i+"    ");
            for(int m = 0;m<3;m++)
                System.out.print(max[i][m]+"  ");
            System.out.print("\t\t");
            for(int m = 0;m<3;m++)
                System.out.print(allocation[i][m]+"  ");
            System.out.print("\t\t");
            for(int m = 0;m<3;m++)
                System.out.print(need[i][m]+"  ");
            System.out.println();
        }
    }

    //1.请求资源和最大需求资源比
    //2.请求资源和系统所剩资源比
    //3.试分配资源，修改数值
    //4.安全性检查
    boolean change(int inRequestNum,int[] inRequest){       //分配数据
        int requestNum = inRequestNum;
        int[] request = inRequest;
        if(!(request[0]<=need[requestNum][0]&&request[1]<=need[requestNum][1]&&request[2]<=need[requestNum][2])) {
            System.out.println("请求的资源数超过了所需要的最大值，分配错误");
            return false;
        }
        if(!(request[0] <= available[0] && request[1] <= available[1] && request[2] <= available[2])) {
            System.out.println("尚无足够资源分配，必须等待");
            return false;
        }

        for(int i = 0;i<3;i++){             //试分配数据给请求的线程
            //资源池的每类资源减去每类请求资源数量
            available[i] = available[i]-request[i];
            //当前线程allocation中每类资源加上每类资源请求数量
            allocation[requestNum][i] = allocation[requestNum][i] + request[i];
            //当前线程need中每类资源数量减去每类资源的请求数量
            need[requestNum][i] = need[requestNum][i] - request[i];
        }

        boolean flag = checkSafe(available[0],available[1],available[2]);//进行安全性检查并返回是否安全

        if(flag==true){
            System.out.println("能够安全分配");
            return true;
        }
        else{           //不能通过安全性检查 恢复到未分配前的数据
            System.out.println("不能够安全分配");
            for(int i = 0;i<3;i++) {
                available[i] = available[i]+request[i];
                allocation[requestNum][i] = allocation[requestNum][i] - request[i];
                need[requestNum][i] = need[requestNum][i] + request[i];
            }
            return false;
        }
    }
    boolean checkSafe(int a,int b,int c){           //安全性算法
        int[] work = new int[]{a,b,c};
        int i=0;
        boolean[] finish = new boolean[5];     //boolean类型默认是false
        while(i<5){
            if(finish[i]==false&&need[i][0]<=work[0]&&need[i][1]<=work[1]&&need[i][2]<=work[2]) {   //找到满足的修改work值，然后i=0，重新从开始的为分配的中寻找
                System.out.println(i+"分配成功");
                for(int j = 0; j <3; j++)
                    work[j] =work[j] + allocation[i][j];
                finish[i] = true;
                i=0;
            }
            else//如果没有找到直接i++
                i++;
        }
        for(i=0;i<5;i++){               //通过finish数组判断是否都可以分配
            if(finish[i]==false)
                return false;
        }
        return true;
    }

}
