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
    public void enqueue(Object o) throws Exception {
        if(count< queue.length) {
            queue[tail] = o;
            if(queue.length == count) {
                tail = 0;
            }else {
                tail++;
            }
            //tail = (tail+1)%queue.length;
            count++;
        }else {
            throw new Exception("The Queue is full");
        }
    }

    public void dequeue() throws Exception {
        if(!isEmpty()) {
            front = (front+1)%queue.length;
            count--;
        }else {
            throw new Exception("The Queue is Empty");
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

    public void printArray() {
        if(!isEmpty()) {
            for (Object o : queue) {
                System.out.print(o + ";");
            }
        }else {
            System.out.println("The Array is empty");
        }
    }
}