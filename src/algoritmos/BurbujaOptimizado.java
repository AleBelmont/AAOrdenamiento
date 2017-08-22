/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmos;

/**
 *
 * @author Alejandra
 */
public class BurbujaOptimizado {
    private double tiempo_final;
    private double tiempo_inicial;
    private double tiempo_prom;
    private int intercambios;
    private int comparaciones;

    public BurbujaOptimizado() {
        this.tiempo_final = 0;
        this.tiempo_inicial = 0;
        this.tiempo_prom = 0;
        this.comparaciones = 0;
        this.intercambios = 0;
    }
    
    public void ordenar(double []arreglo)
    {
        this.tiempo_inicial = System.currentTimeMillis();
       for(int i=arreglo.length-1; i>0; i--)
       {
            for(int j=0; j<i; j++)
            {
                this.comparaciones ++;
		if(arreglo[j]>arreglo[j+1])
		{
                    double k=arreglo[j];
                    arreglo[j]=arreglo[j+1];
		    arreglo[j+1]=k;
                    this.intercambios++;
		}
            }
	}
       this.tiempo_final = System.currentTimeMillis();
       this.tiempo_prom = this.tiempo_final - this.tiempo_inicial;
    }
    
    public double getTiempo_inicial() {
        return tiempo_inicial;
    }

    public void setTiempo_inicial(double tiempo_inicial) {
        this.tiempo_inicial = tiempo_inicial;
    }

    public double getTiempo_final() {
        return tiempo_final;
    }

    public void setTiempo_final(double tiempo_final) {
        this.tiempo_final = tiempo_final;
    }

    public double getTiempo_prom() {
        return tiempo_prom;
    }

    public void setTiempo_prom(double tiempo_prom) {
        this.tiempo_prom = tiempo_prom;
    }
}
