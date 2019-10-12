package com.list;

import java.util.List;
import java.util.Vector;

public class VectorDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String>lists=new Vector<String>();
		lists.add("A");
		lists.add("B");
		for (int i = 0; i < lists.size(); i++) {
			System.out.println(lists.get(i));
		}
	}

}
