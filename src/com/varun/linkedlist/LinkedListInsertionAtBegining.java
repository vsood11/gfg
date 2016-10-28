package com.varun.linkedlist;

public class LinkedListInsertionAtBegining {
	
	public static void insert(LL list, int data) {
		
		Node newNode = new Node(data);
		Node temp = list.getHead();
		
		newNode.setNext(temp.getNext());
		list.setHead(newNode);
	}

}
