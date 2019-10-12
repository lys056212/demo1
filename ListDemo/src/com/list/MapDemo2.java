package com.list;

import java.util.HashMap;
import java.util.Map;

public class MapDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<String, String>();
		map.put("小明", "合肥");
		map.put("小明1", "合肥1");
		map.put("小明2", "合肥2");
		map.put("小明3", "合肥3");
		map.put("小明5", "合肥5");
		if (map.containsKey("小明5")) {
			System.out.println("存在");
		} else {
			System.out.println("不存在");
		}
		if (map.containsValue("合肥1")) {
			System.out.println("存在");
		}else {
			System.out.println("不存在");
		}
			
	}

}
