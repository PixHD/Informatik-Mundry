package Main;

import java.util.Locale;

public class Karte implements Comparable<Karte> {
    private String wert;
    private int wertigkeit;
    private String symbol;
    private String farbe;

    //Constructor für die Karte
    public Karte(int wertigkeit,String wert, String symbol, String farbe) {
        this.wertigkeit = wertigkeit;
        this.wert = wert;
        this.symbol = symbol.toLowerCase(Locale.ROOT);
        this.farbe = farbe;
    }


    //Vergleicht eine Karte mit einer Anderen
    @Override
    public int compareTo(Karte k) {
        return this.wertigkeit - k.wertigkeit;
    }


    //Wandelt die Karte in einen String um
    public String toString() {
        return symbol + " " + wert;
    }
}
