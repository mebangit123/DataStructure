public class linkedListDemo {

	public static void main(String[] args) {
		System.out.println("LinkedList Demo");
	}
}
class LinkedList {
	Node head;
	
	class Node {
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			next =  null;
		}
	}
}