package code1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgExample extends Login {
    
	
	
	
	@Test(priority = 2)
	public void TestExample() {
		
		System.out.println("this is Test rexample");
	}
	
	
	@BeforeSuite
	public void BeforeSuitExample() {
		System.out.println("example of a beforesuit");
	}
	
	@AfterSuite
	public void AfterSuitExample() {
		
		System.out.println("this is aftersuit example");
	}
	
	
	
	@BeforeTest
	public void BeforeTestExample() {
		
		System.out.println("this is beforetest Example");
	}
	
	
	@BeforeClass
	public void BeforeClassExample() {
		
		System.out.println("this is beforeclass Example");
	}
	
	
	
	@AfterClass
	public void AfterClassExample() {
		
		System.out.println("this is Afterclass Example");
	}
	
	
	
	
	@AfterTest
	public void AfterTestExample() {
		
		System.out.println("this is AfterTest Example");
	}
	
	
	
	
	@BeforeMethod
	public void BeforeMethodExample() {
		
		System.out.println("this is beforeMethod Example");
	}
	
	
	@Test (priority = 1)
	public void TestExamplePriority(){
         System.out.println("priority need to  check");
	}
	
	
}
