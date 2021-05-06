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
	public static void main(String[] args) {
		StackDemo myStack = new StackDemo();
		myStack.pushStack(70);
		myStack.pushStack(30);
		myStack.pushStack(56);
		
		myStack.printStack();
	}
}
