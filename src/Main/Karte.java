package Main;

import java.util.Locale;

public class Karte implements Comparable<Karte> {
    private int wert;
    private String symbol;
    private String farbe;

    public Karte(int wert, String symbol) {
        this.wert = wert;
        this.symbol = symbol.toLowerCase(Locale.ROOT);
        if(this.symbol.equalsIgnoreCase("pic") || this.symbol.equalsIgnoreCase("kreuz")) {
            farbe = "schwarz";
        }else {
            farbe = "rot" ;
        }
    }

    @Override
    public int compareTo(Karte k) {
        return this.wert - k.wert;
    }
}
