package com.core;

import java.util.ArrayList;
import java.util.List;

public class Listexampletext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> li=new ArrayList<String>();
		li.add("sanvi");
		li.add("samhi");
		li.add("sai");
		li.add("krishna");
		System.out.println(li);
		li.add("sanvi");
		li.add("samhi");
		System.out.println(li);
		System.out.println(li.get(3));

	}

}
