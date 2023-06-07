package com.java.collections;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapDemo 
{
	public static void main(String[] args)
	{
		IdentityHashMap<Integer, String> m = new IdentityHashMap<>();
		m.put(10, "First");
		m.put(10, "Second");
		System.out.println(m);
		
		
	}

}
