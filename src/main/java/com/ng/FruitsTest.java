package com.ng;

import org.testng.annotations.Test;

public class FruitsTest {
	@Test(priority=4)
	public void mango()
	{
		System.out.println("mango");
	}
	@Test(priority=3)
	public void apple()
	{
		System.out.println("apple");
	}
	@Test(priority=2)
	public void grapes()
	{
		System.out.println("grapes");
	}
	@Test(priority=1)
	public void cherry()
	{
		System.out.println("cherry");
	}

}
