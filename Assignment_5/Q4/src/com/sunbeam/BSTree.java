package com.sunbeam;

public class BSTree {
	public class Node {
		private int data;
		private Node left;
		private Node right;

		public Node(int value) {
			this.data = value;
			left = null;
			right = null;
		}
	}

	public Node root;

	public BSTree() {
		root = null;
	}

	public Node addNode(Node trav, int value) {

		Node newnode = new Node(value);

		if (trav == null)
			trav = newnode;
		else {
			if (value < trav.data) {
					trav.left=addNode(trav.left, value);
			} else {
				trav.right=addNode(trav.right, value);
			}
		}
		return trav;
	}

	public void addNode(int data) {
		root = addNode(root, data);
	}

	void preOrder(Node trav) {
		// stop if trav is null
		if (trav == null)
			return;
		// visit current node (print data)
		System.out.print(" " + trav.data);
		// go into left of current node
		preOrder(trav.left);
		// go into right of current node
		preOrder(trav.right);
	}

	void preOrder() {
		System.out.print("PreOrder : ");
		preOrder(root);
		System.out.println("");
	}

//	public void addNode(int value) {
//
//		Node newnode = new Node(value);
//
//		if (root == null)
//
//			root = newnode;
//		else {
//			Node trav = root;
//			while (true) {
//				if (value < trav.data) {
//					if (trav.left == null) {
//						trav.left = newnode;
//						break;
//					} else
//						trav = trav.left;
//				} else {
//					if (trav.right == null) {
//						trav.right = newnode;
//						break;
//					} else
//						trav = trav.right;
//				}
//			}
//		}
//	}
}
