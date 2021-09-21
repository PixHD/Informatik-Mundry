package OwnCollection;

public class Queue {

    public int front;
    public int tail;
    public int count;
    public Object[] queue;

    public Queue() {
        front=tail=count=0;
        queue = new Object[10];
    }

    public Queue(int anzahl) {
        front=tail=count=0;
        queue = new Object[anzahl];
    }

    public void enqueue(Object o) {
        queue[tail] = o;
        tail++;
        count++;
    }

    public void dequeue() {
        if(!isEmpty()) {
            if(front==queue.length-1) {
                front=0;
            }else {
                front++;
            }
            count--;
            tail= (tail+1)%count;
        }
    }

    public boolean isEmpty() {
        return count<=0;
    }

    public Object front() {
        if(!isEmpty()) {
            return queue[front];
        }else {
            return null;
        }
    }
}