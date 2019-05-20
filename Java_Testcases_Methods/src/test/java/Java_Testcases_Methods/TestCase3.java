package Java_Testcases_Methods;

import org.openqa.selenium.By;

public class TestCase3 extends Methods {

	public static void main(String[] args) {
	
	// Test Case: Admin Login Functionality with invalid inputs(Negative Test Case)
	// Create object/Instance
	
	TestCase3 obj3 = new TestCase3();
	obj3.LaunchBrowser();
	obj3.adminLogin("admina", "admin@123a");
	
	String ErrorMessage = driver.findElement(By.className("messageStackError")).getText();
	
	if(ErrorMessage.contains("Error: Invalid administrator login attempt.")) {
		
		System.out.println("Handing Invalid inputs -Passed");
	}else {
		
		System.out.println("Not Handing Invalid inputs -Failed");
	}
	obj3.closeBrowser();
	obj3.quitDriver();

	}

}
