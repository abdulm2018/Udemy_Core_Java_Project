package Java_Testcases_Methods;

public class TestCase2 extends Methods{

	public static void main(String[] args) {
		
	//Test Case: Admin login Functionality with valid input(Positive Test Case)
	// Create Object/Instance
		
		TestCase2 obj2 = new TestCase2();
		obj2.LaunchBrowser();
		obj2.adminLogin();
		
		String url = driver.getCurrentUrl();
		
		if(url.contains("http://www.gcrit.com/build3/admin/index.php")) {
			
			System.out.println("Admin Login Successful -Passed");
		}else {
			
			System.out.println("Admin Login Unsuccessful -Failed");
		}
		obj2.closeBrowser();
		

	}

}
