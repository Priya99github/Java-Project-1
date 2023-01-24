package com.velocity.git;

import java.util.Iterator;
import java.util.LinkedList;

public class List {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(12);
		list.add(11);
		list.add(14);
		list.add(13);
		list.add(16);
		list.add(15);
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()) {
			 Integer next =itr.next();
			System.out.println(itr.next());
			System.out.println(next);
			System.out.println();
			
		}
		

	}

}
