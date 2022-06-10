package com.bridglabz;

public class LinkedList {
    Node head;

    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public void push(int data){
        Node newNode = new Node(data);
        newNode.data = data;
        newNode.next = null;

        if (head == null) {
            head = newNode;
        }else{
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
        }
    }
    public void print() {
        Node newNode = head;
        while (newNode.next != null){
            System.out.print(newNode.data + " -> ");
            newNode = newNode.next;
        }
        System.out.println(newNode.data);
    }

}
