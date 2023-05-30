package org.example;

public class Human implements ISoundProducer{
    @Override
    public void makeSound() {
        System.out.println("Hallo ik ben een mens");
    }
}
