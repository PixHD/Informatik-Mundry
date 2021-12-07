package DynamischeDatenstrukturen;

public class LinkedList {

    private Box it = null;
    private Box first = null;
    private Box last = null;


    public LinkedList(Object o) {
        this.first = new Box(o);
        this.last = first;
        this.it = first;
    }
    public LinkedList() {
        //Nothing happened
    }

    public boolean isEmpty() {
        return first == null;
    }

    public boolean hasAccess() {
        return it != null;
    }

    public void next() {
        if(hasAccess()) {
            if(!isEmpty()) {
                it = it.getNext();
            }
        }
    }

    public void setObject(Object o) {
        it.setItem(o);
    }

    public Box getObject() {
        return it;
    }

    public void toFirst() {
        it = first;
    }

    public void toLast() {
        it = last;
    }

    public void insert(Object o) {
        if(isEmpty()) { //Fall 1: Liste ist Leer
            first = new Box(o);
            last = first;
        }else { //Fall 2: Liste hat Objekte
            if(!hasAccess()) return;//Fall 3: Es gibt kein Akt. Objekt
            Box tmp = first;
            while(tmp.getNext() != it) {
                tmp = tmp.getNext();
            }
            tmp.setNext(new Box(o, it));
        }
    }

    public void remove() {
        if(isEmpty()) return; //Fall 1: Liste ist Leer
        if(hasAccess()) {
            if(it.getNext() == null){
                //Fall 3: Akt. Objet ist Letztes in der Liste
                Box tmp = first;
                while(tmp.getNext() != it) {
                    tmp = tmp.getNext();
                }
                tmp.setNext(null);
                last = tmp;
                it = null;
            }else {
                //Fall 4: Es gibt ein Akt. Objekt, welches nicht das Letzte ist.
                Box tmp = first;
                Box afterIt = it.getNext();
                while(tmp.getNext() != it) {
                    tmp = tmp.getNext();
                }
                tmp.setNext(afterIt);
                it = afterIt;
            }
        }else {
            return; //Fall 2: Es gibt kein Akt. Objekt
        }


    }












}
