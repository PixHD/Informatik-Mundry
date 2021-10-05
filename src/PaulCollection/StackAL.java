package PaulCollection;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Class that fullfills the funcions of a Stack.
 * @author Paul_H
 * @version 0.0.1
 */

public class StackAL<T> {

    private ArrayList<T> Stack = new ArrayList<>();
    private int size;

    public StackAL() {

    }

    /**
     *
     * @return Size of Stack
     */
    public int getSize() {
        return Stack.size();
    }


    /**
     * Returns true if Stack is completly empty
     * @return boolean
     */
    public boolean isEmpty() {
        return this.Stack.isEmpty();
    }

    public void pop() {
        if(!this.isEmpty()) {
            int i = this.Stack.size() - 1;
            this.Stack.remove(i);
        }
    }

    /**
     * Stores an Object in the Stack
     * @param o Object that is saved in Stack
     */
    public void push(Object o) {
        if(o != null && o.getClass() == null) {
            try {
                this.Stack.add((T) o);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**
     *Returns Object that is on Top of the Stack
     * @return Object on Top
     */
    public Object top() {
        if(!this.isEmpty()) {
            int i = this.Stack.size() - 1;
            return Stack.get(i);
        } else {
            return null;
        }
    }



}
