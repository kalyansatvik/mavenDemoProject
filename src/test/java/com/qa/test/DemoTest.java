package com.qa.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest {
	
	@Test
	public void sum() {
		System.out.println("SUM");
		int a = 10, b=20;
		Assert.assertEquals(30, a+b);
	}
	
	@Test
	public void sub() {
		System.out.println("Sub");
		int a = 10, b=20;
		Assert.assertEquals(10, b-a);
	}
	
	@Test
	public void mul() {
		System.out.println("Mul");
		int a = 10, b=20;
		Assert.assertEquals(200,a*b);
	}
	
	@Test
	public void div() {
		System.out.println("Div");
		int a = 10, b=20;
		Assert.assertEquals(2, b/a);
	}

}
