package DynamischeDatenstrukturen;

public class Box {
    private Object item;
    private Box next;
    private Box prev;

    public Box(Object e) {
        this.item = e;
        this.next = null;
        this.prev = null;
    }

    public Box(Object item, Box next, Box prev) {
        this.item = item;
        this.next = next;
        this.prev = prev;
    }

    public Box(Object e, Box n) {
        this.item = e;
        this.next = n;
    }

    public void setPrev(Box prev) {
        this.prev = prev;
    }

    public Box getPrev() {
        return this.prev;
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
