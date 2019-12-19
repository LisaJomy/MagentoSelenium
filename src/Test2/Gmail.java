package Test2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Gmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().fullscreen();
	    driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://gmail.com");
		//Added
		String url=driver.getCurrentUrl();
		System.out.println("The current url is:" +url);
		driver.findElement(By.id("identifierId")).sendKeys("lisajocelinjoyal07"+Keys.ENTER);
	    driver.findElement(By.name("password")).sendKeys("Pudukad@123"+Keys.ENTER);
	    Actions act = new Actions(driver);
	    act.dragAndDrop(driver.findElement(By.className("xT")),driver.findElement(By.linkText("Starred"))).build().perform();
	    
	}

}
