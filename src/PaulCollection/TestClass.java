package PaulCollection;

public class TestClass {

    public static void test() {
        Queue Kartenstapel = new Queue();

        Kartenstapel.enqueue(new Card(7, "7", "Kreuz", "Schwarz"));
        Kartenstapel.enqueue(new Card(7, "7", "Pik", "Schwarz"));
        Kartenstapel.enqueue(new Card(7, "7", "Herz", "Rot"));
        Kartenstapel.enqueue(new Card(7, "7", "Karo", "Rot"));

        Kartenstapel.enqueue(new Card(8, "8", "Kreuz", "Schwarz"));
        Kartenstapel.enqueue(new Card(8, "8", "Pik", "Schwarz"));
        Kartenstapel.enqueue(new Card(8, "8", "Herz", "Rot"));
        Kartenstapel.enqueue(new Card(8, "8", "Karo", "Rot"));

        Kartenstapel.enqueue(new Card(9, "9", "Kreuz", "Schwarz"));
        Kartenstapel.enqueue(new Card(9, "9", "Pik", "Schwarz"));
        Kartenstapel.enqueue(new Card(9, "9", "Herz", "Rot"));
        Kartenstapel.enqueue(new Card(9, "9", "Karo", "Rot"));

        Kartenstapel.enqueue(new Card(10, "10", "Kreuz", "Schwarz"));
        Kartenstapel.enqueue(new Card(10, "10", "Pik", "Schwarz"));
        Kartenstapel.enqueue(new Card(10, "10", "Herz", "Rot"));
        Kartenstapel.enqueue(new Card(10, "10", "Karo", "Rot"));

        Kartenstapel.enqueue(new Card(10, "Bube", "Kreuz", "Schwarz"));
        Kartenstapel.enqueue(new Card(10, "Bube", "Pik", "Schwarz"));
        Kartenstapel.enqueue(new Card(10, "Bube", "Herz", "Rot"));
        Kartenstapel.enqueue(new Card(10, "Bube", "Karo", "Rot"));

        Kartenstapel.enqueue(new Card(10, "Dame", "Kreuz", "Schwarz"));
        Kartenstapel.enqueue(new Card(10, "Dame", "Pik", "Schwarz"));
        Kartenstapel.enqueue(new Card(10, "Dame", "Herz", "Rot"));
        Kartenstapel.enqueue(new Card(10, "Dame", "Karo", "Rot"));

        Kartenstapel.enqueue(new Card(10, "König", "Kreuz", "Schwarz"));
        Kartenstapel.enqueue(new Card(10, "König", "Pik", "Schwarz"));
        Kartenstapel.enqueue(new Card(10, "König", "Herz", "Rot"));
        Kartenstapel.enqueue(new Card(10, "König", "Karo", "Rot"));

        Kartenstapel.enqueue(new Card(11, "Ass", "Kreuz", "Schwarz"));
        Kartenstapel.enqueue(new Card(11, "Ass", "Pik", "Schwarz"));
        Kartenstapel.enqueue(new Card(11, "Ass", "Herz", "Rot"));
        Kartenstapel.enqueue(new Card(11, "Ass", "Karo", "Rot"));
    }

}
