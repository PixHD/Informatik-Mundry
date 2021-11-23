package DynamischeDatenstrukturen;

public class Stack {

    private Box top;

    public Stack() {
        top = null;
    }

    public void push(Box e) {
        if(!isEmpty()) {
            Box tmp = new Box(e);
            tmp.setNext(top);
            top = tmp;
        }else {
            top = new Box(e);
        }
    }

    public void pop() {
        if(!isEmpty()) {
            top = top.getNext();
        }else {
            return;
        }
    }

    public Box top() {
        if(!isEmpty()) {
            return top;
        }else {
            return null;
        }
    }
    public boolean isEmpty() {
        return top == null;
    }
}
