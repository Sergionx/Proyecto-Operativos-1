/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces.clases;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author Sergionx
 */
public class Grafico_Utilidad {

    public static ChartPanel createUtilityXYChart(String titleChart, Dimension dimensionPanel,
            int[] utilidadesDisney, int[] utilidadesStar) {
        XYDataset dataset = crearDataset(utilidadesDisney, utilidadesStar);
        JFreeChart xyChart = crearChart(dataset, titleChart);
        ChartPanel chartPanel = new ChartPanel(xyChart);
        
//     TODO - Encontrar dimensiones buenas
        chartPanel.setPreferredSize(dimensionPanel); 
        final XYPlot plot = xyChart.getXYPlot();

        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        renderer.setSeriesPaint(0, Color.BLUE);
        renderer.setSeriesPaint(1, Color.RED);

        renderer.setSeriesStroke(0, new BasicStroke(4.0f));
        renderer.setSeriesStroke(1, new BasicStroke(4.0f));
        plot.setRenderer(renderer);

        return chartPanel;
    }
    
    public static JFreeChart crearChart(XYDataset dataset, String title) {
        String xLabel = "Tiempo (Dias)";
        
        JFreeChart chart = ChartFactory.createXYLineChart(title, xLabel, "Utilidad (Millones $)", dataset, PlotOrientation.VERTICAL, true, true, false);

        return chart;

    }
    
    public static XYDataset crearDataset(int[] utilidadesDisney, int[] utilidadesStar) {
        final XYSeries serieDisney = createSeries("Utilidad Disney", utilidadesDisney);
        final XYSeries serieStar = createSeries("Utilidad Star", utilidadesStar);

        final XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(serieDisney);
        dataset.addSeries(serieStar);

        return dataset;
    }

    private static XYSeries createSeries(String label, int[] datos) {
        final XYSeries serie = new XYSeries(label);
        for (int i = 0; i < datos.length; i++) {
            serie.add(i, datos[i]);
        }

        return serie;
    }
}
