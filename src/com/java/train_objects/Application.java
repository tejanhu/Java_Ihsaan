package com.java.train_objects;


class Toad{
	
	private int id;
	private String name;
	
	
	public Toad(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public String toString() {
		return String.format("%-4d: %s", id, name);
		
	}

//		StringBuilder sb = new StringBuilder();
//		sb.append(id).append(": ").append(name);
//		return sb.toString() ; 
//	}
//	
}



public class Application{
	
	public static void main(String[] args) {
		
		Toad toad1 = new Toad(2,"Kermit");
		Toad toad2 = new Toad(3,"Bob");
		Toad toad3 = new Toad(7,"James");
		System.out.println(toad1);
		System.out.println(toad2);
		System.out.println(toad3);
		
	}
	
}
