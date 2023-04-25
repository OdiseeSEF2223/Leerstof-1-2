package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        System.out.println("Hello world!");

        for(int i =0; i<5; i++){
            System.out.println(i); // type sout en enter om dit iets sneller te doen
        }

        double komma = 0.5;
        char c = 'a';
        boolean truefalse = true;

        //input
        Scanner in = new Scanner(System.in);
        System.out.println("Je gaf in" + in.nextDouble()); // vraag een getal aan de gebruiker
        // in.nextLine() // vraag tekst aan de gebruiker
        */

        // vraag een getal
        Scanner in = new Scanner(System.in);
        System.out.println("Geef een getal in:");
        //double getal = in.nextDouble();
        String tekst = in.nextLine();
        double getal = Double.parseDouble(tekst);

        // bereken kwadraat en vierkantswortel
        MathUtils utils = new MathUtils();
        double kwadraat = MathUtils.kwadraat(getal);
        double vierkantswortel = MathUtils.vierkantswortel(getal);
        double kwadraat2 = utils.kwadraat2(getal);

        // toon de resultaten
        System.out.println("Het kwadraat is " + kwadraat);
        System.out.println("De vierkantswortel is " + vierkantswortel);
    }
}