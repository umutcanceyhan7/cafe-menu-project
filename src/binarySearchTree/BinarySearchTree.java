package binarySearchTree;

public class BinarySearchTree {
	// Root node
	private Node<?> root;
	
	//Constructor
	public BinarySearchTree(){
		this.root = null;
	}
	public <T> void add(int key) {
		Node<T> newNode = new Node<T>(key);
		// if tree is empty
		if(root == null) {
			setRoot(newNode);
		}
		else {
			
			Node tempNode = getRoot();
			Node parent;
			
			while(true) {
				parent = tempNode;
				// if key is less than parent key go left side
				if(key < tempNode.getKey()) {
					tempNode = tempNode.getLeft();
					
					if(tempNode == null) {
						parent.setLeft(newNode);
						return;
					}
				}
				// if key is greater than parent key go right side
				else {
					
					tempNode = tempNode.getRight();
					
					if(tempNode == null) {
						parent.setRight(newNode);
						return;
					}
				}
			}
		}
		
	}
	public <T> void inOrderTraverse(Node focusNode) {
		if(focusNode != null) {
			
			inOrderTraverse(focusNode.getLeft());
			System.out.println(focusNode.getKey());
			inOrderTraverse(focusNode.getRight());

		}
	}
	public <T> void preOrderTraverse(Node focusNode) {
		if(focusNode != null) {

			System.out.println(focusNode.getKey());
			preOrderTraverse(focusNode.getLeft());
			preOrderTraverse(focusNode.getRight());

		}
	}
	public <T> void postOrderTraverse(Node focusNode) {
		if(focusNode != null) {

			
			preOrderTraverse(focusNode.getLeft());
			preOrderTraverse(focusNode.getRight());
			System.out.println(focusNode.getKey());

		}
	}
	
	
	public Node getRoot() {
		return root;
	}
	public void setRoot(Node root) {
		this.root = root;
	}
}
