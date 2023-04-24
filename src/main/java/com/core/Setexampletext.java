package com.core;

import java.util.HashSet;
import java.util.Set;

public class Setexampletext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set <String> se=new HashSet<String>();
		se.add("dog");
		se.add("cat");
		se.add("fox");
		se.add("horse");System.out.println(se);
		se.add("cat");
		se.add("fox");
		System.out.println(se);
		

	}

}
