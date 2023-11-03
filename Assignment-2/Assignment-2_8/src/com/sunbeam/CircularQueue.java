package com.sunbeam;

import java.util.Scanner;

public class CircularQueue {

	private int front;
	private int rear;
	private final int SIZE;
	private int arr[];

	public CircularQueue(int size) {
		front = -1;
		rear = -1;
		SIZE = size;
		arr = new int[SIZE];
	}

	public void push(int data) {
		rear = (rear + 1) % SIZE;
		arr[rear] = data;
	}

	public int pop() {
		front = (front + 1) % SIZE;
		return arr[front];
	}

	public int peek() {
		return arr[front];
	}

	public boolean isEmpty() {
		return front == rear && rear == -1;
	}

	public boolean isFull() {
		return (front == rear && rear != -1) || (front == -1 && rear == SIZE - 1);
	}

	static int menu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("0. Exit");
		System.out.println("1. Push");
		System.out.println("2. Pop");
		System.out.println("3. Peek");
		System.out.print("Enter your choice: ");
		int choice = sc.nextInt();
		return choice;
	}

	public static void main(String[] args) {

		int choice, count = 0;
		CircularQueue q = new CircularQueue(4);
		Scanner sc = new Scanner(System.in);
		while ((choice = menu()) != 0) {
			switch (choice) {
			case 1:
				if (q.isFull()) {
					System.out.println("Queue is full.");
				} else {
					System.out.print("Enter data: ");
					int data = sc.nextInt();
					q.push(data);
					count++;
					System.out.println("count: "+count);
					
				}
				break;
			case 2:
				if (q.isEmpty()) {
					System.out.println("Queue is empty.");
				} else {
					int poppedData = q.pop();
					System.out.println("Popped out data: " + poppedData);
					count--;
					System.out.println("count: "+count);
				}
				break;
			case 3:
				if (q.isEmpty()) {
					System.out.println("Queue is empty.");
				} else {
					int peekedData = q.pop();
					System.out.println("Peeked data: " + peekedData);
				}
				break;
			}
		}

	}

}
