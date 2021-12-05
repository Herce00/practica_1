/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import java.util.Scanner;

/**
 *
 * @author CH
 */
public class Menu_principal {
    private int opcion;
    
    public void menu_principal(){
        String cadena = ("Bienvenido A Mi Programa \n"
                + "A Contiuacion Encontraras El Menu Principal \n"
                + "1. Cargar Matrices \n"
                + "2. Reporte \n"
                + "Elige El Numero De Tu Opcion A Elejir: ");
        System.out.println(cadena);
        
    }
    public void menu_segundario(){
        System.out.println("\nSe Encuentra En Operaciones Con matrices \n"
                + "Que Operacion Desea Realizar? \n"
                + "1. Sumar matrices \n"
                + "2. Restar matrices\n"
                + "3. Multiplicar matrices\n"
                + "4. Dividir matrices\n"
                + "5. Transpuesta de matriz\n"
                + "6. Matriz Inversa\n"
                + "7. Matriz Potencia de una matriz\n"
                + "Elige El Numero De Tu Opcion A Elejir: ");
        
    }
}
