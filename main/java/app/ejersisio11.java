/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;
import java.util. Scanner;

public class ejersisio11 {

    
    public static void main(String[] args) {
        
// Entrada
        Scanner entrada = new Scanner(System.in);
        
        String producto = ""; 
         int cantidad = 0;
        double precio = 0.0;
        double total = 0.0;
        System.out.println("--------------VENTA DE PRODUCTOS----");
          // Proceso"
            System.out.print("Ingrese al producto: ");
        producto = entrada.nextLine(); 
        System.out.print("Ingrese el precio: ");
        precio = entrada.nextDouble(); 
        System.out.print("Ingrese la cantidad: ");
        cantidad = entrada.nextInt ();
        // calculo
        total = cantidad * precio;
        // Salida - Resultados 
        System.out.print("el total a cancelar es: " + total);
    }
    }
    

