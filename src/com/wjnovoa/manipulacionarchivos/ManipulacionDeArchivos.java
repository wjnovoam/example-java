package com.wjnovoa.manipulacionarchivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ManipulacionDeArchivos {
    /*public static void main(String[] args) {
        //Crear intancia de nuestro objeto file
        File folder = new File("folder");
        File file = new File("miPrimerArchivo.txt");

        try{
            //CREAR UNA CARPETA
            boolean folderCreate = folder.mkdir();
            //CREAR UN ARCHIVO
            boolean fileCreated = file.createNewFile();
            //meter datos a un archivo
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("aprendiendo a manejar archivos");
            fileWriter.close();

            if(fileCreated && folderCreate){
                System.out.println("El archiivo se creo correctamente");
            }else{
                System.out.println("El archivo ya existe");
            }
        }catch (IOException e){
            System.out.println("Excepcion al crear el archivo "+e);
        }

        //LEER INFORMACION
        /*try{
            Scanner sc = new Scanner(file);
            //Leer linea por linea con while
            while(sc.hasNextLine()){
                String data = sc.nextLine();
                System.out.println(data);
            }

        }catch (FileNotFoundException e){
            System.out.println("Exepcion al abrir el archivo "+e);
        }

        //BORRAR ARCHIVOS
        if(file.delete()){
            System.out.println("El archivo se borro correctamente");
        }else{
            System.out.println("No se pudo borrar el archivo");
        }


    }*/
}
