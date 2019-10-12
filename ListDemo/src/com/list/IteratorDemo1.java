package com.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List lists = new ArrayList();
		lists.add("A");
		lists.add("B");
		lists.add("C");
		lists.add("D");
		lists.add("E");
		lists.add("F");
		Iterator it = lists.iterator();
		while (it.hasNext()) {
			String str=(String) it.next();
			if("A".equals(str)) {
				it.remove();
			}else {
				System.out.println(str);
			}
			
		}

	}
/**
 * 
 */
}
