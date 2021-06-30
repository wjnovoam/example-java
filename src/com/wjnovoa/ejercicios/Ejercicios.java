package com.wjnovoa.ejercicios;

import java.util.Random;
import java.util.Scanner;

public class Ejercicios {
    /*public static void main(String[] args) {

        //EJERCICIO DE NOTAS

        float [] calificaciones = new float[5];

        Scanner sc = new Scanner(System.in);

        float suma = 0;
        float promedio = 0;

        for (int i = 0; i < calificaciones.length; i++){
            System.out.println("Ingrese la nota "+ (i+1));
            calificaciones[i] = sc.nextFloat();
            suma = suma + calificaciones[i];
        }

        promedio = suma / calificaciones.length;

        System.out.println("El promedio de las notas es "+promedio);

        //EJERCICIO DE ADIVINAR UN RANDOM

        Random r = new Random();

        int randNum = r.nextInt(11);
        System.out.println(randNum);

        int userNum = -1;
        int intentos = 3;


        while(userNum != randNum){
            System.out.println("Adivina el numero aleatorio entre 0 y 10");
            userNum = sc.nextInt();

            if(userNum != randNum){
                intentos--;
                System.out.println("Fallaste intentos restantes: "+ intentos);
                if (intentos == 0){
                    System.out.println("Perdiste");
                    System.out.println("El numero aleatorio era: "+ randNum);
                    break;
                }
            }else{
                System.out.println("Ganaste!!");
            }
        }


    }*/
}
