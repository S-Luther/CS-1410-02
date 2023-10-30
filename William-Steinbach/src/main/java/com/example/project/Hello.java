package com.example.project;
public class Hello {
    public static void main(String[] args){

        Cat Cake = new Cat("Cake");

        Dog Fido = new Dog("Fido");

        Parrot Blue = new Parrot("Blue");

        Cat.feed(cake);
        Dog.walk(fido);
        Parrot.talk(blue);
    }
}