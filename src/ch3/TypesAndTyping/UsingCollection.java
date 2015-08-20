package ch3.TypesAndTyping;

import java.util.ArrayList;
import java.util.Collection;

public class UsingCollection {
	public static void main(String[] args) {
		ArrayList<String> lst = new ArrayList<String>();
		Collection<String> col = lst;
		
		lst.add("1");
		lst.add("2");
		lst.add("3");
		lst.remove(0);
		col.remove(0);
		
		System.out.println("Added three items, removed two, so 1 item to remain.");
		System.out.println("Number of emements is: " + lst.size());
		System.out.println("Number of emements is: " + col.size());
	}
}
