/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

/**
 *
 * @author CH
 */
public class operacion {
    int matriz_r[][];
    
    public void suma(int matriz_A[][],int matriz_B[][]){
        //mostrando en pantalla mtriz a,b y realizando el calculo de la matriz resultante
        System.out.println("Matriz A        Matriz B      Matriz Resultante");
      
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print("|"+matriz_A[i][j]+"|");
            }
            if (i==1){
                System.out.print("  + ");
                System.out.print("  ");
            }
            if (i!=1){
            System.out.print("      ");    
            }
            
            for(int j=0;j<3;j++){
                System.out.print("|"+matriz_B[i][j]+"|");
            }

            if (i==1){
                System.out.print("  = ");
                System.out.print("  ");
            }

            if (i!=1){
            System.out.print("      ");    
            }

            for(int j=0;j<3;j++){
                matriz_r[i][j]= matriz_A[i][j]+matriz_B[i][j];
                System.out.print("|"+matriz_r[i][j]+"|");
            }
            System.out.println("\n");
        }
    }
    public void resta(){
        
    }
    
}
