/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arraysmonos;
import java.util.Scanner;
/**
 *
 * @author alumnot
 */
public class PruebaHarry {
    
    
    public static void main (String[]args){
    Scanner sc=new Scanner(System.in);
    
    ClaseHarry h1=new ClaseHarry();
    
    h1.generator();
    System.out.println(h1.minimo()+" es el minimo");
    System.out.println(h1.maximo()+" es el maximo");
    System.out.println(h1.media()+" es la media");
    System.out.println("---------------------------------");
    ///h1.rotacion();
    System.out.println("---------------------------------");
    //h1.rotacion_inversa();
    System.out.println("---------------------------------");
    h1.vuelta();
    
    }
   
}
