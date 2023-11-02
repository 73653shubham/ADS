package doubly_linked_list;

import java.util.Scanner;

public class TestDoublyLinkedListImplenetingByQueue {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			DoublyLinkedList list = new DoublyLinkedList();
			boolean exit = false;
			while (!exit) {
				System.out.println(
						"\n1.Show the contents of doubly linked list\n" + "2.Insert the data in the doubly linked list\n"
								+ "3.Check how many elements are there in the doubly linked list.\n"
								+ "4.Check to see if doubly linked list is empty.\n" + "0.exit\n" + "Enter the choice");
				switch (sc.nextInt()) {
				case 1:
					list.dispaly();
					break;
				case 2:
					System.out.println("Enter the element to insert");
					list.enQueue(sc.nextInt());
					break;
				case 3:
					System.out.println("How many element in the list : "+list.countOfElementInList());
					break;
				case 4:
					System.out.println("Is Queue empty "+list.isQueueEmpty());
					
					break;
				case 0:
					exit=true;
					break;
				default:
					break;
				}

			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
