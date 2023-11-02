package singly_linked_list;

import java.util.Scanner;

public class TestSinglyLinkedListImplementingStack {

	public static void main(String[] args) {
		try (Scanner sc=new Scanner(System.in)){
			
			SinglyLinkedList queue=new SinglyLinkedList();
			queue.push(10);
			queue.push(20);
			queue.push(30);
			System.out.println(queue.pop());
			System.out.println(queue.pop());
			System.out.println(queue.pop());
			System.out.println("Element in queue");
			queue.display();
			System.out.println(queue.pop());
			queue.push(10);
			queue.push(20);
			queue.push(30);
			
		}

	}

}
