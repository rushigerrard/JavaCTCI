package com.practice.stack;

//TO DO - using generics
public class SetOfStack<T> {
	private class InternalStack<T>{
		
		private T[] stack;
		private int top;
		private int stackSize;
		
		public InternalStack(int capacity){
			top = -1;
			stackSize = capacity;
			stack = (T[]) new Object[stackSize];
		}
		public void push(T item){
			stack[++top] = item;
		}
		
		public T pop(){
			T item = stack[top--];
			return item;
		}
		public boolean isFull(){
			if(top == stackSize - 1){
				return true;
			}
			return false;
		}
		public boolean isEmpty(){
			if(top < 0){
				return true;
			}
			return false;
		}
	}
	
	private Stack<InternalStack<T>> sos= new Stack<>();
	int internalStackCapacity;
	public SetOfStack(int capacity){
		//Initialize an internal stack
		internalStackCapacity = capacity;
		InternalStack<T> is = new InternalStack<>(internalStackCapacity);
		sos.push((SetOfStack<T>.InternalStack<T>) is); // WHY??? ask DJ.
		
	}

	public void push(T item){
		InternalStack<T> current = sos.pop();
		if(!current.isFull()){ //current stack is not full
			current.push(item);
		}
		else{
			sos.push(current);
			current = new InternalStack<>(internalStackCapacity);
			current.push(item);
		}
		sos.push(current);
		
	}
	public T pop(){
		InternalStack<T> current = sos.pop();
		while(current != null){
			if(!current.isEmpty()){ // current stack is not empty
				T item = current.pop();
				sos.push(current);
				return item;
			}
			else{
				current = sos.pop();
			}
		}
		return null;
	}
	
	public static void main(String[] args){
		SetOfStack<Integer> sos = new SetOfStack<>(3);
		sos.push(4);
		sos.push(5);
		sos.push(6);
		sos.push(1);
		sos.push(2);
		sos.push(3);
		sos.push(9);
		Integer fromStack;
		while((fromStack = sos.pop()) != null){
			System.out.println(fromStack);
		}
		
	}
	
}
