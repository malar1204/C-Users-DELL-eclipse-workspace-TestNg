package org.task;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProTestNg {
	@BeforeClass
	private void beforeclass() {
	System.out.println("Before Class");
	}
	@BeforeMethod
	private void beforeMethod() {
		System.out.println("Before Method");

	}
	@AfterMethod
	private void afterMethod() {
		System.out.println("After Method");
		

	}
	@AfterClass
	private void afterClass() {
		System.out.println("After Class");
	}
	@Test
	private void tc0() {
		System.out.println("Method 1");
	}
@Test
private void tc01() {
	System.out.println("Method 2");
	
}
@Test
private void tc02() {
	System.out.println("Method 3");
	
}
}
