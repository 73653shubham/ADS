package binary_search_tree;

public class BST {
	private Node root;

	public BST() {
		root = null;
	}

	public boolean isTreeEmpty() {
		return root == null;
	}

	public void addNode(int value) {
		Node newNode = new Node(value);
		if (isTreeEmpty())
			root = newNode;
		else {
			addNode(root, newNode);
		}
	}

	public void addNode(Node root, Node newNode) {
		if (root.getValue() > newNode.getValue()) {
			if (root.getLeft() == null)
				root.setLeft(newNode);
			else {
				addNode(root.getLeft(), newNode);
			}
		} else {
			if (root.getRight() == null)
				root.setLeft(newNode);
			else {
				addNode(root.getRight(), newNode);
			}
		}

	}

	public void inorder() {
			inoreder(root);
		}

	public void inoreder(Node root) {
		if(root==null)
			return;
		else {
			inoreder(root.getLeft());
			System.out.println(root.getValue());
			inoreder(root.getRight());
		}
	}
	public void preorder() {
		preoreder(root);
	}
	public void preoreder(Node root2) {
		if(root==null)
			return;
		else {
			System.out.println(root.getValue());
			inoreder(root.getLeft());
			inoreder(root.getRight());
		}
	}
	public void postorder() {
		preoreder(root);
	}
	public void postoreder(Node root2) {
		if(root==null)
			return;
		else {
			
			inoreder(root.getLeft());
			inoreder(root.getRight());
			System.out.println(root.getValue());
		}
	}
}
