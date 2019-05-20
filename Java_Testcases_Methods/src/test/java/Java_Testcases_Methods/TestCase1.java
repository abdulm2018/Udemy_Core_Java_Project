package Java_Testcases_Methods;

import org.openqa.selenium.By;

public class TestCase1 extends Methods {

	public static void main(String[] args) {
		
		// Test Case: Redireect to user Interface from Admin Interface
		// Create Object/Instance
		
		TestCase1 object = new TestCase1();
		object.LaunchBrowser();
		object.adminLogin();
		driver.findElement(By.linkText("Online Catalog")).click();
	//-----------------------------------------------------------------------------	
		String url = driver.getCurrentUrl();
		
		if(url.equals("http://www.gcrit.com/build3/")) {
			
			System.err.println("Redireect to user Interface -Passed");
		}
		else {
			System.err.println("Redireect to user Interface -Failed");	
			
		}
	//-----------------------------------------------------------------------------	
		object.closeBrowser();
		
	}

}
