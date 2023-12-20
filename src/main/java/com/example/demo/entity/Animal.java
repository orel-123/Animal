package com.example.demo.entity;

public abstract class Animal {

    protected boolean mammals; //יונק
    protected boolean carnivorous; //טורף

    //Constructor
    public Animal(boolean mammals, boolean carnivorous) {
        this.mammals = mammals;
        this.carnivorous = carnivorous;
    }

    public abstract void sayHello();

    public abstract void moodHappy();

    public abstract void moodScare();

    public Boolean isMammals() {
        return mammals;
    }

    public void setMammals(Boolean mammals) {
        this.mammals = mammals;
    }

    public Boolean isCarnivorous() {
        return carnivorous;
    }

    public void setCarnivorous(Boolean carnivorous) {
        this.carnivorous = carnivorous;
    }
}