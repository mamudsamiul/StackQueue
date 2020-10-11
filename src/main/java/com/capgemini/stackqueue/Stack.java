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

}
