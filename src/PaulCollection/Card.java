package PaulCollection;

public class Card implements Comparable<Card> {

    private int value;
    private String symbol, color, wert;


    public Card(int value, String wert, String symbol, String color) {
        this.value = value;
        this.wert = wert;
        this.symbol = symbol;
        this.color = color;
    }

    @Override
    public int compareTo(Card a) {
        return this.getValue() - a.getValue();
    }


    public int getValue() {
        return this.value;
    }
}
