package DynamischeDatenstrukturen.Aufgabe;

public class Box {

    private Box next;
    private Object content;

    public Box() {
        next = null;
        content = null;
    }

    public Box(Box next, Object content) {
        this.next = next;
        this.content = content;
    }

    public void setNext(Box next) {
        this.next = next;
    }

    public void setContent(Object content) {
        this.content = content;
    }

    public Object getContent() {
        return this.content;
    }

    public Box getNext() {
        return this.next;
    }
}
