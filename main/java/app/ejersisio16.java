/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;
import javax.swing.JOptionPane;
public class ejersisio16 {

   
    public static void main(String[] args) {
      //Entrada
      String palabra = "";
      int longitud = 0; 
      int indice = 0;
      // Proceso
      palabra = JOptionPane.showInputDialog("Ingrese una palabra:");
      longitud = palabra.length();
      do {
JOptionPane.showMessageDialog(null, palabra.charAt(indice));
indice++; 
      } while (indice < longitud);
    
 } }