package com.sunbeam;

public class LinearQueue {
	private int front;
	private int rear;
	private int arr[];
	private int size;

	public LinearQueue(int size) {
		this.size = size;
		this.arr = new int[size];
		this.front = 0;
		this.rear = 0;
	}

	public void add(int data) {
		arr[rear] = data;
		if (rear >= size)
			System.out.println("Queue is full");
		else
			rear++;
	}

	public void remove() {
		arr[front] = -1;

		if (rear == front)
			System.out.println("Queue is empty");
		else
			front++;
	}

	public int peek() {
		if (rear == front)
			return 1;
		else
			return arr[front];

	}

	public boolean isFull() {
		if (rear == size) {
			return true;
		} else
			return false;
	}

	public boolean isEmpty() {
		if (rear == 0) {
			return true;
		} else
			return false;
	}
}
