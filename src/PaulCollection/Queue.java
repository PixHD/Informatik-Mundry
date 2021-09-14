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
        this.queue[front + 1] = o;
        this.front++;
        this.count++;

    }

    public void dequeue() {
        this.front--;
        this.count--;
    }

    public boolean isEmpty() {
        return false;
    }

    public Object front() {
        if(!isEmpty()) {
            return queue[front];
        }
    }
}
