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
public class PruebaPunto {
    
    public static void main (String [] args){
    
        
      Punto q1 = new Punto(1, 2);
      Punto q2 = new Punto(q1);
      
        System.out.println("q1: " +  q1.getX() + q1.getY() + " q2: " + q2.getX() + q2.getY());
        
    
    
    
    }
    
    
    
    
    
    
    
    
}
