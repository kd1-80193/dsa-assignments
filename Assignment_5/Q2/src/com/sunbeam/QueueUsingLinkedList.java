package com.sunbeam;

public class QueueUsingLinkedList {
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
	private Node tail;

	public QueueUsingLinkedList() {
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

	public void fDisplay() {
		Node trav = head;
		System.out.print("Forward : ");
		while (trav != null) {
			System.out.print(" " + trav.data);
			trav = trav.next;
		}
		System.out.println("");
	}

	public int getData() {
		return tail.data;
	}
//	public void addFirst(int data) {
//		Node newNode = new Node(data);
//		if (isEmpty()) {
//			head = newNode;
//			newNode.next = head;
//			newNode.prev = head;
//		} else {
//			newNode.next = head;
//			newNode.prev = head.prev;
//			head.next.prev = newNode;
//			head = newNode;
//		}
//	}
//
//	public void deleteLast() {
//		if (isEmpty()) {
//			System.out.println("List is Empty");
//			return;
//		} else {
//			head.prev.prev.next = head;
//			head.prev.prev = head.prev;
//		}
//	}

}
