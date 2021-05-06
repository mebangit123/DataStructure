package com.ds.practice;

public class StackDemo {
	private LinkedList link;
	
	public StackDemo() {
		link = new LinkedList();
	}
	public void pushStack(int data) {
		link.push(data);
	}
	public void printStack() {
		link.printList();
	}
	public int popStack() {
	int pop = link.pop();
	return pop;
	}
	public int peek() {
	if(link.head == null) {
		System.out.println("Stack is empty");
	}
	return link.head.data;
	}
	public static void main(String[] args) {
		StackDemo myStack = new StackDemo();
		myStack.pushStack(70);
		myStack.pushStack(30);
		myStack.pushStack(56);
		
		int peek = myStack.peek();
		System.out.println(peek);
		int p = myStack.popStack();
		System.out.println(p);
		
		myStack.printStack();
	}
}