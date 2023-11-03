package com.sunbeam;

public class BSTreeMain {

	public static void main(String[] args) {
		BSTree b = new BSTree();

		b.addNode(10);
		b.addNode(20);
		b.addNode(30);
		b.addNode(40);
		b.addNode(60);
		b.addNode(50);
		b.preOrder();
		//b.preOrder(b.root);

	}

}
