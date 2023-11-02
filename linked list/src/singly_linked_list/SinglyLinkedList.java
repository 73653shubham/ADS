package singly_linked_list;

public class SinglyLinkedList {
	private Node head;
	private Node top;

	public SinglyLinkedList() {
		head = null;
		top = null;
	}

	public static class Node {
		private int data;
		private Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public boolean isStackEmpty() {
		if (head == null || top == null)
			return true;
		return false;
	}

	public void push(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			top = newNode;
		} else {
			top.next = newNode;
			top = newNode;
		}
	}

	public int pop() {
		if (isStackEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		} else {
			Node travNode = head;
			if(head.next!=null) {
				while (travNode.next != top) {
					travNode = travNode.next;
				}
				Node tempNode = top;
				top = travNode;
				top.next=null;
			
				return tempNode.data;
			}
			else {
				head=null;
				top=head;
				return travNode.data;
			}
		}
	}

	public void display() {
		if (head == null)
			System.out.println("Queue is empty");
		else {
		Node travNode = head;
		while (travNode.next != null) {
			System.out.print(travNode.data + " ");
			travNode = travNode.next;
		}
		}
	}
}
