package org.example;

/**
 * Deze klasse stelt een huisdier-steen voor met een naam en of de steen gelukkig is
 * @author Jens Baetens
 * @version 0.1
 */
public class PetRock {

    private String name;
    private boolean happy = false;

    /**
     * Constructor voor het aanmaken van het object met een naam, standaard geluk is false
     * @param name Naam van de steen
     */
    public PetRock(String name) {
        this.name = name;
    }

    /**
     * Getter voor de naam
     * @return de naam
     */
    public String getName() {
        return name;
    }

    /**
     * Controleer of de steen gelukkig is
     * @return
     */
    public boolean isHappy(){
        return false;
    }

    /**
     * Speel met de steen waardoor hij gelukkig wordt
     */
    public void play(){
        happy = true;
    }
}
