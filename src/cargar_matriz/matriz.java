/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cargar_matriz;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;
public class matriz {
    public void matriz () throws IOException{
        
        
        Scanner opcion2 = new Scanner(System.in);
        String ruta = opcion2.nextLine();
        File archivo = null;
        FileReader leer = null;
        BufferedReader lector =null;
        try{
            archivo = new File(ruta);
            leer = new FileReader(archivo);
            lector = new BufferedReader(leer);
        }catch(Exception e){
            e.printStackTrace();
        }
        String linea;
        while((linea=lector.readLine())!=null)
            System.out.println(linea);
    }
}
