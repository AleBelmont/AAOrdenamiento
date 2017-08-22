/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aaordenamiento3cm1;

import Herramientas.Datos;
import algoritmos.Burbuja;
import algoritmos.BurbujaOptimizado;
import Herramientas.Grafica;

/**
 *
 * @author Roberto Cruz Leija
 */
public class AAOrdenamiento3CM1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double [] datos = new double[]{6,5,3,1,8,7,2,4};
        double [] datos2= new double[]{8,7,6,5,4,3,2,1};
        double [] datos3= datos.clone();
        
        int a = 20;
        double [] y = new double[a];
        double [] e = new double[a];
        double [] x = new double[a];
        
        double [] dat = Herramientas.Datos.DatosAleatorios(50,0);
        //int a = 20;
        //System.out.println();
        for(int i=0; i<10 ; i++)
        {
        //double [] dat = Herramientas.Datos.DatosAleatorios(a,0);
        System.out.println();
        
        x[i] = a;
        System.out.println();
        Burbuja b1 = new Burbuja();
        b1.ordenar(dat);
        y[i] = b1.getTiempo_final();
        System.out.println();
        BurbujaOptimizado b2 = new BurbujaOptimizado();
        b2.ordenar(dat);
        e[i] = b2.getTiempo_final();
        System.out.println();
        a = a+50;
        }
        
        Grafica g = new Grafica();
        g.agregarGrafica(x, y, e);
        g.mostrar();
       
        System.out.println();
    }
   
}
