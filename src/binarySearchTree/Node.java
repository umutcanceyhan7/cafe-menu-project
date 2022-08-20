package binarySearchTree;

public class Node<T> {
	int key; // 
	Node<T> left, right;
	// Constructor
	public Node(int item) {
		this.key = item;
		left = right = null;
	}
	public int getKey() {
		return key;
	}
	public void setKey(int key) {
		this.key = key;
	}
	public Node<T> getLeft() {
		return left;
	}
	public void setLeft(Node<T> left) {
		this.left = left;
	}
	public Node<T> getRight() {
		return right;
	}
	public void setRight(Node<T> right) {
		this.right = right;
	}
}
