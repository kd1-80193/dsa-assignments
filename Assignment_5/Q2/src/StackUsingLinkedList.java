
public class StackUsingLinkedList {

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

//doubly Linear Linked List
	private Node head;
	private Node tail;

	public StackUsingLinkedList() {
		this.head = null;
		this.tail = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void addLast(int value) {
		Node newNode = new Node(value);

		if (isEmpty()) {
			head = tail = newNode;
		} else {
			newNode.prev = tail;
			tail.next = newNode;
			tail = newNode;
		}
	}

	public void deleteLast() {
		if (isEmpty()) {
			System.out.println("List is Empty");
			return;
		} else {
			tail = tail.prev;
			tail.next = null;
		}
	}

	public int getData() {
		return tail.Data;
	}

//stack
	public void push(int data) {
		addLast(data);
	}

	public void pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
		} else {
			int popped = tail.Data;
			System.out.println("popped Element = " + popped);
		}
		deleteLast();
	}

	public void peek() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
		} else {
			System.out.println("Element at Top is = " + tail.Data);
		}
	}

	public void display() {
		Node trav = head;
		while (trav != null) {
			System.out.print(" " + trav.Data);
			trav = trav.next;
		}
		System.out.println();
	}
}
