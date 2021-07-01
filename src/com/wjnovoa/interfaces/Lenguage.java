package com.wjnovoa.interfaces;

public interface Lenguage {
    //Los metodos que se declaran en una interface por default son publicos
    void sayhi();

    //metodos default - este metodo no puede ser abstracto
    default void sayBye() {
        System.out.println("Bay from interface");
    }
}

