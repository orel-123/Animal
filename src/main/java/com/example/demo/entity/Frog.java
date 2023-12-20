package com.example.demo.entity;

public class Frog extends Animal implements Land, Water {

    private final int numberOfLegs;

    public Frog() {
        super(false, false);
        this.numberOfLegs = 4;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }


    public Boolean HasGills() {
        // Check if a condition exists
        return true;
    }

    public Boolean HasLaysEggs() {
      //Check if a condition exists
        return true;
    }

    @Override
    public void sayHello() {
        System.out.println("say hello- sing \"quack quack quack\"");
    }

    @Override
    public void moodHappy() {
       System.out.println("mood happy sing \"quack quack quack\"");
    }


    @Override
    public void moodScare() {
       System.out.println("mood scare plop into the water");

    }
}
