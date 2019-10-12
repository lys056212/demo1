package com.list;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<String, String>();
		map.put("小明", "合肥");
		map.put("小明1", "合肥1");
		map.put("小明2", "合肥2");
		map.put("小明3", "合肥3");
		map.put("小明5", "合肥5");
//		Set<String> set=map.keySet();
//		Iterator<String> it=set.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
//		
		Collection<String> c=map.values();
		Iterator<String> it=c.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
	}

}
