package org.example;

public abstract class SoundProducer {

    protected String naam;

    public SoundProducer(String naam){
        this.naam = naam;
    }

    public abstract void makeSound();
}
