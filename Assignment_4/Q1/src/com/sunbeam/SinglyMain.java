package com.sunbeam;

public class SinglyMain {

	public static void main(String[] args) {
		SinglyLinearLinkedList list = new SinglyLinearLinkedList();

		list.addLast(30);
		list.addLast(40);
		list.addFirst(20);
		list.addFirst(10);
		list.addAtPosition(50, 5);
		list.display();
		list.deleteAtPosition(4);
		// 20 10 30
		// list.deleteFirst();
		// list.deleteLast();
		list.display();

	}

}
