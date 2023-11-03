
public class Stack {
	private StackUsingLinkedList list;

	public Stack() {
		list = new StackUsingLinkedList();
	}

	public boolean isEmpty() {
		return list.isEmpty();
	}

	public void push(int data) {
		list.addLast(data);
	}

	public void pop() {
		list.deleteLast();
	}

	public void peek() {
		System.out.println("Element at top is = " + list.getData());
	}
}
