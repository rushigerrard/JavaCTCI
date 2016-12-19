package com.practice.queue;

public class Queue<T> {

	private int head, tail, queueCapacity;
	private T[] queue;
	
	public Queue(int capacity){
		head = -1;
		tail = -1;
		queueCapacity = capacity;
		queue = (T[]) new Object[capacity];
	}
	public void enqueue(T item){
		if(isFull()){
			resize();
		}
		tail = tail + 1;
		queue[tail] = item;
	}
	private void resize() {
		T[] tmp = queue;
		queueCapacity = queueCapacity * 2;
		queue = (T[]) new Object[queueCapacity];
		for(int i = 0; i < tmp.length; i++){
			queue[i] = tmp[i];
		}
	}
	public T dequeue(){
		if(isEmpty())
			return null;
		head = head + 1; 
		return queue[head];
		
	}
	private boolean isFull() {
		if(tail == queueCapacity - 1)
			return true;
		return false;
		
	}
	private boolean isEmpty() {
		if(head >= tail)
			return true;
		return false;
	}
	public int size(){
		return this.queueCapacity;
	}
}
