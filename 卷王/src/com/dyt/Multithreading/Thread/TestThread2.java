package com.dyt.Multithreading.Thread;

//联系Thread，实现多线程同步下载图片

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class TestThread2 extends Thread{

    private String url; //网络图片地址
    private String name; //储存的文件名

    //构造器
    public TestThread2(String url,String name){
        this.name = name;
        this.url = url;
    }

    @Override
    public void run() {
        WebDownloader webDownloader = new WebDownloader();
        webDownloader.downloader(url,name);
        System.out.println("下载了文件："+name);

    }

    public static void main(String[] args) {
        TestThread2 t1 = new TestThread2("https://www.xiejiahao.top/resource/blog/12/a2b4d8516b7b4121a550ad70181b4d85.jpg","1.jpg");
        TestThread2 t2 = new TestThread2("https://www.xiejiahao.top/resource/blog/12/a9b3f7b7ee0a4d959115a49c61fa65a7.webp","2.jpg");
        TestThread2 t3 = new TestThread2("https://www.xiejiahao.top/resource/public/banner-image/2c8321095bb64e67a8d4c0aa303e8ca4.webp","3.jpg");

        t1.start();
        t2.start();
        t3.start();
    }
}

//下载器
class WebDownloader{
    //下载方法
    public void downloader(String url,String name){
        try {
            FileUtils.copyURLToFile(new URL(url),new File(name));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IO异常，downloader方法出问题");
        }
    }
}
