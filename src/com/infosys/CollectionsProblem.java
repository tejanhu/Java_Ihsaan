package com.infosys;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class CollectionsProblem {

	public static void main(String[] args) {

		List<String> alist = new ArrayList<>();
		alist.add("Tom");
		alist.add("Yanick");
		alist.add("Kinneh");
		alist.add("Mahamadou");

		ListIterator<String> iterator = alist.listIterator();
		while (iterator.hasNext()) {
			String names = iterator.next();
//			System.out.println(names);
		}
		while (iterator.hasPrevious()) {
			String previousNames = iterator.previous();
			System.out.println(previousNames);
		}

		LinkedList<String> namesLlist = new LinkedList<String>();

		namesLlist.add("Tom");
		namesLlist.add("Yanick");
		namesLlist.add("Kinneh");
		namesLlist.add("Mahamadou");

		for (String item : namesLlist) {
			System.out.println(item);
		}

		namesLlist.remove(namesLlist.getFirst());
		namesLlist.remove(namesLlist.getLast());
		
		for (String item : namesLlist) {
			System.out.println(item);
		}
		
		namesLlist.addFirst("Quinoa");
		namesLlist.addLast("Joan");
		
		for (String item : namesLlist) {
			System.out.println(item);
		}
		
		
		
		
		
	}

}
