package Test2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class ProfilePage {	
	public static void main(String[] args) {
		
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.google.com");//given url
			
//If the hacker has hacked the site we need to always validate the Url
	
	System.out.println(driver.getCurrentUrl());//validated the URL
	//some systems like banking we cannot view page source
	//selenium provides a method to view page source
	
	//System.out.println(driver.getPageSource());
	driver.get("http://www.amazon.com");
	driver.navigate().back();
	driver.navigate().forward();
	driver.close();//closes the current browser we r working on
	driver.quit();//closes all the browsers opened by selenium script
	
	
	
	
}

}



