package com.sunbeam;

public class DoublyCircularMain {

	public static void main(String[] args) {
		DoublyCircularLinkedList list = new DoublyCircularLinkedList();
		list.addAtPosition(10, 1);
		list.addAtPosition(20, 2);
		list.addAtPosition(30, 3);
		list.addAtPosition(40, 4);
		list.deleteAtPosition(2);
		list.fDisplay();
	}
}
