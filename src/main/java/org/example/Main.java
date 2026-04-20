package org.example;

import org.knowm.xchart.BitmapEncoder;
import org.knowm.xchart.QuickChart;
import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.XYChart;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {


        double[] Px = new double[]{1.0,7.0,7.0,1.0,1.0};
        double[] Py = new double[]{1.0,1.0,5.0,5.0,1.0};

        XYChart chart = QuickChart.getChart("Punkty", "X", "Y", ".", Px, Py);

        chart.addSeries("Trojkat",new int[]{15,40,30,15},new int[]{5,10,20,5});
        new SwingWrapper(chart).displayChart();
    }
}