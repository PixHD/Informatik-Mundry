package OwnCollection;

public class Stack {

    private int index; //Indexposition des Aktuellen Elements
    private int anzahlElemente; //Anzahl der Elemente
    private Object[] stack; //Das Object Array

    public Stack() { //Constructor für den Stack
        index = -1; //Wenn kein aktuelles Element Vorhanden, dann ist der Index -1
        anzahlElemente = 0;
        stack = new Object[10];
    }

    public Stack(int anzahl) {//Constructor für den Stack
        index = -1; //Wenn kein aktuelles Element Vorhanden, dann ist der Index -1
        anzahlElemente = 0;
        stack = new Object[anzahl];
    }
    //gibt zurück ob das Array leer ist
    public boolean isEmpty() {
        return anzahlElemente==0;
    }


    //Fügt ein Objekt hinzu
    public void push(Object o) {
        if(index+1 < stack.length && o != null) {
            index++;
            stack[index] = o;
            anzahlElemente++;
        }
    }


    //Entfernt das oberste Element des Stacks
    public void pop() {
        if(!isEmpty()) {
            anzahlElemente--;
            index--;
        }
    }


    //Gibt das oberste Element der Stacks zurück
    public Object top() {
        if(!isEmpty()) {
            return stack[index];
        }else {
            return null;
        }
    }

}
