package com.bridgelabz.queueusinglinkedlist;

public class MyLinkedList<T> {
    Node<T> head;
    Node<T> tail;
    public void append(T data){
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void display(){
        Node<T> temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }
    public T deleteFirst(){
        T value;
        if(head.next == null){
            value = head.data;
            head = null;
        }else {
            Node temp = head.next;
            value = head.data;
            head = head.next;
        }
        return value;
    }

    public int calculateSize(){
        Node temp = head;
        Integer elementCount = 0;
        if (head == tail && head != null && tail != null){
            elementCount = 1;
        }else {
            while (temp != null) {
                elementCount = elementCount + 1;
                temp = temp.next;
            }
        }
        return elementCount;
    }
}
