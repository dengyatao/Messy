package com.Tzzzzz.factory.FactoryMethodeg;

public class FileLogger implements Logger{
    @Override
    public void writeLog() {
        System.out.println("文件日志记录");
    }
}
