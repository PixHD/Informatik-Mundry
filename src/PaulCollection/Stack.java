package PaulCollection;

public class Stack {
    int index;
    int count;
    Object[] Stack;

    //Standardsignatur, Stackgröße ffestgelegt auf 10
    public Stack() {
        this.index = -1; //Index zeigt auf eine nicht gültige Stelle, da Stack leer
        this.count = 0;
        this.Stack = new Object[10];
    }

    //Parameter count muss übergeben werden, stellt die spätere Größe des Stack ein
    public Stack(int count) {
        this.index = -1;
        this.count = 0;
        this.Stack = new Object[count];
    }

    //GIbt zurück ob der Stack leer ist
    public boolean isEmpty() {
        if(this.count == 0) {
            return true;
        } else {
            return false;
        }
    }

    //"Löscht" das letzte dem Stack zugefügte Objekt, indem es den Index um 1 verringert
    public void pop() {
        if(!this.isEmpty()) {
            this.index--;
            this.count--;
        }
    }

    //Gibt das letzte dem Stack hinzugefügte Objekt zurück
    //Nicht Typsicher
    public Object top() {
        return this.Stack[index];
    }

    //Fügt ein Objekt hinzu, welches als Parameter angegeben werden muss, wenn Platz im Stack ist
    public void push(Object obj) {
        if(obj != null && this.index < this.Stack.length - 1) {
            this.index++;
            this.count++;
            this.Stack[index] = obj;
        }
    }




}
