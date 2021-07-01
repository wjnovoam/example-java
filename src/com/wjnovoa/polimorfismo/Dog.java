package com.wjnovoa.polimorfismo;

public class Dog extends Animal {
    //APLICANDO POLIMORFISMO

    @Override
    public void eat(){
        System.out.println("The dog is eating");
    }

    @Override
    public void sleep(){
        System.out.println("The dog is sleeping");
    }
}
