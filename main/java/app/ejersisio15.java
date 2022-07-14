/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import javax.swing.JOptionPane;

public class ejersisio15 {

    
    public static void main(String[] args) {
        


//Entrada
int numeroIngresado = 0;
int contadorDescendente = 0;
int contadorAscendente = 0; 
//Proceso
numeroIngresado = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero: "));
int entrada = Integer.parseInt(JOptionPane. showInputDialog(null, "*****MENU DE CONVERSIONES*******" + "\n"
+ "1. PRESENTA SECUENCIA DESCENDENTE" + "\n" + "2. PRESENTAR SECUENCIA DESCENDENTE"
+ "\n" + "3. SALIR"));
// evaluar con switch
switch (entrada)
{ case 1:
// Generamos la secuencia ascendente
    while (numeroIngresado < 9) {
numeroIngresado++; 
JOptionPane.showMessageDialog(null, numeroIngresado);}
break;
case 2:
// Generamos la secuencia descendente 
while (numeroIngresado > 1) {
   numeroIngresado--; 
JOptionPane.showMessageDialog(null, numeroIngresado);} 
    break;
    }
    
}
}