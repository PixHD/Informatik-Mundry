package OwnCollection;

public class Queue {

    private int front;
    private int tail;
    private int count;
    private Object[] queue;

    public Queue() {
        front=tail=count=0;
        queue = new Object[10];
    }

    public Queue(int anzahl) {
        front=tail=count=0;
        queue = new Object[anzahl];
    }

    public void enqueue(Object o) {
        tail++;
        queue[tail] = o;
        count++;
    }

    public void dequeue() {
        if(!isEmpty()) {
            front--;
            count--;
            tail= (tail+1)%count;
        }
    }

    public boolean isEmpty() {
        return count==0;
    }

    public Object front() {
        if(!isEmpty()) {
            return queue[front];
        }else {
            return null;
        }
    }
}