package com.bridglabz;

public class LinkedList {
    Node head;
    Node tail;

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void push(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void append(int data) {
        Node newNode = new Node(data);
         if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }
    public void pop() {
        if (head == null) {
            System.out.println("The List is empty");
            return;
        }
        head = head.next;
    }
    public void popLast() {
        Node temp = head;
        Node secondLastNode = null;
        while (temp.next != null) {
            secondLastNode = temp;
            temp = temp.next;
        }
        secondLastNode.next = null;
        tail = secondLastNode;
        return;
    }
    public void print() {
        Node temp = head;
        while(temp!=null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }
}
