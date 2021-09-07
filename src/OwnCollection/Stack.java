package OwnCollection;

public class Stack {

    private int index; //Indexposition des Aktuellen Elements
    private int anzahlElemente;
    private Object[] stack;

    public Stack() {
        index = -1; //Wenn kein aktuelles Element Vorhanden, dann ist der Index -1
        anzahlElemente = 0;
        stack = new Object[10];
    }

    public Stack(int anzahl) {
        index = -1; //Wenn kein aktuelles Element Vorhanden, dann ist der Index -1
        anzahlElemente = 0;
        stack = new Object[anzahl];
    }

    public boolean isEmpty() {
        return anzahlElemente==0;
    }

    public void push(Object o) {
        if(index+1 <= stack.length && o != null) {
            stack[index+1] = o;
            index++;
            anzahlElemente++;
        }
    }

    public void pop() {
        if(!isEmpty()) {
            anzahlElemente--;
            index--;
        }
    }

    public Object top() {
        if(!isEmpty()) {
            return stack[index];
        }else {
            return null;
        }
    }

}
