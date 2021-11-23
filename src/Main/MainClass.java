package Main;

import DynamischeDatenstrukturen.Queue;
import DynamischeDatenstrukturen.Stack;
import PaulCollection.StackAL;
import java.util.Random;

public class MainClass {

    public static void main(String[] args) {
        /*Queue q = new Queue();
        q.enqueue("1");
        q.enqueue("2");
        q.enqueue("3");
        System.out.println("Front: " + q.front());
        q.dequeue();
        System.out.println("Front: " + q.front());
        q.dequeue();
        q.dequeue();
        q.dequeue();
        System.out.println("Front: " + q.front());*/

        Stack s = new Stack();
        s.push("1");
        s.push("2");
        s.push("3");
        s.pop();
        s.pop();
        System.out.println(s.top().getItem());


    }




























    /*private static Queue ausgangsStapel;
    private static Queue[] spielerStapel;


    public static void main(String[] args) throws Exception {
        ausgangsStapel = new Queue(32);
        spielerStapel = new Queue[2];
        spielerStapel[0] = new Queue(32);
        spielerStapel[1] = new Queue(32);


        ausgangsStapel.enqueue(new Karte(1, "7", "Kreuz", "schwarz"));
        ausgangsStapel.enqueue(new Karte(2, "7", "Pik", "schwarz"));
        ausgangsStapel.enqueue(new Karte(3, "7", "Herz", "rot"));
        ausgangsStapel.enqueue(new Karte(4, "7", "Karo", "rot"));

        ausgangsStapel.enqueue(new Karte(5, "8", "Kreuz", "schwarz"));
        ausgangsStapel.enqueue(new Karte(6, "8", "Pik", "schwarz"));
        ausgangsStapel.enqueue(new Karte(7, "8", "Herz", "rot"));
        ausgangsStapel.enqueue(new Karte(8, "8", "Karo", "rot"));

        ausgangsStapel.enqueue(new Karte(9, "9", "Kreuz", "schwarz"));
        ausgangsStapel.enqueue(new Karte(10, "9", "Pik", "schwarz"));
        ausgangsStapel.enqueue(new Karte(11, "9", "Herz", "rot"));
        ausgangsStapel.enqueue(new Karte(12, "9", "Karo", "rot"));

        ausgangsStapel.enqueue(new Karte(13, "10", "Kreuz", "schwarz"));
        ausgangsStapel.enqueue(new Karte(14, "10", "Pik", "schwarz"));
        ausgangsStapel.enqueue(new Karte(15, "10", "Herz", "rot"));
        ausgangsStapel.enqueue(new Karte(16, "10", "Karo", "rot"));

        ausgangsStapel.enqueue(new Karte(17, "B", "Kreuz", "schwarz"));
        ausgangsStapel.enqueue(new Karte(18, "B", "Pik", "schwarz"));
        ausgangsStapel.enqueue(new Karte(19, "B", "Herz", "rot"));
        ausgangsStapel.enqueue(new Karte(20, "B", "Karo", "rot"));

        ausgangsStapel.enqueue(new Karte(21, "D", "Kreuz", "schwarz"));
        ausgangsStapel.enqueue(new Karte(22, "D", "Pik", "schwarz"));
        ausgangsStapel.enqueue(new Karte(23, "D", "Herz", "rot"));
        ausgangsStapel.enqueue(new Karte(24, "D", "Karo", "rot"));

        ausgangsStapel.enqueue(new Karte(25, "K", "Kreuz", "schwarz"));
        ausgangsStapel.enqueue(new Karte(26, "K", "Pik", "schwarz"));
        ausgangsStapel.enqueue(new Karte(27, "K", "Herz", "rot"));
        ausgangsStapel.enqueue(new Karte(28, "K", "Karo", "rot"));

        ausgangsStapel.enqueue(new Karte(29, "A", "Kreuz", "schwarz"));
        ausgangsStapel.enqueue(new Karte(30, "A", "Pik", "schwarz"));
        ausgangsStapel.enqueue(new Karte(31, "A", "Herz", "rot"));
        ausgangsStapel.enqueue(new Karte(32, "A", "Karo", "rot"));

        spielStapelErstellen();
        alleKarten(spielerStapel[1]);
    }

    public static void spielStapelErstellen() {
        Random zufall = new Random();
        while(!ausgangsStapel.isEmpty()) {
            if(zufall.nextInt(3) == 1) {
                try {
                    spielerStapel[0].enqueue(ausgangsStapel.front());
                    ausgangsStapel.dequeue();
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }else {
                try {
                    spielerStapel[1].enqueue(ausgangsStapel.front());
                    ausgangsStapel.dequeue();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        }
    }

    public static void alleKarten(Queue stapel) {
        int i = 0;
        while(!stapel.isEmpty()) {
            System.out.println(stapel.front() + " Nr: " + i);
            i++;
            try {
                stapel.dequeue();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }*/
}
