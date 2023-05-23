package org.example;

public class Main {

    /* Dit is slechte code, best elke klasse apart plaatsen*/
    public class MedeWerker{};
    public class BetaaldeMedewerker extends MedeWerker{}
    public class Bediende extends BetaaldeMedewerker{}

    public static void main(String[] args) {

        System.out.println("Hello world!");

        int getal = 305;
        double getalDouble = getal; // implicit conversion - automatisch
        byte getalByte = (byte)getal; // casting - explicit conversion

        System.out.println(getal);
        System.out.println(getalDouble);
        System.out.println(getalByte);

        Main m = new Main();
        m.test();

        m.sum(5, 10);
        m.sum(5.0, 10.0);
        m.sum(5, 10.0);
    }

    public void test(){
        MedeWerker m = new Bediende();
        if(m instanceof Bediende) {
            Bediende b = (Bediende) m;
            System.out.println("Gelukt");
        } else if (m.getClass() == BetaaldeMedewerker.class){

        }
        else {
            System.out.println("Niet gelukt");
        }
    }

    // polymorfisme
    public void sum(int a, int b){
        System.out.println("Dit is de functie van int");
    }

    public void sum(double a, double b){
        System.out.println("Dit is de functie van double");
    }
}