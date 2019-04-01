package com.automation.practice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAnnotations {

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}
	
	@Test
	public void testMethod() {
		System.out.println("First test");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("after method");
	}
}
