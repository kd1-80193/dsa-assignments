package com.sunbeam;

public class SinglyLinearBeforeAfter {
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

	public SinglyLinearBeforeAfter() {
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
			trav = trav.next;
		}
		System.out.println();
	}

	public void addAfter(Node previosNode, int value) {
		Node newNode = new Node(value);

		if (previosNode == null) {
			System.out.println("List is empty");
			return;
		} else {
			newNode.next = previosNode.next;
			previosNode.next = newNode;
		}
	}

	public void addBefore(Node nextNode, int value) {
		Node newNode = new Node(value);
		if (head == null) {
			head = newNode;
			return;
		}
		if (nextNode == null) {
			System.out.println("Next node cannot be null.");
			return;
		}
		if (isEmpty()) {
			System.out.println("List is empty");
			return;
		} else if (nextNode == head) {
			newNode.next = head;
			head = newNode;
		} else {
			Node trav = head;
			while (trav.next != nextNode) {
				trav = trav.next;
			}
			newNode.next = nextNode;
			trav.next = newNode;
		}
	}

	public void addB() {
		addBefore(head, 100);
		addBefore(head, 200);

	}

	public void addA() {
		addAfter(head.next, 300);
	}

	public void deleteAll() {
		head = null;
	}

}
