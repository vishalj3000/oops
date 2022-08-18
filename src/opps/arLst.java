package opps;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arLst {

	
	
	void first()
	{
		List<Integer> s1 = new ArrayList<Integer>();
		s1.add(12);
		s1.add(21);
		s1.add(2);
		System.out.println(s1);
	}
	
	void second()
	{
		ArrayList<String> s1 = new ArrayList<String>();
		s1.add("hello");
		s1.add("Anil");
		s1.add("jadhav");
		System.out.println(s1);
	}
	
	void third()
	{
		ArrayList<Integer> s1 = new ArrayList<Integer>();
		s1.add(1);
		s1.add(2);
	    s1.add(3);
	    System.out.println(s1);
	}
	
	void four() {
		
		ArrayList<String> s1 = new ArrayList<String>()
				
				{{
					add("one");
					add("two");
					add("three");
				}};
				System.out.println(s1);
		
	}
	
	void five()
	{
	ArrayList<Integer> i = new ArrayList<Integer>(Arrays.asList(1,4,5,6,7));
	System.out.println(i);
	
	
	}
	
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arLst obj = new arLst();
		obj.first();
		obj.second();
		obj.third();
		obj.four();
		obj.five();
	}

}
