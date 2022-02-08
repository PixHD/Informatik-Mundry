package DynamischeDatenstrukturen.Aufgabe;

import DynamischeDatenstrukturen.Box;

public class List {

    private ProdJob it = null;
    private ProdJob first = null;
    private ProdJob last = null;


    public List(String bez, int prio) {
        this.first = new ProdJob(bez, prio, null);
        this.last = first;
        this.it = first;
    }

    public List(ProdJob job) {
        this.first = this.last = this.it = job;
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
            it.setBez(o);
        }
    }

    public ProdJob getObject() {
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

    public void insert(ProdJob job) {
        if(job != null) {
            if(isEmpty()) {
                first = last = job;
            }else if(first == it){
                first = job;
                first.setNext(it);
            }else if(hasAccess()) {
                ProdJob akt = first;
                while(akt.getNext() != it) {
                    akt = akt.getNext();
                }
                ProdJob tmp = job;
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
                ProdJob tmp = first;
                while(tmp.getNext() != it) {
                    tmp = tmp.getNext();
                }
                tmp.setNext(null);
                last = tmp;
                it = null;
            }else {
                //Fall 4: Es gibt ein Akt. Objekt, welches nicht das Letzte ist.
                ProdJob tmp = first;
                ProdJob afterIt = it.getNext();
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

    public void append(ProdJob prodJob) {
        if(prodJob != null) {
            if(isEmpty()) {
                this.first = prodJob;
                this.last = prodJob;
            } else {
                toLast();
                this.it.setNext(prodJob);
                this.last = prodJob;
            }
        }
    }














}
