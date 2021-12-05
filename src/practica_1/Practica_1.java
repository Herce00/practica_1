
package practica_1;
import Menu.Menu_principal;
import cargar_matriz.matriz;
import java.io.IOException;
import java.util.Scanner;
import operaciones.operacion;

public class Practica_1 {
    static int opcion;
    static String ruta;
    static int Matriz_A[][],Matriz_B[][];
    
    public static void main(String[] args) throws IOException {
    proceso();    
    }
    
    
    public static void proceso() throws IOException{
        
        //Se creo la estacia del Menu_principal y se carga el metodo menu_principal
        Menu_principal menu = new Menu_principal();
        menu.menu_principal();
        
        //elegir opcion del menu
        Scanner opcion_elegi = new Scanner(System.in);
        opcion = opcion_elegi.nextInt();
        
        if (opcion == 1){
            //Se cargaron las dos matrices
            System.out.println("\n \n"
                    + "Se Encuentra En Cargar Matrices \n"
                    + "Ingrese La Ruta Del Archivo Para Cargar La Matriz A :");
            matriz cargar_matriz = new matriz();
            cargar_matriz.matriz();
            System.out.println("Ingrese La Ruta Del Archivo Para Cargar La Matriz B :");
            cargar_matriz.matriz();
            
            //Se carga el metodo menu_segundario de la estancia menu_principal
            menu.menu_segundario();
            
            //Elegir opcion de operaciones con matrices
            Scanner opcion_elegi2 = new Scanner(System.in);
            opcion = opcion_elegi.nextInt();
            
            //Se creo la estacia de operacion
            operacion operacion_matriz = new operacion();
            switch (opcion){
                case 1:
                    System.out.println("suma");
                    operacion_matriz.suma(Matriz_A, Matriz_B);
                break;
                case 2: 
                    System.out.println("resta");
                break;
                case 3:
                    
                break;
                case 4:
                    
                break;
                case 5: break;
                case 6: break;
                case 7: break;
                default:System.out.println("Esa opcion no esta disponible"); break;
            }
            
        }
    }
}
