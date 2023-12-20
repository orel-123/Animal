package com.example.demo.entity;

  public class Dog extends Animal implements Land {

     private final int numberOfLegs;

     public Dog(){
         super(true,true);
         this.numberOfLegs=4;
     }

     public int getNumberOfLegs() { return numberOfLegs; }

     @Override
     public void sayHello() {
         System.out.println("The dog greet people by wagging his tail");
     }
     @Override
     public void moodHappy() {
         System.out.println("mood happy- bark loudly");
     }

     @Override
     public void moodScare() {
         System.out.println("mood scare- make a whooping sound");
     }
 }

