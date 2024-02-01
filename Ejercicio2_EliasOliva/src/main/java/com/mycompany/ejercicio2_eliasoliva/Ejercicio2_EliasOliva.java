/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2_eliasoliva;

/**
 *
 * @author MINEDUCYT
 */
import javax.swing.JOptionPane;

public class Ejercicio2_EliasOliva {

    public static void main(String[] args) {
        String firstNum, secondNum, thirdNum;
        
        float num1, num2, num3, suma, resta, multiplicacion;
        
        firstNum = JOptionPane.showInputDialog("Escria el primer entero: ");
        secondNum = JOptionPane.showInputDialog("Escriba el segundo entero");
        thirdNum = JOptionPane.showInputDialog("Escriba el tercer entero");
        
        num1 = Float.parseFloat(firstNum);
        num2 = Float.parseFloat(secondNum);
        num3 = Float.parseFloat(thirdNum);
        
        suma = num1 + num2 + num3;
        resta = num1 - num2 - num3;
        multiplicacion = num1 * num2 * num3;
        
        JOptionPane.showMessageDialog (null, "Los numeros se agregaron correctamente \n - Vea el resultado en consola ", "Notificacion", JOptionPane.INFORMATION_MESSAGE);
        System.out.println("La suma de: " + num1 + " + " + num2 + " + " + num3 + "\n  Es:" + suma);
        System.out.println("\nLa resta de: " + num1 + " - " + num2 + " - " + num3 + "\n  Es:" + resta);
        System.out.println("\nLa multiplicación de: " + num1 + " * " + num2 + " * " + num3 + "\n  Es:" + multiplicacion);
        
        System.exit (0);
    }
}
