package com.sunbeam;

public class Deque {
	DequeUsingDoublyLinear queue;

	public Deque() {
		queue = new DequeUsingDoublyLinear();
	}

	public boolean isEmpty() {
		return queue.isEmpty();
	}

	public void pushFront(int data) {
		queue.addFirst(data);
	}

	public void pushRear(int data) {
		queue.addLast(data);
	}

	public void popFront() {
		queue.deleteFirst();
	}

	public void popRear() {
		queue.deleteLast();
	}

	public void peek() {
		System.out.println("Element at top is = " + queue.getData());
	}
}
