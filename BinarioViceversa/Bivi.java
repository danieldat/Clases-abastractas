/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinarioViceversa;

/**
 *
 * @author alumnot
 */
public class Bivi {
    
    
 public static void main (String [] args){
 
   int num=01010101;
   int decimal=0;
 
   for (int i=0;i<8;i++){
      int digito=num%10;
      decimal+=digito*Math.pow(2,i);
      num/=10; 
   }
     
     System.out.println(decimal);
     
     int dec=789;
     int bi=0;
     int aux=0;
     int exp=0;
     while (dec != 0) {
    aux=dec%2;
    bi+=aux*Math.pow(10, exp);
    exp++;
    dec/=2;
         
         
     }
     
 
     System.out.println(bi);
     
     
 }
     
      }   
       

