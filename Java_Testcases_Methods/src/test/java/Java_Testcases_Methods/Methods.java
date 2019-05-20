package Java_Testcases_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Methods {

	//public static WebDriver driver = new ChromeDriver();
	
	public static WebDriver driver;
	
	//----------------Method1--------------------------
	
	// Launch Browser
	public void LaunchBrowser( ) {
		
		driver = new ChromeDriver();
		
	}
	
	//----------------Method2-------------------
	
	// Here we are doing Method Overloading
	//Without Parameters (No-ARG)
	// Admin Login
	public void adminLogin() { 
		
		driver = new ChromeDriver();
		driver.get("http://www.gcrit.com/build3/admin/");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin@123");
		driver.findElement(By.id("tdb1")).click();
		
	}	
	
	//---------------Method3------------------------------
	
	//With Parameters (With-ARG)	
		public void adminLogin(String username, String password) { 
			
			driver = new ChromeDriver();
			driver.get("http://www.gcrit.com/build3/admin/");
			driver.findElement(By.name("username")).sendKeys("username");
			driver.findElement(By.name("password")).sendKeys("password");
			driver.findElement(By.id("tdb1")).click();
		
	}
		
	//---------------Methods4-----------------
		
		// If not null driver close Method
		public void closeBrowser() {
			
			if(! driver.toString().contains("null")) {
				driver.close();
				
			}
			
		}
		
		
	//-----------Methods5-------------------    
         public void quitDriver() { 
            driver.quit();
         }
		
		

	//-------------RUN_ALL_Methods----------
		
		// Here we run our test	
	public static void main(String[] args) throws InterruptedException {
		
		Methods obj = new Methods();
		obj.LaunchBrowser();
		obj.adminLogin();
		obj.closeBrowser();
		obj.quitDriver();
		obj.LaunchBrowser();
		obj.adminLogin("admin", "admin@123");
		obj.closeBrowser();
		obj.quitDriver();
		
		
	
	}

}
