package DynamischeDatenstrukturen;

public class Box {
    private Object item;
    private Box next;

    public Box(Object e) {
        this.item = e;
        this.next = null;
    }

    public Box(Object e, Box n) {
        this.item = e;
        this.next = n;
    }

    public void setItem(Object e) {
        this.item = e;
    }

    public void setNext(Box n) {
        this.next = n;
    }

    public Object getItem() {
        return this.item;
    }

    public Box getNext() {
        return this.next;
    }
}
