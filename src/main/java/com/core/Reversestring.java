package com.core;

import java.util.HashMap;

public class Reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name1="HELLO KRISHNA";
		System.out.println(name1.length());
		char ch[]=name1.toCharArray();
		for (int i=ch.length-1;i>=0;i--)
		{
			System.out.println(ch[i]);
		}
		
		String name2="Hello Rama";
		String words[]=name2.split("\\s");
		    String reverseWord="";  
		    for(String w:words){  
		        StringBuilder sb=new StringBuilder(w);  
		        sb.reverse();  
		        reverseWord+=sb.toString()+" ";  
		    }  
		  System.out.println("Word in reverse:::"+reverseWord.trim());
	}
}