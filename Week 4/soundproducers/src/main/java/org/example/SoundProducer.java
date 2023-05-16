package org.example;

public class SoundProducer {

    protected String naam;

    public SoundProducer(String naam){
        this.naam = naam;
    }

    public void makeSound(){
        System.out.println(naam+ ":\tDit is een generiek geluid");
    }
}
