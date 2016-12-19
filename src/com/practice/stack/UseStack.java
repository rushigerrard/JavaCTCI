package com.practice.stack;

public class UseStack {

	public static void main(String[] args) {

		Stack<Integer> iStack = new Stack<>();
		iStack.push(4);
		iStack.push(3);
		System.out.println(iStack.pop());
		System.out.println(iStack.pop());
		System.out.println(iStack.pop());
		iStack.push(5);
		iStack.push(6);
		System.out.println(iStack.pop());
		
		Stack<String> sStack = new Stack<>();
		sStack.push("Hello");
		sStack.push("World");
		sStack.push("How");
		sStack.push("Are");
		sStack.push("You");
		System.out.println(sStack.pop());
		System.out.println(sStack.pop());
		
		
	}

}
