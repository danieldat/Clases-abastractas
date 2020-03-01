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
public class CirculoGosht extends Geometrica {

    private double radio;
    
    public CirculoGosht(String nombre,double radio) {
        super(nombre);///damos nombre a la clase padre
        this.radio=radio;
    }
    
    public CirculoGosht (){
    this("circulo",1.0);     ////COn esto metemos datos al constructor de arriba
       } 
    

    @Override
    public double area() {
    return radio * radio * Math.PI;
         
    }

    @Override
    public double perimentro() {
        return 2 * Math.PI * radio;
    }
    
    public String to_String(){
    
    return "Nombre: "+super.toString()+"radio(constructor= )"+radio;
    
    
    }


    
    
    
    

}
