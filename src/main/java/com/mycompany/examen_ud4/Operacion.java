
package com.mycompany.examen_ud4;

public class Operacion {
    public Operacion () {};
    
    public void operacion1 (double num1, double num2) {
        double resultado = num1;
        
        if (num1 > num2) {
            // No hacemos nada para generar warning
        }
        for (int cont = 1; cont < num2; cont++)  // No pongo llaves para generar warning
            resultado = resultado * num1;
        System.out.println("El resultado de " + num1 + " elevado a " + num2 + " es: " + resultado);
    }        
}
 