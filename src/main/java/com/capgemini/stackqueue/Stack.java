package com.capgemini.stackqueue;

public class Stack<K> {
	private final LinkedList<K> linkedList;

	public Stack() {
		this.linkedList = new LinkedList<K>();
	}

	public void push(Node<K> node) {
		linkedList.addNode(node);
	}

	public void printStack() {
		linkedList.print();
	}

	public Node<K> peak() {
		return linkedList.getHead();
	}

	public void pop() {
		if (!isEmpty())
			linkedList.pop();
		else
			System.out.println("Stack is empty");
	}

	public boolean isEmpty() {
		if (linkedList.size() == 0)
			return true;
		else
			return false;
	}

	public int size() {
		return linkedList.size();
	}

}
