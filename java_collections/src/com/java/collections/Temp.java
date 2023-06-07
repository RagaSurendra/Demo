package com.java.collections;

public class Temp 
{
	public String toString()
	{
		return "temp";
	}
	
	public void finalize()
	{
		System.out.println("Finalize method called");
	}

}
