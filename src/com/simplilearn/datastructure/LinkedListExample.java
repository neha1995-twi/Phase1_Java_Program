package com.simplilearn.datastructure;

public class LinkedListExample {

	Node head;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static LinkedListExample insert(LinkedListExample list, int data) {

		Node new_node = new Node(data);

		if (list.head == null) {
			list.head = new_node;
		} else {
			Node last = list.head;
			while (last.next != null) {
				last = last.next;
			}
			last.next = new_node;
		}

		return list;
	}

	public static LinkedListExample deleteByKey(LinkedListExample list, int key) {
		Node currNode = list.head;
		Node prev = null;
		if(currNode !=null && currNode.data == key) {
			list.head = currNode.next;
			System.out.println(key + " Found and dleted");
			return list;
		}
		while(currNode !=null && currNode.data !=key) {
			prev = currNode;
			currNode = currNode.next;
		}
		if(currNode !=null) {
			prev.next = currNode.next;
			System.out.println(key + " Found and dleted");
		}
		if(currNode == null) {
			System.out.println(key + " Not Found");
		}
		return list;
	}

	public static void printList(LinkedListExample list) {
		Node temp = list.head;
		while(temp != null) {
			System.out.print(temp.data);
			temp = temp.next;
		}
		
	}

	public static void main(String[] args) {
		LinkedListExample list = new LinkedListExample();
		LinkedListExample.insert(list, 1);
		LinkedListExample.insert(list, 5);
		LinkedListExample.insert(list, 3);
		LinkedListExample.insert(list, 2);
		LinkedListExample.insert(list, 4);
		
		LinkedListExample.printList(list);
		System.out.println("===============");
		LinkedListExample.deleteByKey(list, 1);
		LinkedListExample.printList(list);
		System.out.println("===============");
		LinkedListExample.deleteByKey(list, 2);
		
		LinkedListExample.printList(list);
		System.out.println("==============");
		LinkedListExample.deleteByKey(list, 9);
		
		
	}

}
