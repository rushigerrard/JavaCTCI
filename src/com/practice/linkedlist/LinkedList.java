package com.practice.linkedlist;

import java.util.HashSet;

public class LinkedList {
	private Node head;
	
	public LinkedList(){
		this.head = null;
	}
	public boolean isEmpty(){
		return head == null;
	}
	public void insert(Object object){
		Node newNode = new Node(object, null); 
		if(head == null){
			head = newNode;
			return ;
		}
		
		Node current = head;
		while(current.getNext() != null){
			current = current.getNext();
		}
		current.setNext(newNode);
		return ;
	}

	public void remove() throws Exception{
		
		if(head == null){
			throw new Exception("Cannot delete");
		}
		Node curr = head;
		Node prev = null;
		
		while(curr.getNext() != null){
			prev = curr;
			curr = curr.getNext();
		}
		curr = null;
		prev.setNext(null);
	}
	public void remove(Object obj) throws Exception{
		
		if(head == null){
			throw new Exception("Cannot delete");
		}
		Node curr = head;
		Node prev = null;
		
		while(!curr.getObject().equals(obj) && curr.getNext() != null){
			prev = curr;
			curr = curr.getNext();
		}
		prev.setNext(curr.getNext());
		
	}
	
	public void print(){
		System.out.print("[ ");
		Node tmp = head;
		while(tmp != null){
			System.out.print(tmp.getObject() + ", ");
			tmp = tmp.getNext();
		}
		System.out.print(" ]");
	}
	public void removeDuplicates() {
		HashSet<Object> hs = new HashSet<>();
		
		if(head == null)
			return ;
		Node curr = head.getNext();
		Node prev = head;
		hs.add(head.getObject());
		while(curr != null){
			if(hs.add(curr.getObject()) == false){
				prev.setNext(curr.getNext());
				curr = curr.getNext();
			}
			else{
				prev = curr;
				curr = curr.getNext();
			}
		}
	}
}
