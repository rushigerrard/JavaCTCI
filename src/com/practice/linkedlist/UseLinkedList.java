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
		
		//CTCI 2.5 Sum
		LinkedList l1 = new LinkedList();
		LinkedList l2 = new LinkedList();
		l1.insert(2);
		l1.insert(3);
		l1.insert(8);
		l1.insert(9);
		
		l2.insert(9);
		l2.insert(9);
		l2.insert(9);
		
		LinkedList l3 = new LinkedList();
		l3.sum(l1, l2);
		l3.print();
		//CTCI 2.6 Palindrome
		ll.reverseList();
		
		//CTCI 2.8 Cycle Detection
		LinkedList circularList = new LinkedList();
		circularList.insert(4);
		circularList.insert(5);
		circularList.insert(6);
		circularList.insert(7);
		circularList.insert(8);
		circularList.cycleInjection();
		System.out.println(circularList.isCycle());
		System.out.println(ll.isCycle());

	}

}
