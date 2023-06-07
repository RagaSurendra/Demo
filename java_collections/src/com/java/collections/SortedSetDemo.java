package com.java.collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo 
{
	public static void main(String[] args) 
	{
		SortedSet s = new TreeSet();
		
		s.add(5);
		s.add(10);
		s.add(18);
		s.add(4);
		s.add(19);
		System.out.println(s);
		
		System.out.println(s.first());
		
		System.out.println(headSet(3));
		
	}

	private static char[] headSet(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
