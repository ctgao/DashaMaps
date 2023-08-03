package com.github.zipcodewilmington.mylinkedlist;

public class MyLinkedList {
    MyNode head;

    public MyLinkedList() {
        head = null;
    }

    public MyNode getHead() {
        return head;
    }

    // default adds to the end
    // Other functions!
    // starting with adding stuffs
    public void add(String key, String value) {
    }
    private void addToEnd(MyNode currentNode, MyNode n){
    }

    public void remove(int index) {
    }

    public int size() {
        return 0;
    }

    public int find(String key) {
        return 0;
    }

    public boolean contains(String key) {
        return false;
    }

    public MyNode get(int idx) {
        return null;
    }

    @Override
    public boolean equals(Object o){
        if(o == null){
            return false;
        }
        MyLinkedList other = (MyLinkedList) o;
        if(this.head == null && other.head == null){
            return true;
        }
        else if(this.head == null || other.head == null){
            return false;
        }
        else{
            return this.head.equals(other.head);
        }
    }
}
