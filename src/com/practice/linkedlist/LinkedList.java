package com.practice.linkedlist;

import java.util.ArrayList;
import java.util.Collections;
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
		System.out.println();
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
	/*
	 * TO DO
	 * */
	public void reverseList() {
		
		
	}
	public void cycleInjection() {
		if(head == null)
			return ;
		Node curr = head;
		while(curr.getNext() != null){
			curr = curr.getNext();
		}
		curr.setNext(head);
	}
	public boolean isCycle() {
		Node slow = head;
		Node fast = head;
		while(fast.getNext() != null){
			slow = slow.getNext();
			fast = fast.getNext().getNext();
			if(slow.equals(fast)){
				System.out.println("Start of cycle is " + slow.getObject());
				return true;
			}
		}
		return false;
	}
	public void sum(LinkedList l1, LinkedList l2) {
		
		ArrayList<Integer> first = new ArrayList<>();
		ArrayList<Integer> second = new ArrayList<>();
		Node curr = l1.head;
		
		while(curr.getNext() != null){
			first.add((Integer) curr.getObject());
			curr = curr.getNext();
		}
		first.add((Integer) curr.getObject());
		curr = l2.head;
		while(curr.getNext() != null){
			second.add((Integer) curr.getObject());
			curr = curr.getNext();
		}
		second.add((Integer) curr.getObject());
		ArrayList<Integer> third = new ArrayList<>();
		int carry = 0;
		int maxSize = 0;
		if(first.size() > second.size()){
			maxSize = first.size();
			Collections.reverse(second);
			for(int i = second.size(); i < first.size(); i++){
				second.add(0);
			}
			Collections.reverse(second);
		}else if(second.size() > first.size()){
			maxSize = second.size();
			Collections.reverse(first);
			for(int i = first.size(); i < second.size(); i++){
				first.add(0);
			}
			Collections.reverse(first);
		}else{
			maxSize = first.size();
		}
		

		for(int i = maxSize - 1; i >= 0; i--){
			int sum = first.get(i) + second.get(i) + carry;
			if(sum > 9){
				sum = sum % 10;
				carry = 1;
			}else{
				carry = 0;
			}
			third.add(sum);
		}
		if(carry == 1)
			third.add(carry);
		
		Collections.reverse(third);
		
		for(Integer i : third){
			Node newNode = new Node(i, null);
			if(head == null){
				head = newNode;
				continue;
			}
			curr = head;
			while(curr.getNext() != null){
				curr = curr.getNext();
			}
			curr.setNext(newNode);
		}
	}
}
