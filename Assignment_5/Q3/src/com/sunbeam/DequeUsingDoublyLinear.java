package com.sunbeam;

public class DequeUsingDoublyLinear {
	public class Node {
		private Node next;
		private Node prev;
		private int Data;

		public Node(int value) {
			this.Data = value;
			next = null;
			prev = null;
		}
	}

	private Node head;
	private Node tail;

	public DequeUsingDoublyLinear() {
		head = null;
		tail = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void addFirst(int value) {

		Node nn = new Node(value);
		if (isEmpty())
			head = tail = nn;
		else {
			nn.next = head;
			head.prev = nn;
			head = nn;
		}
	}

	public void addLast(int value) {
		Node newNode = new Node(value);
		if (isEmpty()) {
			head = tail = newNode;
		} else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
		}
	}

	public void deleteFirst() {
		if (isEmpty())
			return;
		else {
			head = head.next;
			head.prev = null;
		}
	}

	public void deleteLast() {
		if (isEmpty())
			return;
		else if (head.next == null)
			head = tail = null;
		else {
			tail = tail.prev;
			tail.next = null;
		}
	}

	public int getData() {
		return tail.Data;
	}

	public void display() {
		Node trav = head;
		while (trav != null) {
			System.out.print(" " + trav.Data);
			trav = trav.next;
		}
	}
}
