package com.Tzzzzz.factory.FactoryMethodeg;

public class Client {
    public static void main(String[] args) {
        LoggerFactory factory = new FileLoggerFactory();
        Logger logger = factory.createLogger();
        logger.writeLog();
    }
}
