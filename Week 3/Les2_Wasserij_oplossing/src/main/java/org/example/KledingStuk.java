package org.example;

/**
 * Deze klasse houdt alle gegevens van kledingsstukken bij
 */
public class KledingStuk {
    private String naam;
    private String type;
    private double gewicht;

    public KledingStuk(String naam, String type, double gewicht) {
        this.naam = naam;
        this.type = type;
        this.gewicht = gewicht;
    }

    public String getNaam() {
        return naam;
    }

    public String getType() {
        return type;
    }

    public double getGewicht() {
        return gewicht;
    }
}
