package com.varun.linkedlist;

public class LinkedListAfterGivenNode {
	
	public static void insertAfterGivenNode(Node node, int data) {
		
		Node newNode = new Node(data);
		newNode.setNext(node.getNext());
		node.setNext(newNode);
	}
}
