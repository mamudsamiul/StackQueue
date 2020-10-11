package com.capgemini.stackqueue;
public class LinkedList<K> implements LinkedListInterface<K> {
	private Node<K> head;
	private Node<K> tail;
	private int counter;

	public LinkedList() {
		this.head = null;
		this.tail = null;
	}

	public Node<K> getHead() {
		return this.head;
	}

	public Node<K> getTail() {
		return this.tail;
	}

	@Override
	public void addNode(Node node) {
		if (this.tail == null)
			this.tail = node;
		if (this.head == null)
			this.head = node;
		else {
			Node tempNode = this.head;
			this.head = node;
			this.head.setNext(tempNode);
		}
		counter++;
	}

	@Override
	public void print() {
		System.out.println("Printing the linked list");
		Node temp = this.head;
		while (temp.getNext() != null) {
			System.out.print(temp.getKey());
			System.out.print(" -> ");
			temp = temp.getNext();
		}
		System.out.println(temp.getKey());
	}

	@Override
	public void append(Node node) {
		if (this.tail == null)
			this.tail = node;
		if (this.head == null)
			this.head = node;
		else {
			this.tail.setNext(node);
			this.tail = node;
		}
		counter++;
	}

	@Override
	public void insertAtMiddle(Node node) {
		Node tempHead = this.head;
		Node tempNode;
		for (int i = 1; i < counter / 2; i++) {
			tempHead = tempHead.getNext();
		}
		tempNode = tempHead.getNext();
		tempHead.setNext(node);
		node.setNext(tempNode);
	}

	@Override
	public void insertBetween(Node preNode, Node postNode, Node node) {
		preNode.setNext(node);
		node.setNext(postNode);
	}

	@Override
	public void pop() {
		this.head = head.getNext();
	}

	@Override
	public void popLast() {
		Node tempNode = this.head;
		while (tempNode.getNext() != this.tail) {
			tempNode = tempNode.getNext();
		}
		this.tail = tempNode;
		tail.setNext(null);
	}

	@Override
	public Node findNode(K data) {
		Node tempNode = this.head;
		while (tempNode.getKey() != data) {
			tempNode = tempNode.getNext();
			if (tempNode == null)
				return null;
		}
		return tempNode;
	}

	@Override
	public void deleteNode(K data) {
		Node searchNode = this.head;
		Node tempNode;
		while (searchNode.getNext().getKey() != data && searchNode.getNext() != null) {
			searchNode = searchNode.getNext();
		}
		tempNode = searchNode.getNext().getNext();
		searchNode.setNext(tempNode);
	}

	@Override
	public int size() {
		int counter = 1;
		Node tempNode = this.head;
		while (tempNode.getNext() != null) {
			counter++;
			tempNode = tempNode.getNext();
		}
		if (head == null)
			return 0;
		else
			return counter;
	}

}
