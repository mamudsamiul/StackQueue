package com.capgemini.stackqueue;

public class Queue<K> {
	private final LinkedList<K> linkedList;

	public Queue() {
		this.linkedList = new LinkedList<K>();
	}

	public void enQueue(Node<K> node) {
		linkedList.append(node);
	}

	public void deQueue() {
		if (!isEmpty())
			linkedList.popLast();
		else
			System.out.println("Queue is empty");

	}

	public int size() {
		return linkedList.size();
	}

	public boolean isEmpty() {
		if (linkedList.size() == 0)
			return true;
		else
			return false;
	}

	public void printQueue() {
		linkedList.print();
	}
}
