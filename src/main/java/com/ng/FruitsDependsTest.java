package com.ng;

import org.testng.annotations.Test;

public class FruitsDependsTest {
	@Test(dependsOnMethods= {"cherry"})
	public void mango()
	{
		System.out.println("mango");
	}
	@Test(dependsOnMethods= {"mango"})
	public void apple()
	{
		System.out.println("apple");
	}
	@Test(dependsOnMethods={"apple"})
	public void grapes()
	{
		System.out.println("grapes");
	}
	@Test
	public void cherry()
	{
		System.out.println("cherry");
	}

}



