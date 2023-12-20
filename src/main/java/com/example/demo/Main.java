package com.example.demo;

import com.example.demo.entity.Animal;
import com.example.demo.entity.Cat;
import com.example.demo.entity.Dog;
import com.example.demo.entity.Frog;

public class Main {
    public static void main(String[] args) {
        Animal dog= new Dog();
        Cat cat= new Cat();
        Frog frog= new Frog();

        System.out.println("dog-");
        System.out.println("mammals-"+ dog.isMammals());
        System.out.println("carnivorous-"+ dog.isCarnivorous());
        dog.sayHello();
        dog.moodHappy();
        dog.moodScare();
        System.out.print("\n");
        System.out.println("cat-");
        System.out.println("mammals-"+ cat.isMammals());
        System.out.println("carnivorous-"+ cat.isCarnivorous());
        cat.sayHello();
        cat.moodHappy();
        cat.moodScare();
        System.out.println("number of legs- "+ cat.getNumberOfLegs());
        System.out.print("\n");
        System.out.println("frog-");
        System.out.println("mammals-"+ frog.isMammals());
        System.out.println("carnivorous-"+ frog.isCarnivorous());
        frog.sayHello();
        frog.moodHappy();
        frog.moodScare();
        System.out.println("number of legs- "+ frog.getNumberOfLegs());
    }
}
