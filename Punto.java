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
public class Punto {

    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;

    }
    
    ///Constructo copia
    public Punto(Punto p) {
    
        this.x = p.getX();
        this.y = p.getY();
    }
    
      //public Punto(Punto p) {
    
        //this.x = p.x;
        //this.y = p.y;
    }


