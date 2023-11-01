package com.example.project;

public class Hello {

	public static void main(String[] args) {
        Cat charlie = new Cat("Charlie");
        Dog oliver = new Dog("Oliver");
        Parrot wilbur = new Parrot("Wilbur");

        //Cat Interactions
        charlie.play();
        charlie.feed();
        charlie.nap();
        charlie.observe();

        //Dog Interactions
        oliver.play();
        oliver.feed();
        oliver.nap();
        oliver.observe();

        //Parrot Interactions
        wilbur.talk();
        wilbur.feed();
        wilbur.nap();
        wilbur.observe();
    } 
}
