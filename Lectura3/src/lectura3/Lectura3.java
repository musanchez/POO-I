/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lectura3;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Lectura3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // JOptionPane.showMessageDialog(null, "Bienvenido a Java"); Parte 1 lectura
        
        String nombre = JOptionPane.showInputDialog("Cual es tu nombre?");
        String mensaje = String.format("Bienvenido, %s, a la programacion en Java", nombre);
        JOptionPane.showMessageDialog(null, mensaje);
        
    }
    
}
