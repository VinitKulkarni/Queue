package com.bridgelabz.queueusinglinkedlist;

public class MyQueue<T> {
    MyLinkedList linkedList;
    public MyQueue(){
        this.linkedList = new MyLinkedList();
    }

    public void enqueue(T data) {
        linkedList.append(data);
    }

    public void printQueue() {
        if(linkedList.calculateSize() > 0) {
            System.out.print("Queue elements are: ");
            linkedList.display();
        }else{
            System.out.println("Queue is empty. Cannot display elements");
        }
    }

    public void dequeue() {
        if(linkedList.calculateSize() > 0) {
            System.out.print("Removed front element from queue is: ");
            System.out.println(linkedList.deleteFirst());
        }else{
            System.out.println("Queue is empty. Cannot remove element");
        }
    }
}
