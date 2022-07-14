/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;


public class ejersisio10 {

    
    public static void main(String[] args) {
      //Entrada 
        String empleado = "MARCOS AROCA";
        String cargo = "GERENTE DE COMPRAS"; 
        double pagoHora = 20.0;
        int numeroHora = 160; 
        double sueldo = 0.0;
        double iess = 0.0;
        double netoRecibir = 0.0; 
// Proceso
        sueldo = numeroHora * pagoHora;
        iess = sueldo * 0.09;
        netoRecibir = sueldo = iess;
        //Salida
        
        System.out.println("---------ROL DEL MES DE MAYO 2022-------------");
        System.out.println("Empleado: " + empleado);
        System.out.println("Cargo: " + cargo);
        System.out.println("Sueldo: " + sueldo); System.out.println("Descuento IESS: " + iess);
        System.out.println("Valor Neto a Recibir: " + netoRecibir);
    }
    
}  
    
    

