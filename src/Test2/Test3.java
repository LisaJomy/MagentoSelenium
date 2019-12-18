package Test2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//code by the teacher for Magento
		 WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();	
			 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			 driver.get("http://magento.com");
		
		  driver.findElement(By.className("fa-user")).click();
		  driver.findElement(By.id("email")).clear();
		  driver.findElement(By.id("email")).sendKeys(Keys.ENTER);
		  driver.findElement(By.name("login[password]")).clear();
		  driver.findElement(By.name("login[password]")).sendKeys("Welcome");
		  driver.findElement(By.id("send2")).click();
		  
		  //to test the error message with actual in the screen and expected what we
		 // get from the requirement 
		  String actual_error
		  =driver.findElement(By.className("error-msg")).getText();
		  
		  String expected_error ="Invalid login or password.";
		  if(actual_error.equals(expected_error)) {
		  System.out.println("Test case Passed");
		  } else {
		  System.out.println("Test case failed"); 
		  }
		  driver.quit();
		 
	}

}
