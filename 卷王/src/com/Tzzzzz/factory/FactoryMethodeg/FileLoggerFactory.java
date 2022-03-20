package com.Tzzzzz.factory.FactoryMethodeg;

public class FileLoggerFactory implements LoggerFactory{
    @Override
    public Logger createLogger() {
        return new FileLogger();
    }
}
