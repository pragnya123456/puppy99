package learningTestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Test2 {
	@BeforeClass
	public void BC()
	{
		System.out.println("Before Class");
	}
	@BeforeMethod
	public void BM()
	{
		System.out.println("Before Method");
	}
	@org.testng.annotations.Test
	public void Test()
	{
		System.out.println("Hello");
	}
	@org.testng.annotations.Test
	public void Test1()
	{
		System.out.println("Hi");
	}
	@AfterMethod
	public void AM()
	{
		System.out.println("After method");
	}
}
