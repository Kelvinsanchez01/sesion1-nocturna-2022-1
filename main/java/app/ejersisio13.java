/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//menu de conversiones
package app;
import javax.swing.JOptionPane;

public class ejersisio13 {

    
    public static void main(String[] args) {
        
//Entrada 
String numeroEnteroString = "5";
String numeroDecimalstring= "2.50";
char caracterSexo = 'M';
int numeroEnteroConvertido=0;
double numerodecimalConvertido = 0.0;
String caracterSexoString = "";
// Proceso
int entrada = Integer.parseInt(JOptionPane.showInputDialog(null, "*****MENU DE CONVERSIONES*******" + "\n"
+ "1.CONVERTIR DE STRING - ENTERO" + "\n" + "2.CONVERTIR DE STRING - DOUBLE" + "\n"
+ "3.CONVERTIR DE CHAR - STRING" + "\n" + "4.salir"));
//Aplicacion de anidaciones if
 if (entrada==1) {
//Presento la conversion de STRING - Entero 
numeroEnteroConvertido = Integer.parseInt(numeroEnteroString);
JOptionPane. showMessageDialog(null, "La conversion String - Entero es: " + numeroEnteroConvertido );

} else if (entrada == 2) {
numerodecimalConvertido = Double.parseDouble (numeroDecimalstring);
JOptionPane.showMessageDialog(null, "La conversion String - Double es: " + numerodecimalConvertido);
}else if (entrada == 3) {
caracterSexoString = String.valueOf(caracterSexo);
JOptionPane.showMessageDialog(null, "La conversion Char - String es: " + caracterSexoString);
    }else{
JOptionPane.showMessageDialog(null, "¡Gracias por utilizar el sistema!");
System.exit(0);
}
}
 }   