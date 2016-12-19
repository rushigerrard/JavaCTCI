package com.practice.queue;

public class UseQueue {

	public static void main(String[] args) {
		Queue<Integer> q = new Queue<>(4);
		q.enqueue(4);
		q.enqueue(5);
		q.enqueue(6);
		System.out.println("Current size of the queue is " + q.size());
		System.out.println(q.dequeue());
		q.enqueue(7);
		q.enqueue(8);
		System.out.println("Current size of the queue is " + q.size());
		System.out.println(q.dequeue());

	}

}
