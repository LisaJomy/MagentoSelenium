package Test2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keysupdowncapital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();	
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 driver.get("http://gmail.com");
		 Actions act= new Actions(driver);
		 act.keyDown(Keys.SHIFT).build().perform();
	     driver.findElement(By.id("identifierId")).sendKeys("lisajocelinjoyal");
	     act.keyUp(Keys.SHIFT).build().perform();
	}

}
