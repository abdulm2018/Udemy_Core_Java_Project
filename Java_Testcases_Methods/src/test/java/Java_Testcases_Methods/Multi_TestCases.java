package Java_Testcases_Methods;

import org.openqa.selenium.By;

public class Multi_TestCases extends Methods {

	public static void main(String[] args) {
		
		// Test Case 1: Redireect to user Interface from Admin Interface
		//Test Case 2: Admin login Functionality with valid input(Positive Test Case)
		//Test Case 3: Admin Login Functionality with invalid inputs(Negative Test Case)
		
		//Create Object/Instance
		
		Multi_TestCases obj4 = new Multi_TestCases();
//--------------------------------------------------------------------------------------------------		
		// Test Case 1: Redireect to user Interface from Admin Interface
		
		obj4.LaunchBrowser();
		obj4.adminLogin();
		driver.findElement(By.linkText("Online Catalog")).click();
	//-----------------------------------------------------------------------------	
		String url = driver.getCurrentUrl();
		
		if(url.equals("http://www.gcrit.com/build3/")) {
			
			System.err.println("Test Case 1: -Redireect to user Interface -Passed");
		}
		else {
			System.err.println("Test Case 1: -Redireect to user Interface -Failed");	
			
		}
	//-----------------------------------------------------------------------------	
		obj4.closeBrowser();
//----------------------------------------------------------------------------------------------------		
	
	//Test Case 2: Admin login Functionality with valid input(Positive Test Case)	
		
	obj4.LaunchBrowser();
	obj4.adminLogin();
	
	String url2 = driver.getCurrentUrl();
	
	if(url2.contains("http://www.gcrit.com/build3/admin/index.php")) {
		
		System.out.println("Test case 2: Admin Login Successful -Passed");
	}else {
		
		System.out.println("Test case 2: Admin Login Unsuccessful -Failed");
	}
	obj4.closeBrowser();
	
//----------------------------------------------------------------------------------------------------					

    //Test Case 3: Admin Login Functionality with invalid inputs(Negative Test Case)
	
	obj4.LaunchBrowser();
	obj4.adminLogin("admina", "admin@123a");
	
	String ErrorMessage = driver.findElement(By.className("messageStackError")).getText();
	
	if(ErrorMessage.contains("Error: Invalid administrator login attempt.")) {
		
		System.out.println("Test Case 3: Handing Invalid inputs -Passed");
	}else {
		
		System.out.println("Test Case 3: Not Handing Invalid inputs -Failed");
	}
	obj4.closeBrowser();
	obj4.quitDriver();

	}
	
}

	
	


