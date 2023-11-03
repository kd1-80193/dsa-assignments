package com.sunbeam;

public class DoublyCircularLinkedList {
	public class Node {
		private int data;
		private Node next;
		private Node prev;

		public Node(int value) {
			this.data = value;
			this.next = null;
			this.prev = null;
		}
	}

	private Node head;

	public DoublyCircularLinkedList() {
		head = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void addAtPosition(int value, int pos) {
		Node newNode = new Node(value);
		if (isEmpty()) {
			head = newNode;
			newNode.next = head;
			newNode.prev = head;
		} else {
			Node trav = head;
			for (int i = 1; i < pos - 1; i++) {
				trav = trav.next;
			}
			newNode.next = trav.next;
			trav.next.prev = newNode;
			newNode.prev = trav;
			trav.next = newNode;
		}
	}

	public void deleteAtPosition(int pos) {
		if (isEmpty()) {
			System.out.println("List is Empty");
			return;
		} else if (head.next == null) {
			head = null;
		} else {
			Node trav = head;
			for (int i = 1; i < pos - 1; i++) {
				trav = trav.next;
			}
			trav.next.next.prev = trav;
			trav.next = trav.next.next;
		}
	}

	public void fDisplay() {
		Node trav = head;
		do {
			System.out.print(" " + trav.data);
			trav = trav.next;
		} while (trav != head);
	}
}
