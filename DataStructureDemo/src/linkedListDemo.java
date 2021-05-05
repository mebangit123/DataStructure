public class linkedListDemo {

	public static void main(String[] args) {
		System.out.println("LinkedList Demo");
		
		LinkedList linkedList = new LinkedList();
		
		linkedList.append(56);
		linkedList.append(30);
		linkedList.append(70);

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
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
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
}