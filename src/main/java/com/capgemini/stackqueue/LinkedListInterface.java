package com.capgemini.stackqueue;

public interface LinkedListInterface<K> {
	public void addNode(Node node);

	public void print();

	public void append(Node node);

	public void insertAtMiddle(Node node);

	public void insertBetween(Node preNode, Node postNode, Node node);

	public void pop();

	public void popLast();

	public Node findNode(K data);

	public void deleteNode(K data);

	public int size();
}

