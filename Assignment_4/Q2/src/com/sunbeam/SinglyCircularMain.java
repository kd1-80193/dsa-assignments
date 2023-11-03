package com.sunbeam;

public class SinglyCircularMain {

	public static void main(String[] args) {
		SinglyCirculerLinkedList list = new SinglyCirculerLinkedList();
		list.addFirst(10);
		list.addFirst(20);
		list.addFirst(30);
		list.addLast(40);
		// list.addAtPosition(50, 1);

		list.display();
		System.out.println("---------");
		// list.deleteFirst();
		// list.deleteLast();
		list.deleteAtPosition(4);
		list.display();
	}

}
