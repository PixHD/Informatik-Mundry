package Aufgaben.Seite78;

public class Kugel {
    private int weight;
    private Farbe farbe;

    public Kugel(Farbe farbe) {
        this.farbe = farbe;
        switch(farbe) {
            case BLAU -> weight = 10;
            case GELB -> weight = 8;
            case ROSA -> weight = 6;
        }
    }

    public Farbe getFarbe() {
        return farbe;
    }

    public int getWeight() {
        return weight;
    }
}
