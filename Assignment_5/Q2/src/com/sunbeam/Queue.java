package com.sunbeam;

public class Queue {
	QueueUsingLinkedList list;

	public Queue() {
		list = new QueueUsingLinkedList();
	}

	public boolean isEmpty() {
		return list.isEmpty();
	}

	public void push(int data) {
		list.addFirst(data);
	}

	public void pop() {
		list.deleteLast();
	}

	public void peek() {
		System.out.println("Element at top is = " + list.getData());
	}

}
