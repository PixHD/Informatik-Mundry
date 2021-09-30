package PaulCollection;

import java.util.ArrayList;

/**
 * Class that fullfills the funcions of a Stack.
 * @author Paul_H
 * @version 0.0.1
 */

public class StackAL {
    private int length, index, count;
    private ArrayList<Object> Stack = new ArrayList<>();

    public StackAL() {
        this.index = -1;
        this.count = 0;
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

    public void push(Object obj) {
        if(obj != null) {
            this.Stack.add(obj);
        }
    }

    public Object top() {
        if(!this.isEmpty()) {
            int i = this.Stack.size() - 1;
            return Stack.get(i);
        } else {
            return null;
        }
    }



}
