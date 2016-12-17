package com.practice.linkedlist;

public class UseLinkedList {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.insert(5);
		ll.insert("Hello");
		ll.insert("GOT");
		ll.insert(5);
		ll.insert("Hello");
		//CTCI 2.1
		ll.removeDuplicates();
		ll.print();
	}

}
