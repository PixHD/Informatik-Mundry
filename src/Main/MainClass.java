package Main;

import OwnCollection.Queue;

public class MainClass {


    public static void main(String[] args) {
        Queue q = new Queue(9);
        q.enqueue("1");
        q.enqueue("2");
        q.enqueue("3");
        q.enqueue("4");
        q.enqueue("5");
        q.enqueue("6");
        q.enqueue("7");
        q.enqueue("8");
        q.enqueue("9");

        for (int i = 0; i < q.queue.length; i++) {
            System.out.print(q.queue[i] + ";");
        }
        System.out.println();

        for (int i = 0; i < 8; i++) {
            q.dequeue();
        }

        q.enqueue("A");
        q.enqueue("B");
        q.enqueue("C");
        q.enqueue("D");
        q.enqueue("E");
        q.enqueue("F");
        q.enqueue("G");
        q.enqueue("H");
        q.enqueue("I");

        System.out.println();
        for (int i = 0; i < q.queue.length; i++) {
            System.out.print(q.queue[i] + ";");
        }

        System.out.println("Front: " + q.front());

        for (int i = 0; i < 8; i++) {
            q.dequeue();
        }

        System.out.println("Front: " + q.front());


    }
}
