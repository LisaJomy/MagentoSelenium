package Test2;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();	
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.get("https://netbanking.hdfcbank.com");
			
		
		  //footer is a frame
		  driver.switchTo().frame(driver.findElement(By.name("footer")));
		  
		  
		  driver.findElement(By.linkText("Terms and Conditions")).click();
		  driver.switchTo().defaultContent(); Set <String> winds =
		  driver.getWindowHandles();
		  driver.switchTo().window(winds.toArray()[1].toString());
		  driver.findElement(By.partialLinkText("NETBANKING")).click();
		  driver.switchTo().window(winds.toArray()[0].toString());
		  driver.switchTo().frame(driver.findElement(By.name("login_page")));
		  driver.findElement(By.name("fldLoginUserId")).sendKeys("12345");
		  driver.findElement(By.xpath(
		  "/html/body/form/table[2]/tbody/tr/td[2]/table/tbody/tr[1]/td[1]/table/tbody/tr[3]/td[2]/table/tbody/tr[6]/td[2]/a/img"
		  )).click(); driver.switchTo().defaultContent();
		 
	}
	

}
