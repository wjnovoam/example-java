package com.wjnovoa.enums;

public class Enums {

    //enum -> NOS PERMITE REPRESENTAR UN CONJUNTO DE CONSTANTES, QUE NO VAN A CAMBIAR EN EL PROGRAMA

    //Las enum para una mejor practica es mejor tenerla en su archivo independiente

    /*enum Level {
        EASY,
        NORMAL,
        HARD
    }*/

    /*public static void main(String[] args) {
        //Retornar un atributo del enum level
        System.out.println("Retornar un solo atributo");
        Level level = Level.EASY;
        System.out.println(level);

        //Retornar todos los values del enum level
        System.out.println("Retornar todos los atributos");
        Level [] allLevels = Level.values();
        for (Level lev: allLevels) {
            System.out.println(lev);
        }
        //otro ejemplo con switch
        Level level1 = Level.HARD;
        switch (level1){
            case EASY:
                System.out.println("El nivel facil");
                break;
            case HARD:
                System.out.println("El nivel dificil");
                break;
            case NORMAL:
                System.out.println("El nivel normal");
                break;
        }
    }*/
}
