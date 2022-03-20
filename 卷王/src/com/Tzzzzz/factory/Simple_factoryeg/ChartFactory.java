package com.Tzzzzz.factory.Simple_factoryeg;

public class ChartFactory {
    public static Chart getChart(String type){
        Chart chart = null;
        if(type.equalsIgnoreCase("histogramchart")){
            chart = new HistogramChart();
        } else if(type.equalsIgnoreCase("piechart")){
            chart = new PieChart();
        } else if(type.equalsIgnoreCase("linechart")){
            chart = new LineChart();
        }
        return chart;
    }
}
