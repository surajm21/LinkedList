package com.bridglabz;

public class LinkedListProblem {
    public static void main(String[] args) {
        System.out.println("Welcome To Linked List Problem");
        System.out.println("\n===================");
        System.out.println("Add Nodes");
        LinkedListMain.addData();
        System.out.println("\n=======================");

        System.out.println("Append Nodes");
        LinkedListMain.appendData();
        System.out.println("\n=======================");

        System.out.println("Delete First Node");
        LinkedListMain.popData();
        System.out.println("\n===================");

        System.out.println("Delete Last Node");
        LinkedListMain.popLastData();
        System.out.println("\n===================");

        System.out.println("Insert Node");
        LinkedListMain.insertData();
        System.out.println("\n===================");

        System.out.println("Search Node");
        LinkedListMain.searchData();
        System.out.println("\n===================");
    }
}


