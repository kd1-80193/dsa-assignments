package com.sunbeam;

public class SinglyLinearLinkedList {
	public class Node {
		private int data;
		private Node next;

		public Node(int value) {
			this.data = value;
			next = null;
		}
	}

	private Node head;
	private Node tail;

	public SinglyLinearLinkedList() {
		head = null;
		tail = null;
	}

	public boolean isEmpty() {
		return this.head == null;
	}

	public void addFirst(int value) {
		Node newNode = new Node(value);
		if (isEmpty()) {
			head = newNode;
			tail = head;
		} else {
			newNode.next = head;
			head = newNode;
		}
	}

	public void addLast(int value) {
		Node newNode = new Node(value);
		if (isEmpty()) {
			head = newNode;
			tail = head;
		} else {
			Node trav = head;
			while (trav.next != null) {
				trav = trav.next;
			}
			trav.next = newNode;
			tail = newNode;
		}
	}

	public void addAtPosition(int value, int pos) {
		Node newNode = new Node(value);
		if (isEmpty()) {
			head = newNode;
			tail = head;
		} else if (pos <= 1) {
			addFirst(value);
		} else {
			Node trav = head;
			for (int i = 1; i < pos - 1 && trav.next != null; i++) {
				trav = trav.next;
			}
			newNode.next = trav.next;
			trav.next = newNode;
		}
	}

	public void deleteFirst() {
		if (isEmpty()) {
			System.out.println("List is Empty");
		} else {
			head = head.next;
		}

	}

	public void deleteLast() {
		if (isEmpty()) {
			System.out.println("List is Empty");
		} else if (head.next == null) {
			head = null;
		} else {
			Node trav = head;
			while (trav.next.next != null) {
				trav = trav.next;
			}
			trav.next = null;
			tail = trav.next;
		}
	}

	public void deleteAtPosition(int pos) {
		if (isEmpty()) {
			System.out.println("List is Empty");
		} else if (pos <= 1) {
			deleteFirst();
		} else if (head.next == null) {
			head = null;
		} else {
			Node trav = head;
			for (int i = 0; i < pos - 1 && trav.next.next != null; i++) {
				trav = trav.next;
			}
			trav.next = trav.next.next;
		}
	}

	public void display() {
		Node trav = head;
		while (trav != null) {
			System.out.println(" " + trav.data);
			// System.out.println(" tail==" + tail.data);
			trav = trav.next;
		}
		System.out.println();
	}

	public void deleteAll() {
		head = null;
	}

}
