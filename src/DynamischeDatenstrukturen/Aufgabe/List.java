package DynamischeDatenstrukturen.Aufgabe;

import DynamischeDatenstrukturen.Box;

public class List {

    private Box it = null;
    private Box first = null;
    private Box last = null;


    public List(Object o) {
        this.first = new Box(o, null);
        this.last = first;
        this.it = null;
    }

    public List() {
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

    public void setObject(String o) {
        if(hasAccess() && o != null) {
            it.setItem(o);
        }
    }

    public Box getObject() {
        if(hasAccess()) {
            return it;
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

    public void insert(Object job) {
        if(job != null) {
            if(isEmpty()) {
                first = last = new Box(job, null);
            }else if(first == it){
                first = new Box(job, null);
                first.setNext(it);
            }else if(hasAccess()) {
                Box akt = first;
                while(akt.getNext() != it) {
                    akt = akt.getNext();
                }
                Box tmp = new Box(job, null);
                tmp.setNext(it);
                akt.setNext(tmp);
            }
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

    public void append(Object prodJob) {
        if(prodJob != null) {
            if(isEmpty()) {
                this.first = new Box(prodJob, null);
                this.last = new Box(prodJob, null);
            } else {
                toLast();
                this.it.setNext(new Box(prodJob, null));
                this.last = new Box(prodJob, null);
            }
        }
    }














}
