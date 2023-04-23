package com.bridgelabz.queueusinglinkedlist;

public class QueueMainMethod {
    public static void main(String[] args) {
        MyQueue queue1 = new MyQueue();

        queue1.enqueue(56);
        queue1.printQueue();
        queue1.enqueue(30);
        queue1.printQueue();
        queue1.enqueue(70);
        queue1.printQueue();

        queue1.printQueue();

        queue1.dequeue();
        queue1.printQueue();

        queue1.dequeue();
        queue1.printQueue();

        queue1.dequeue();
        queue1.printQueue();
    }
}
