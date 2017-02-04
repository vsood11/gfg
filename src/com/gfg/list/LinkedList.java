package com.gfg.list;

/**
 * Created by varunsudan on 2/3/17.
 */
public class LinkedList {

    private Node head;

    public LinkedList(Node head) {
        this.head = head;
    }

    public LinkedList() {
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public void insert(Node ele) {
        if(head == null) {
            head = ele;
            return;
        }

        Node temp = head;

        while(temp.getNext() != null) {
            temp = temp.getNext();
        }

        temp.setNext(ele);

    }
}
