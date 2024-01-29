package Hexaware_First_Project;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

		public class TestNGFirstPractice {
		@Test
		public void test1() {
			System.out.println("Test 1");
		}
		@Test
		public void test2() {
			System.out.println("Test 2");
		}
		
		@BeforeMethod
		public void beforeMethod() {
			System.out.println("Before Method");
		}
		@AfterMethod
		public void afterMethod() {
			System.out.println("After Method");
		}
		@BeforeTest
		public void beforetest() {
			
				System.out.println("Before test");
			
		}
		@AfterTest
		public void aftertest() {
			System.out.println("After Test");
		}
}
