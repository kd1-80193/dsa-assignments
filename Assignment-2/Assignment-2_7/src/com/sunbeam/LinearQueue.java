package com.sunbeam;

import java.util.Scanner;

public class LinearQueue {
	private int arr[];
	private int front;
	private int rear;
	private final int SIZE;

	public LinearQueue(int size) {
		super();
		rear = 0;
		front = 0;
		SIZE = size;
	}

	public void push(int data) {
		rear++;
		arr[rear] = data;
	}

	public int pop() {
		front++;
		return arr[front];
	}

	public int peek() {
		return arr[front + 1];
	}

	public boolean isEmpty() {
		return front == rear;
	}

	public boolean isFull() {
		return rear == SIZE - 1;
	}

	static int menu() {
		System.out.println("0. Exit");
		System.out.println("1. Push");
		System.out.println("2. Pop");
		System.out.println("3. Peek");
		System.out.print("Enter your choice: ");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		return choice;
	}

	public static void main(String[] args) {
		LinearQueue l = new LinearQueue(4);
		Scanner sc = new Scanner(System.in);
		int choice;
		while ((choice = menu()) != 0) {
			switch (choice) {
			case 1:
				if (l.isFull()) {
					System.out.println("Queue is full");
				} else {
					System.out.print("Enter data: ");
					int data = sc.nextInt();
					l.push(data);
				}
				break;
			case 2:
				if (l.isEmpty()) {
					System.out.println("Queue is empty");
				} else {
					int popedData = l.pop();
					System.out.println("Poped data: " + popedData);

				}
				break;
			case 3:
				if (l.isEmpty()) {
					System.out.println("Queue is empty");
				} else {
					int peekedData = l.peek();
					System.out.println("Peeked data: " + peekedData);

				}

				break;
			}
		}
	}

}
