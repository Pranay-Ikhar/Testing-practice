package Hexaware_First_Project;

import org.testng.annotations.Test;

public class Priority {

	
	@Test()
	public void test()
	{
	System.out.println("Verify Test");
	}
	@Test(priority=0)
	public void odd()
	{
	System.out.println("Addition");
	}
	@Test(priority=2)
	public void Division()
	{
	System.out.println("Division");
	}
	@Test()
	public void Multiplication()
	{
	System.out.println("Multilication");
	}
	
}
