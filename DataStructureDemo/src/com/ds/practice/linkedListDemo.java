package com.ds.practice;
public class linkedListDemo {

	public static void main(String[] args) {
		System.out.println("LinkedList Demo");
		
		LinkedList linkedList = new LinkedList();
		
		linkedList.append(56);
		linkedList.append(30);
		linkedList.append(70);
		//linkedList.insertAfter(linkedList.head, 40);
		//linkedList.pop();
		//linkedList.popLast();
		linkedList.insertAny(3, 40);
		//linkedList.searchElement(56);
		linkedList.printList();
		linkedList.deleteNodeAtPos(3);
		linkedList.printList();
	}
}

class LinkedList {
	Node head;

	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}
	}

	public void push(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}

	public void printList() {
		System.out.println("List : ");
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data);
			temp = temp.next;
			System.out.println();
		}
		//System.out.println("null");
	}
	public void append(int data) { 
		Node newNode = new Node(data);
		
		if(head == null) {
			head  = newNode;
			return;
		}
		Node last = head;
		while(last.next != null) {
			last = last.next;
		}
		last.next = newNode;
	}
	public void insertAfter(Node prevNode, int data) {
		if(prevNode == null) {
			System.out.println("prevoius node should not be null ");
			return;
		}
		
		Node newNode = new Node(data);
		newNode.next = prevNode.next;
		prevNode.next = newNode;
	}
	public int pop() {
		if(head == null)
			System.out.println("List is empty");
		Node temp = head;
		head = head.next;
		temp.next = null;
		return temp.data;
	}
	public void popLast() {
		if(head == null)
			System.out.println("List is empty");
		Node last = head;
		Node temp = null;
		while(last.next != null) {
			temp = last;
			last = last.next;
		}
		temp.next = null;
		last.next = temp.next;
	}
	public void searchElement(int data)
    {
        Node n=head;
        int count=0;
        while(n != null)
        {
		   count =count+1;
		   if(n.data == data) {
	       	System.out.println("Node with value "+data+" is found at position " +count);
	       }
            n=n.next;   
        }
    }
	public void insertAny(int pos,int data)
    {
        Node n = new Node(data);
        n.data=data;
        n.next=null;
        Node t= head;
        if(pos==0)
        {
        push(data);
        }
        for(int i=1;i<pos-1;i++)
        {
            t=t.next;
        }
            n.next=t.next;
            t.next=n;
        }
	public void deleteNodeAtPos(int pos) {
		if(pos == 0) {
			pop();
		}
		Node delPrev = head;
		for(int i = 1; i < pos -1; i++) {
			delPrev = delPrev.next;
		}
		Node current = delPrev.next;
		delPrev.next = current.next;
		current.next = null;
	}
}