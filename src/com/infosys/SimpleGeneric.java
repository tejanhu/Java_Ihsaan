package com.infosys;

public class SimpleGeneric<E> {
	private E object;

	public SimpleGeneric(E object) {
		this.object = object;
	}

	public void showObjectType() {
		System.out.println("Object Type is " + object.getClass().getName());
	}

}
