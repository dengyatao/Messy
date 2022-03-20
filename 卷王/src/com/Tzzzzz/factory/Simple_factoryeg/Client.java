package com.Tzzzzz.factory.Simple_factoryeg;

public class Client {
    public static void main(String[] args) {
        Chart chart;
        chart = ChartFactory.getChart("histogramchart");
        chart.display();
    }
}
