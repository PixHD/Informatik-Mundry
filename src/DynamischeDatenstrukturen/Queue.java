package DynamischeDatenstrukturen;

public class Queue {

    private Box front;

    public Queue(){
        front =  null;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void enqueue(Object e) {
        if(isEmpty()) {
            //Fall 1: Queue ist Leer
            front = new Box(e, null);
        }else {
            //Fall 2: Queue enthält mind. 1 Element
            Box tmp = front;
            //While Schleife um ans Ende der Queue zu gelangen.
            while(tmp.getNext() != null) {
                tmp = tmp.getNext();
            }
            tmp.setNext(new Box(e, null));
        }
    }

    public void dequeue() {
        if(!isEmpty()) {
            //Fall 1: Liste ist nicht Leer
            front = front.getNext();
        }else {
            //Fall 2: Liste ist bereits leer
           return;
        }
    }

    public Object front() {
        if(isEmpty()) {
            return null;
        }else {
            return front.getItem();
        }

    }
}
