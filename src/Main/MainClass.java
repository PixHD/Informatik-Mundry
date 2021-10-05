package Main;

import OwnCollection.Queue;
import PaulCollection.StackAL;

public class MainClass {


    public static void main(String[] args) throws Exception {
        Queue stapel = new Queue(32);
        stapel.enqueue(new Karte(1, "7", "Kreuz", "schwarz"));
        stapel.enqueue(new Karte(2, "7", "Pik", "schwarz"));
        stapel.enqueue(new Karte(3, "7", "Herz", "rot"));
        stapel.enqueue(new Karte(4, "7", "Karo", "rot"));

        stapel.enqueue(new Karte(5, "8", "Kreuz", "schwarz"));
        stapel.enqueue(new Karte(6, "8", "Pik", "schwarz"));
        stapel.enqueue(new Karte(7, "8", "Herz", "rot"));
        stapel.enqueue(new Karte(8, "8", "Karo", "rot"));

        stapel.enqueue(new Karte(9, "9", "Kreuz", "schwarz"));
        stapel.enqueue(new Karte(10, "9", "Pik", "schwarz"));
        stapel.enqueue(new Karte(11, "9", "Herz", "rot"));
        stapel.enqueue(new Karte(12, "9", "Karo", "rot"));

        stapel.enqueue(new Karte(13, "10", "Kreuz", "schwarz"));
        stapel.enqueue(new Karte(14, "10", "Pik", "schwarz"));
        stapel.enqueue(new Karte(15, "10", "Herz", "rot"));
        stapel.enqueue(new Karte(16, "10", "Karo", "rot"));

        stapel.enqueue(new Karte(17, "B", "Kreuz", "schwarz"));
        stapel.enqueue(new Karte(18, "B", "Pik", "schwarz"));
        stapel.enqueue(new Karte(19, "B", "Herz", "rot"));
        stapel.enqueue(new Karte(20, "B", "Karo", "rot"));

        stapel.enqueue(new Karte(21, "D", "Kreuz", "schwarz"));
        stapel.enqueue(new Karte(22, "D", "Pik", "schwarz"));
        stapel.enqueue(new Karte(23, "D", "Herz", "rot"));
        stapel.enqueue(new Karte(24, "D", "Karo", "rot"));

        stapel.enqueue(new Karte(25, "K", "Kreuz", "schwarz"));
        stapel.enqueue(new Karte(26, "K", "Pik", "schwarz"));
        stapel.enqueue(new Karte(27, "K", "Herz", "rot"));
        stapel.enqueue(new Karte(28, "K", "Karo", "rot"));

        stapel.enqueue(new Karte(29, "A", "Kreuz", "schwarz"));
        stapel.enqueue(new Karte(30, "A", "Pik", "schwarz"));
        stapel.enqueue(new Karte(31, "A", "Herz", "rot"));
        stapel.enqueue(new Karte(32, "A", "Karo", "rot"));


        stapel.printArray();
    }
}
