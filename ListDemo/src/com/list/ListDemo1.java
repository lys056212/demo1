package com.list;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> lists=new ArrayList<String>();
		lists.add("A");
		lists.add("B");
		lists.add("A");
		for (int i = 0; i < lists.size(); i++) {
			System.out.println(lists.get(i));
			
		}
		lists.remove(0);
		System.out.println("删除之后----");
		for (int i = 0; i < lists.size(); i++) {
		
			System.out.println(lists.get(i));
		}
		
		System.out.println(lists.isEmpty());
		//indexof返回的是元素的索引
		System.out.println("B是否存在"+lists.indexOf("c"));
		
		

	}

}
