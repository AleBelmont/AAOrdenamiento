/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herramientas;
//import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Alejandra
 */
public class Datos{
    
    public static double[] DatosAleatorios(int max, int min)
    {
        double[] num = new double[max];
        //Random r = new Random();
        
        for(int i=0; i<max; i++)
        {
            num[i] = ThreadLocalRandom.current().nextInt(min,max);
        }
        return num;
    }
}