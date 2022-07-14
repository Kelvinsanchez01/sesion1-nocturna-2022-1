/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//CONVERSION EN JAVA
package app;

import javax.swing.JOptionPane;

public class ejersisio12 {

    
    public static void main(String[] args) {
      
//Entrada 
String numeroenterostring = "5";
String numerodecimalString= "2.50";
int numeroenteroConvertido=0;
double numerodecimalConvertido=0.0;
//Proceso 
numeroenteroConvertido = Integer.parseInt(numeroenterostring); 
numerodecimalConvertido = Double.parseDouble (numerodecimalString);
// Salida
JOptionPane. showMessageDialog(null, "El numero entero convertido es: " + numeroenterostring);
JOptionPane.showMessageDialog(null, "El numero decimal convertido es: " + numerodecimalString);
    }
    
}
