package DynamischeDatenstrukturen;

public class Stack {

    private Box top;

    public Stack() {
        top = null;
    }

    public void push(Object e) {
        if(!isEmpty()) {
            top = new Box(e,top);
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
