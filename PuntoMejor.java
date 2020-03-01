/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Puto;

/**
 *
 * @author alumnot
 */
public class PuntoMejor extends Punto {
    
    Punto g1=new Punto(3,6);
    Punto g2=new Punto(10,-1);
    
    public double distancia(){  /////NO me acepta staticos porque los getters no son staticos
    
        double dis;
        dis = Math.sqrt(Math.sqrt((g1.getX()-g2.getY())+Math.sqrt((g2.getX()-g2.getY()))));
    return dis;
    
    }

    public PuntoMejor(double x, double y) {
        super(x, y);
    }
    
    
    
    
    
    
    
}
