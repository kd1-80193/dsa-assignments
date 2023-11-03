package com.sunbeam;

public class Stack {
	private int top;
	private int[] arr;
	private int SIZE;

	public Stack(int size) {
		this.SIZE = size;
		this.top = -1;
		this.arr = new int[size];
	}

	public void push(int data) {
		if (top == this.SIZE - 1) {
			System.out.println("full");
		}
		top++;
		arr[top] = data;
	}

	public int pop() {
		if (top == -1) {
			return 1;
		}
		int ele = arr[top];
		// System.out.println("Pooped Element = " + ele);
		top--;
		return ele;
	}

	public int peek() {
		int ele = arr[top];
		// System.out.println("Element at top is= " + ele);
		return ele;
	}

	public boolean isFull() {
		if (top == this.SIZE - 1) {
			return true;
		}
		return false;
	}

	public boolean isEmpty() {
		if (top == -1) {
			return true;
		}
		return false;
	}
}
