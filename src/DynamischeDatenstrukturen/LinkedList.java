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
            it = it.getNext();
        }
    }

    public void setObject(Object o) {
        if(hasAccess() && o != null) {
            it.setItem(o);
        }
    }

    public Object getObject() {
        if(hasAccess()) {
            return it.getItem();
        }
        return null;
    }

    public void toFirst() {
        if(!isEmpty()) {
            it = first;
        }
    }

    public void toLast() {
        if(!isEmpty()) {
            it = last;
        }
    }

    public void insert(Object o) {
        if(o != null) {
            if(isEmpty()) {
                first = last = new Box(o);
            }else if(first == it){
                Box tmp = new Box(o);
                first = tmp;
                first.setNext(it);
            }else if(hasAccess()) {
                Box akt = first;
                while(akt.getNext() != it) {
                    akt = akt.getNext();
                }
                Box tmp = new Box(o);
                tmp.setNext(it);
                akt.setNext(tmp);
            }
        }
    }
    public void remove(LinkedList pList) {
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
