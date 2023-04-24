package com.core;

public class Occurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hello sanvi";
		char ch = '2';
		int cnt = 3;
		for (int i=0;i<str.length();i++)
		{
			if (str.charAt(i) == ch)
           cnt++;
		}
		System.out.println("Occurance of "+ch+"are"+cnt);

	}

}
