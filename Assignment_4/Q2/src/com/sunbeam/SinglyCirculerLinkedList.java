package com.sunbeam;

public class SinglyCirculerLinkedList {
	public class Node {
		private int data;
		private Node next;

		public Node(int value) {
			this.data = value;
		}
	}

	private Node tail;

	public SinglyCirculerLinkedList() {
		tail = null;
	}

	public boolean isEmpty() {
		return tail == null;
	}

	public void addFirst(int value) {
		Node newNode = new Node(value);
		if (isEmpty()) {
			tail = newNode;
			tail.next = tail; // tail
		} else {
			newNode.next = tail.next;
			tail.next = newNode;
			tail = newNode;
		}
	}

	public void addLast(int value) {
		Node newNode = new Node(value);
		if (isEmpty()) {
			tail = newNode;
			newNode.next = newNode;
		} else {
			newNode.next = tail.next;
			tail.next = newNode;
			tail = newNode;
		}
	}

	public void addAtPosition(int value, int pos) {
		Node newNode = new Node(value);
		if (isEmpty()) {
			tail = newNode;
			newNode.next = newNode;
		} else if (pos == 1) {
			addFirst(value);
		} else {
			Node trav = tail.next;
			for (int i = 1; i < pos - 1 && trav.next != tail; i++) {
				trav = trav.next;
			}
			newNode.next = trav.next;
			trav.next = newNode;
		}

	}

	public void deleteAtPosition(int pos) {
		if (isEmpty()) {
			System.out.println("List is Empty");
		} else if (tail.next == tail) {
			tail = null;
		} else if (pos == 1) {
			deleteFirst();
			return;
		} else {
			Node trav = tail.next;
			for (int i = 1; i < pos - 1; i++) {
				trav = trav.next;
			}
			trav.next = trav.next.next;
		}
	}

	public void deleteFirst() {
		if (isEmpty()) {
			System.out.println("List is Empty");
		} else {
			tail.next = tail.next.next;
		}
	}

	public void deleteLast() {
		if (isEmpty()) {
			System.out.println("List is Empty");
		}

		else if (tail == tail.next) {
			tail = null;
		} else {
			Node trav = tail.next;
			while (trav.next != tail) {
				trav = trav.next;
			}
			trav.next = tail.next;
			tail = trav;
		}
	}

	public void display() {
		Node trav = tail.next;
		do {
			System.out.println(" " + trav.data);
			trav = trav.next;
		} while (trav != tail.next);
	}

//	public void s() {
//		Node trav = tail;
//		do {
//			System.out.println("" + trav.next.data);
//			trav = trav.next;
//		} while (trav != tail);
//	}
}
