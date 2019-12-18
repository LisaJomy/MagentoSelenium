package Test2;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Redbus {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
	    driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.redbus.in/");
		driver.findElement(By.id("signin-block")).click();
		driver.findElement(By.className("config-options")).click();
		System.out.println(driver.getWindowHandles());
		  Thread.sleep(1000);
		 driver.switchTo().frame(driver.findElement(By.className("modalIframe")));
		 
		 driver.findElement(By.id("mobileNoInp")).sendKeys("8482087000");
		 System.out.println(driver.getTitle());
		  System.out.println(driver.getCurrentUrl());
		 
		 
		 
		 
		/*
		 * driver.findElement(By.id("mobileNoInp")).sendKeys("8482087000");
		 * System.out.println(driver.getTitle());
		 * System.out.println(driver.getCurrentUrl());
		 */
	
		 
		
		

	}

}
