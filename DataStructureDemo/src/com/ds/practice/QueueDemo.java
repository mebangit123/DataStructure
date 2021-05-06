package com.ds.practice;

public class QueueDemo {
private LinkedList link;

public QueueDemo() {
	link = new LinkedList();
}
public void addQueue(int data) {
	link.append(data);
}
public void printQueue() {
	link.printList();
}
public static void main(String[] args) {
	QueueDemo queue = new QueueDemo();
	
	queue.addQueue(56);
	queue.addQueue(30);
	queue.addQueue(76);

	queue.printQueue();
}
}
