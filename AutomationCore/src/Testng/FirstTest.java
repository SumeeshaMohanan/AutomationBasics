package Testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTest {
	//@BeforeMethod
		@BeforeTest
		public void beforeTest() {
			 System.out.println("Prerequisite");
		}
	  @Test
	  public void first() {
		 // System.out.println("Prerequisite");
		  System.out.println("Printing first method");
	  }
	  @Test
	  public void second() {
		 // System.out.println("Prerequisite");
		  System.out.println("Second Method");
	  }
	  @Test
	  public void third() {
		 // System.out.println("Prerequisite");
		  System.out.println("Third Method");
	  }
	  @AfterTest
		public void afterTest() {
			 System.out.println("After Execution");
		}
	  
}
