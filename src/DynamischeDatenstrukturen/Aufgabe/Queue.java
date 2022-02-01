package DynamischeDatenstrukturen.Aufgabe;

public class Queue {

    public Box front;
    public Box last;

    public Queue(Object o) {
        front = new Box(null, o);
        last = front;
    }

    public Queue() {
        front = null;
        last = null;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void enqueue(Object pObject) {
        if(pObject != null) {
            if(isEmpty()) {
                front = new Box(null, pObject);
                last = front;
            }else {
                last.setNext(new Box(null, pObject));
            }
        }
    }

    public void dequeue() {
        if(!isEmpty()) {
            front = front.getNext();
        }
    }

    public Object front() {
        if(!isEmpty()){
            return front.getContent();
        }else {
            return null;
        }
    }
}
