package Test2;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switchto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://www.naukri.com");
		System.out.println(driver.getWindowHandles());
		
		  String parent = driver.getWindowHandle();
		  
		  Set <String> winds =driver.getWindowHandles();
		  driver.switchTo().window(winds.toArray()[3].toString());
		  
		  for(int i=1; i<winds.size();i++)
		  
		  { driver.switchTo().window(winds.toArray()[i].toString());
		  if(driver.getTitle().toLowerCase().contains("amazon"))
		  	{ 
			  break; 
		  	} 
		  }
		  driver.findElement(By.xpath("/html/body/a/img")).click();
		  System.out.println(driver.getTitle());
		  System.out.println(driver.getCurrentUrl());
		  driver.close();
		  
		  driver.switchTo().window(winds.toArray()[0].toString());
		  driver.switchTo().window(parent);
		  
		 
		
		
		
		
		
		
	}
	

}
