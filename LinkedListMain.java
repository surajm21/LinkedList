package com.bridglabz;

public class LinkedListMain {
    public static void addData(){
        LinkedList list = new LinkedList();
        list.push(70);
        list.push(30);
        list.push(56);
        list.print();
    }
    public static void appendData(){
        LinkedList list = new LinkedList();
        list.append(56);
        list.append(30);
        list.append(70);
        list.print();
    }
    public static void popData(){
        LinkedList list = new LinkedList();
        list.push(70);
        list.push(30);
        list.push(56);
        list.pop();
        list.print();
    }
}



