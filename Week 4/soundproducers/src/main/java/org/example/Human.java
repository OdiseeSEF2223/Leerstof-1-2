package org.example;

public class Human extends SoundProducer{
    public Human(String naam) {
        super(naam);
    }

    @Override
    public void makeSound(){
        System.out.println("Ik ben " + naam);
    }
}
