package com.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FirstTest {
	
	@Test
	public void test() {
		System.out.println("I am from test 1");
		SoftAssert soft = new SoftAssert(); 
		soft.assertEquals("", "a");
		System.out.println("Post assertion");
		//soft.assertAll();
	}
	
	@Test(dependsOnMethods = {"test"})
	public void test2() {
		System.out.println("Test2");
	}
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("before suite");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("before test");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("before class");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("before method");
	}

}
