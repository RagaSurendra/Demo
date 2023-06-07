package com.java.collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class CursorListItrDemo 
{
	public static void main(String[] args)
	{
		ArrayList<String> data = new ArrayList<>();
		
		data.add("Ben");
		data.add("Bheem");
		data.add("Sita");
		
		System.out.println(data);
		
		ListIterator li = data.listIterator();
		
		while(li.hasNext())
		{
			String item = (String)li.next();
			
			if(item.equals("jai"))
			{
				li.add("veeru");
			}
			
			if(item.equals("Sita"))
			{
				li.remove();
			}
			
			if(item.equals("Bheem"))
			{
				li.set("Bheem");
			}
			
			System.out.println(data);
		}
		
	}
	
	

}
