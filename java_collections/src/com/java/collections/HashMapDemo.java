package com.java.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo
{
	public static void main(String[] args)
	{
		HashMap<String, Integer> marks = new HashMap<>();
		//HashMap map2 = new HashMap();
		//Map m = new HashMap();
		//HashMap map1 = new HashMap(20);
		//HashMap hmap = new HashMap(20, 0.9f);
		//HashMap newMap = new HashMap(m);
		marks.put("Science", 90);
		marks.put("Maths", 80);
		marks.put("English", 90);
		marks.put("FB",10);
		marks.put("Ea", 10);
		marks.put("Science",10);
		System.out.println(marks.keySet());
		System.out.println(marks);
		
	}

}
