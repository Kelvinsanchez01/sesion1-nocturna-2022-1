/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;


public class ejercicio9 {

    
    public static void main(String[] args) {
        //ENTRAda
        String   nombre = " KELVIN ";
        
        boolean lugar = true;
        boolean edad =false;
        boolean mesa = true;
        //proseso
        if (lugar== true){
            if (edad == true){
                if(mesa==true){
                    System.out.println (nombre + " esta acto para realizar el proseso de votasion ");
                
            }else{
              System.out.println (nombre + " no se encuentra en la mesa correcta pero esta en el lugar correcto ");  
                
            }
            
            }else{
            System.out.println (nombre + " no tiene la edad para realizar el proseso de votasion ");
            System.out.println (nombre + " edad minima para realizar este proseso es 16 años ");
        }
        }else{
    System.out.println (nombre + " no se encuentra en el establesimiento correcto ");
}
        
    }
     }

