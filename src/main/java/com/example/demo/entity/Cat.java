package com.example.demo.entity;

public class Cat extends Animal implements Land{

    private final int numberOfLegs;

    public Cat() {
        super(true, true);
        this.numberOfLegs = 4;
    }

    public int getNumberOfLegs() { return numberOfLegs; }

    @Override
    public void sayHello() {
        System.out.println("say hello- make a meow~ sound");
    }

    @Override
    public void moodHappy() {
        System.out.println("mood happy- make a purr sound");
    }

    @Override
    public void moodScare() {
        System.out.println("mood scare- a hiss sound");
    }

}
