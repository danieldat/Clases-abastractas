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
public class ClaseHarry {
  Scanner sc=new Scanner(System.in);  
 private int[] harry;
 
 
 public ClaseHarry( ){
 }
 
public void generator(){
System.out.println("Introduce el tamaño de tu array");
int t=sc.nextInt();
this.harry=new int[t];
for(int x=0;x<t;x++){
System.out.println("Introduce valor numérico");
this.harry[x]=sc.nextInt();
}
}

public int minimo(){
    int minimo=99999999;
for (int i=0;i<this.harry.length;i++){
   if(minimo>this.harry[i]){
       minimo=this.harry[i];}
}

   
return minimo;
}


public int maximo(){
    int max=0;
for (int i=0;i<this.harry.length;i++){
   if(max<this.harry[i]){
       max=this.harry[i];}
}

   
return max;
}


public int media(){
     int media=0;
    for(int j=0;j<this.harry.length;j++){
    media+=this.harry[j];
    }
    media/=this.harry.length;
  return media;

            }

public void rotacion(){
    int aux=this.harry[0];
for (int f=0;f<this.harry.length-1;f++){
 this.harry[f]=this.harry[f+1];
}
this.harry[this.harry.length-1]=aux;


for (int f=0;f<this.harry.length;f++){
    System.out.println(this.harry[f]);

}}

public void rotacion_inversa(){  ///no sale
    
int aux=this.harry[this.harry.length-1];
for (int u=this.harry.length;u<0;u--){

this.harry[u]=this.harry[u-1];

}
this.harry[0]=aux;

for(int u=0;u<this.harry.length;u++){
System.out.println(this.harry[u]);

}}


public void vuelta(){
int v=this.harry.length-1;
int[] potter=new int[this.harry.length];
for(int c=0;c<this.harry.length;c++){


 potter[c]=this.harry[v];
 v--;
}
for(int c=0;c<this.harry.length;c++){
this.harry[c]=potter[c];
System.out.println(this.harry[c]);

}





}





}











 
    
    
    
    
    
    
    
    
    

