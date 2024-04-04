package com.tnsif.arraylistdemo;
//Ordered 
//
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		List list1=new ArrayList();
		System.out.println(list1.isEmpty());
		list1.add(10);
		list1.add(56);
	
		list1.add("Nayna");
		System.out.println("is data added?"+ list1.add(18.5f));
		list1.add(18.5f);
		list1.add(18.567867d);
		list1.add(true);
		System.out.println(list1);
		int a=list1.size();
		System.out.println(a);
		System.out.println(list1.isEmpty());
		System.out.println(list1.contains("Sirisree"));
		System.out.println(list1.remove(2));
		System.out.println(list1.remove(true));
		System.out.println(list1);
		
		list1.add(null);

		list1.add(null);
		list1.add(3,'A');


		System.out.println(list1.indexOf('A'));
		
	//	Collections.sort(list1);-RTE-ClassCastException
		
		list1.clear();
		System.out.println(list1);
		System.out.println(list1.size());
		
		//Homogeneous data List
		
		List<String> list2=new ArrayList<String>();
		list2.add("Nikesh");
		list2.add("Pranjal");
		list2.add("Sirisree");
		list2.add("Amaan");
		//list2.add(10); //CTE
		System.out.println(list2);
		
		Collections.sort(list2);
		
		Collections.reverse(list2);
		for(String name:list2 )
		{
			System.out.println(name);
		}
		
		
		Iterator<String> i= list2.iterator();
		
		while(i.hasNext())
		{
			String StNames=i.next();
			System.out.println(StNames);
			
			
		}
		
		

	}

}
