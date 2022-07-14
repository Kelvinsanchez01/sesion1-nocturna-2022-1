/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;
import javax.swing.JOptionPane;
public class ejersisio18 {

    public static void main(String[] args) {
        //entrada
        
        String celular = "";
        int longitud=0;
        // Proceso 
        celular = JOptionPane.showInputDialog("Ingrese su numero celular correctamente: ");
        longitud = celular.length(); 
        for(int indice = 0; indice < longitud; indice++) {
//validacion 
if (celular.charAt(indice) =='0'|| celular.charAt(indice) =='1'|| celular.charAt(indice) =='2'
        
|| celular.charAt(indice) =='3' || celular.charAt(indice) =='4' || celular.charAt(indice) =='5'
        || celular.charAt(indice) =='6' || celular.charAt(indice) =='8' || celular.charAt(indice) =='9'){  
    // Romper el ciclo
    indice = longitud;
JOptionPane.showMessageDialog(null, "El numero ingresado  esta correcto.");

 }else{
         JOptionPane.showMessageDialog(null, "El numero ingresado No esta correcto.");
         }
 }   
}
}