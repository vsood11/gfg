package com.varun.linkedlist;

public class LinkedListInsertionAtEnd {

	public static void insert(LL list, int data) {
		
		Node newNode = new Node(data);
		Node temp = list.getHead();
		
		if(temp == null) {
			list.setHead(newNode);
			return;
		}
		
		while(temp.getNext() != null) {
			temp = temp.getNext();
		}
		
		temp.setNext(newNode);
	}
}
