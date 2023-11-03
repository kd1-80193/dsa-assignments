package com.sunbeam;

public class ReverseMain {

	public static void main(String[] args) {
		ReverseLinkedList list = new ReverseLinkedList();
		list.addLast(30);
		list.addLast(40);
		list.addFirst(20);
		list.addFirst(10);
		list.addAtPosition(50, 5);
		System.out.println("---------List---------");
		list.display();
		list.reverseList();
		System.out.println("----------Reversed List---------");
		list.display();
	}

}
