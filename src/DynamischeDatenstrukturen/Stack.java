package DynamischeDatenstrukturen;

public class Stack {

    private Box top;

    public Stack() {
        top = null;
    }

    public void push(Object e) {
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

    public Object top() {
        if(!isEmpty()) {
            return top.getItem();
        }else {
            return null;
        }
    }
    public boolean isEmpty() {
        return top == null;
    }
}
