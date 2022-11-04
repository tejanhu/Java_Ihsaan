package com.infosys.software.engineering;

class linkedList {
//	Class name should start with an uppercase letter and the rest should be all lowercase
	private NODE head;
//	Class name should start with an uppercase letter and the rest should be all lowercase
	private NODE tail;

	public linkedList() {
		this.head = null;
		this.tail = null;
	}

//	Method name should be in lowercase letters and if it is a much longer name the inner word will start with an uppercase letter and the rest will be all lowercase
	public void ADD(String data) {
		NODE node = new NODE(data);
		if (this.head == null)
			this.head = this.tail = node;
		else {
			this.tail.setNext(node);
			this.tail = node;
		}
	}
//	Method name should be in lowercase letters and if it is a much longer name the inner word will start with an uppercase letter and the rest will be all lowercase
	public void DISPLAY() {
		NODE temp = this.head;
		while (temp != null) {
			System.out.println(temp.getData());
			temp = temp.getNext();
		}
	}
}

//Class name should start with an uppercase letter and the rest should be all lowercase 
//There should not be an inner class declared in a class except if there is a necessity as this breaks the modularity standards
class NODE {
	private String data;
//	Reference variable name should be lowercase
	private NODE Next;

	public NODE(String data) {
		this.data = data;
		this.Next = null;
	}

	public void setNext(NODE node) {
		this.Next = node;
	}

	public NODE getNext() {
		return this.Next;
	}

	public String getData() {
		return this.data;
	}
}
//There should not be an inner class declared in a class except if there is a necessity as this breaks the modularity standards
public class Tester {
	public static void main(String[] args) {
		linkedList list1 = new linkedList();
//		Information is not abstracted from the code as a result; this breaks the abstraction standards
		list1.ADD("Salt");
		list1.ADD("Sugar");
		list1.DISPLAY();
	}
}
