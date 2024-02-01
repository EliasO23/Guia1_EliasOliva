/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1_eliasoliva;

/**
 *
 * @author MINEDUCYT
 */
import javax.swing.JOptionPane;

public class Ejercicio1_EliasOliva {

    public static void main(String[] args) {
        String firstName, secondName, firstLastName, secondLastName;
        
        firstName = JOptionPane.showInputDialog("Escriba su primer nombre: ");
        secondName = JOptionPane.showInputDialog("Escriba su segundo nombre: ");
        firstLastName = JOptionPane.showInputDialog("Escriba su primer apellido: ");
        secondLastName = JOptionPane.showInputDialog("Escriba su segundo apellido: ");
        
        JOptionPane.showMessageDialog(null, "Bienvenid@ " + firstName + " " + secondName + " " + firstLastName + " " + secondLastName + "\n Ingreso correctamente al Portal UNAB", "Notificacion", JOptionPane.INFORMATION_MESSAGE);
        System.out.println("Que, desea hacer hoy: " + firstName + " " + secondName + " " + firstLastName + " " + secondLastName);
        
        System.exit (0);
    }
}
