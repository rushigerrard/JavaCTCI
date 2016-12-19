package com.practice.stack;

import java.lang.reflect.Array;

public class Stack<T>{
	
	private T[] stack;
	private int top;
	private int stackSize;
	
	public Stack(){
		top = -1;
		stackSize = 1;
		stack = (T[]) new Object[stackSize];
	}

	
	public void push(T item){
		if(top < stackSize){
			resize();
		}
		stack[++top] = item;
	}
	
	public T pop(){
		if(top < 0){
			return null;
		}
		T item = stack[top--];
		return item;
	}
	
	private void resize(){
		T tmp[] = stack;
		stackSize = stackSize * 2;
		stack = (T[]) new Object[stackSize];
		
		for(int i = 0; i < tmp.length; i++){
			stack[i] = tmp[i];
		}
				
	}
	
}