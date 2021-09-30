package Main;

import PaulCollection.StackAL;

public class MainClass {


    public static void main(String[] args) throws Exception {


        StackAL<String> Stack = new StackAL<>();

        String t1 = "Test1";
        String t2 = "Test2";
        String t3 = "Test3";
        int x = 9;

        Stack.push(t1);
        Stack.push(t2);
        Stack.push(t3);
        Stack.push(x);

        System.out.println(Stack.getSize());

        System.out.println(Stack.top());

        Stack.pop();

        System.out.println(Stack.getSize());


        /*Queue q = new Queue(10);
        q.enqueue("1");
        q.enqueue("2");
        q.enqueue("3");
        q.enqueue("4");
        q.enqueue("5");
        q.enqueue("6");
        q.enqueue("7");
        q.enqueue("8");
        q.enqueue("9");
        q.enqueue("10");

        q.printArray();
        System.out.println();
        System.out.println("Front: " + q.front());

        for (int i = 0; i <= 9; i++) {
            try {
                q.dequeue();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        System.out.println();
        q.printArray();*/


    }
}
