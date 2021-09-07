package Main;

import OwnCollection.Stack;

public class MainClass {

    public static void main(String[] args) {
        Stack s = new Stack(10);
        s.push("Hallo");
        System.out.println(s.top());
        s.pop();
        System.out.println(s.isEmpty());
    }
}
