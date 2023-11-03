package com.sunbeam;

import com.sunbeam.SinglyLinearBeforeAfter.Node;

public class Main {

	public static void main(String[] args) {
		SinglyLinearBeforeAfter list = new SinglyLinearBeforeAfter();

		// Node n = list.new Node(70);
		// Node nn = list.new Node(80);
		list.addLast(30);
		// list.addLast(40);
		list.addFirst(20);
		list.addFirst(10);
		// list.addAtPosition(50, 5);
		list.display();
		// list.addBefore(nn, 90);
		// list.addAfter(n, 60);
		list.addB();
		 list.addA();
		list.display();

	}

}
