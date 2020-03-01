/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractaYgeometrica;

/**
 *
 * @author alumnot
 */
public abstract class Geometrica {
    
    protected String nombre;
    
    
    public Geometrica(String nombre)
    {this.nombre=nombre;}        
    

   public abstract double area ();

    public abstract double perimentro();
    
    
     public String toString()
     {return nombre;}
    
    
    
    
    
    
    
}
