package be.odisee.oefTijdspanne;

/** Onthoudt een tijdspanne als een aantal minuten */
public class Tijdspanne {
    protected int minuten;
    public Tijdspanne(int minuten) {
        this.minuten = minuten;
    }
    public int getMinuten() {
        return minuten;
    }

    /**
     * Tel 2 tijdspannes bij elkaar op: de eigen tijd plus de tijd van de andere
     * @param andere andere tijdspanne
     */
    public void bijTellen(Tijdspanne andere) {
        minuten += andere.minuten;
    }
}
/** Onthoudt een tijdspanne als een aantal minuten en seconden */
class PreciezeTijdspanne extends Tijdspanne {
    protected int seconden;
    public int getSeconden() {
        return seconden;
    }
    public PreciezeTijdspanne(int minuten, int seconden) {
        super(minuten);
        this.seconden = seconden;
    }

    public void bijTellen(PreciezeTijdspanne andere){
        //this.minuten += andere.minuten;
        super.bijTellen(andere); // deze regel en deze hierboven zijn equivalent
        this.seconden += andere.seconden;
    }

}
