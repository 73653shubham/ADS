package doubly_linked_list;
//implemention of queue using doubly linked list
public class DoublyLinkedList {
	private Node head;
	private Node tail;
	public DoublyLinkedList() {
		head=null;
		tail=null;
	}
	public static class Node {
		private int data;
		private Node prevNode;
		private Node nextNode;
	
		public Node(int data){
		this.data=data;
		prevNode=null;
		nextNode=null;
		}
	}	
	public boolean isQueueEmpty() {
		if(head==null)
			return true;
		return false;
	}
	public void enQueue(int element) {
		Node tempNode=new Node (element);
		if(head==null) {
			head=tempNode;
			tail=tempNode;
		}
		else {
			tail.nextNode=tempNode;
			tail=tempNode;
		}
	}
	public int deQueue() {
		if(isQueueEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		}
		else {
			Node tempNode=tail;
			tail=tail.prevNode;
			tail.nextNode=null;
			return tempNode.data;
		}
	}
	public void dispaly() {
		if(isQueueEmpty()) {
			System.out.println("Queue is empty nothing to display");
		}
		else {
			Node travNode = head;
			if (travNode.nextNode != null) {
				do {
					System.out.print(travNode.data + " ");
					travNode = travNode.nextNode;
				}while(travNode.nextNode != null);
			} 
				System.out.println(travNode.data);
			
		}
	}
	public int countOfElementInList() {
		if(isQueueEmpty()) {
			System.out.println("Queue is empty nothing to display");
			return 0;
		}
		else {
			Node travNode = head;
			int count=0;
			if (travNode.nextNode != null) {
				do {
					System.out.print(travNode.data + " ");
					travNode = travNode.nextNode;
					count++;
				}while(travNode.nextNode != null);
			} 
				System.out.println(travNode.data);
				return ++count;
			
		}
	}
}
