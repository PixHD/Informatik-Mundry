package Main;

import java.util.Locale;

public class Karte implements Comparable<Karte> {
    private String wert;
    private int wertigkeit;
    private String symbol;
    private String farbe;
    public Karte(int wertigkeit,String wert, String symbol, String farbe) {
        this.wertigkeit = wertigkeit;
        this.wert = wert;
        this.symbol = symbol.toLowerCase(Locale.ROOT);
        this.farbe = farbe;
    }

    @Override
    public int compareTo(Karte k) {
        return this.wertigkeit - k.wertigkeit;
    }

    public String toString() {
        return symbol + " " + wert;
    }
}
