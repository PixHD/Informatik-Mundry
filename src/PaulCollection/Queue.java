package PaulCollection;

public class Queue {
    private int front, tail, count;

    private Object[] queue;

    public Queue() {
        front=tail=count=0;
        queue = new Object[10];
    }

    public Queue(int length) {
        front=tail=count=0;
        queue = new Object[length];
    }

    public void enqueue(Object o) {

    }

    public void dequeue() {

    }

    public boolean isEmpty() {

    }

    public Object front() {

    }
}
