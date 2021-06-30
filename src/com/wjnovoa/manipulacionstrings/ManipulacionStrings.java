package com.wjnovoa.manipulacionstrings;

import java.util.Locale;

public class ManipulacionStrings {
    public static void main(String[] args) {
        //METODOS DE INDEXACION
        String s1 = "Hola mundo";
        int longitud = s1.length();
        System.out.println("Longitud: "+longitud);
        char caracter = s1.charAt(2);
        System.out.println("Caracter: "+caracter);
        int index = s1.indexOf("l");
        System.out.println("Index: "+index);
        String s2 = s1.substring(0,4);
        System.out.println("SubString: "+s2);
        String s3 = s1.substring(5);
        System.out.println("SubString: "+s3);

        //METODOS DE MODIFICACION
        String concatenacion = s1.concat(" Bienvenidos a este mundo");
        System.out.println("Concat: "+concatenacion);
        String mayus = s1.toUpperCase();
        System.out.println("Mayuscula: "+mayus);
        String minus = s1.toLowerCase();
        System.out.println("Minuscula: "+minus);
        String replac = s1.replace(" ", "_");
        System.out.println("replace: "+replac);

        //EJEMPLO
        System.out.println(
                s1.concat("Bienvenidos o Cof").toUpperCase().replace(" ", "_")
        );

        //METODOS DE INSPECCION
        String s4 = "Hola mundo";
        System.out.println(s4.isEmpty());
        String s5 = "";
        System.out.println(s5.isEmpty());
        boolean contain = s4.contains("ol");
        System.out.println("Contains: "+contain);
        boolean equal = s4.equals("Hola mundo");
        System.out.println("Equals: "+ equal);
    }
}
