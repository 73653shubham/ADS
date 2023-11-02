package binary_search_tree;

import java.util.Scanner;

public class Tree {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			BST tree = new BST();
			boolean exit = false;
			while (!exit) {
				System.out.println(
						"\n1.Insert the data into the binary search tree\n" + "2.Show the contents using Inoder traversal\n"
								+ "3.Show the contents using preorder traversal.\n"
								+ "4.Show the contents using postoder traversal.\n" + "0.exit\n" + "Enter the choice");
				switch (sc.nextInt()) {
				case 1:
					System.out.println("Enter the element to insert");
					tree.addNode(sc.nextInt());
					break;
				case 2:
					tree.inorder();
					break;
				case 3:
					tree.preorder();
					break;
				case 4:
					tree.postorder();					
					break;
				case 0:
					exit=true;
					break;
				default:
					System.out.println("Invalid entry!!\nPlease enter valid choice");
					break;
				}

			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}


}
