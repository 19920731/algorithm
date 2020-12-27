package algorithm.tree;

class Node {
	int data;
	Node left;
	Node right;
}

class Tree {
	public Node root;

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}
	
	public Node makeNode(Node left, int data, Node right) {
		Node node = new Node();
		node.data = data;
		node.left = left;
		node.right = right;
		return node;
	}
	
	public void preorder(Node node) {
		if (node != null) {
			System.out.print(node.data + " ");
			preorder(node.left);
			preorder(node.right);
		}		
	}
	
	public void inorder(Node node) {
		if (node != null) {
			inorder(node.left);
			System.out.print(node.data + " ");
			inorder(node.right);
		}		
	}
	
	public void postorder(Node node) {
		if (node != null) {
			postorder(node.left);
			postorder(node.right);
			System.out.print(node.data + " ");
		}		
	}
}

public class Traversal {

	public static void main(String[] args) {
		/*
		 * 			   1
		 *           /   \
		 *          /     \
		 *         2       3
		 *        / \     / 
		 *       4   5   6  
		 */
		Tree tree = new Tree();
		Node n6 = tree.makeNode(null, 6, null);
		Node n5 = tree.makeNode(null, 5, null);
		Node n4 = tree.makeNode(null, 4, null);
		Node n3 = tree.makeNode(n6, 3, null);
		Node n2 = tree.makeNode(n4, 2, n5);
		Node n1 = tree.makeNode(n2, 1, n3);
		tree.setRoot(n1);
		
		// 전위 순회(preorder) : Root -> Left -> Right
		System.out.println("\n==== preorder ====");
		tree.preorder(n1); // Result : 1 2 4 5 3 6

		// 중위 순회(Inorder) : Left -> Root -> Right
		System.out.println("\n==== inorder ====");
		tree.inorder(n1); // Result : 4 2 5 1 6 3
		
		// 후위 순회(postorder) : Left -> Right -> Root
		System.out.println("\n==== postorder ====");
		tree.postorder(n1); // Result : 4 5 2 6 3 1
		

	}

}
