/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herramientas;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author Alejandra
 */
public class Grafica {
    private JFreeChart grafica;
    private XYSeriesCollection datos;
    private String titulo;
    private String tituloX;
    private String tituloY;
    
    public Grafica()
    {
        this.grafica = null;
        this.datos = new XYSeriesCollection();
        this.titulo = "Grafica de Algoritmos";
        this.tituloX = "Numero de Datos";
        this.tituloY = "Tiempo";
    }
    
    public void agregarGrafica(double[] x, double[] y, double[] e)
    {
        XYSeries s1 = new XYSeries("Burbuja");
        XYSeries s2 = new XYSeries("Burbuja Optimizada");
        
        int l = x.length, i;
        for(i=0; i<l; i++)
        {
            s1.add(x[i],y[i]);
            s2.add(x[i],e[i]);
        }
        
        datos.addSeries(s1);
        datos.addSeries(s2);
    }
    
    public void eliminarGrafica(double[] x, double[] y, double[] e)
    {
        datos.removeAllSeries();
        agregarGrafica(x,y,e);
    }
    
    public void mostrar()
    {
        grafica = ChartFactory.createXYLineChart(titulo, tituloX, tituloY, datos, PlotOrientation.VERTICAL, true, true, true);
        ChartFrame panel = new ChartFrame(null,grafica);
        panel.pack();
        panel.setVisible(true);
    }
}
