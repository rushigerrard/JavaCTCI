package com.practice.stack;

public class QueueUsingStack<T> {
	
	private Stack<T> first, second;
	
	public QueueUsingStack() {
		first = new Stack();
		second = new Stack();
	}
	
	private T dequeue() {
		T item;
		while((item = first.pop()) != null){
			second.push(item);
		}
		T firstItem = second.pop();
		while((item = second.pop()) != null){
			first.push(item);
		}
		return firstItem;
	}
	
	private void enqueue(T item) {
		first.push(item);
		
	}

	public static void main(String[] args) {
		QueueUsingStack<Integer> qus = new QueueUsingStack<>();
		qus.enqueue(4);
		qus.enqueue(5);
		qus.enqueue(6);
		qus.enqueue(7);
		System.out.println(qus.dequeue());
		qus.enqueue(8);
		qus.enqueue(9);
		System.out.println(qus.dequeue());
	}

}
