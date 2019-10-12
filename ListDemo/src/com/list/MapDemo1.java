package com.list;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, String> map=new HashMap<String, String>();
		map.put("小明", "合肥");
		map.put("小明1", "合肥1");
		map.put("小明2", "合肥2");
		map.put("小明3", "合肥3");
		map.put("小明5", "合肥5");
		String str=map.get("小明2");
		
		System.out.println(str);
		
	}
	
}
