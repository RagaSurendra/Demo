package com.java.collections;

public class AnonymousArray {

	public static void main(String[] args) 
	{
		sum(new int[] {1,2,3});
	}
	
	private static void sum(int[] is)
	{
		int total = 0;
		for(int e: is)
		{
			total = total + e;
		
		}
		
		System.out.println(total);
		
	}

}
