/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lectura;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class PruebaCuenta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Scanner entrada = new Scanner(System.in);
        
        /*Cuenta miCuenta = new Cuenta();
        
        System.out.printf("El nombre inicial es: %s%n%n", miCuenta.getNombre());
        
        System.out.println("Introduzca el nombre: ");
        String elNombre = entrada.nextLine();
        miCuenta.setNombre(elNombre);
        System.out.println("");
        
        System.out.printf("El nombre en el objeto miCuenta es: %s%n%n", miCuenta.getNombre());*/
        // Comentareo codigo anterior e incluyo el nuevo
        Cuenta cuenta1 = new Cuenta("Jane Green");
        Cuenta cuenta2 = new Cuenta("John Blue");
        
        System.out.printf("El nombre de la cuenta1 es: %s%n", cuenta1.getNombre());
        System.out.printf("El nombre de la cuenta2 es: %s%n", cuenta2.getNombre());
        // Uso otro proyecto para la siguiente parte
    }
    
}
