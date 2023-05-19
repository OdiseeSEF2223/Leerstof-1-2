package org.example;

public class Main {
    public static void main(String[] args) {
        SoundProducer[] sps = new SoundProducer[]{
            //    new SoundProducer("Jens"),
                new Human("Mens"),
                new Kat("Kat"),
                new Hond("Hond"),
        };

        for(SoundProducer sp: sps){
            sp.makeSound();
        }
    }
}