package Test2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switchtoalerlecho {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://www.echoecho.com/javascript4.htm");
		
		
		 driver.findElement(By.name("B1")).click();
		 System.out.println(driver.switchTo().alert().getText());
		 
		 driver.switchTo().alert();
		 Thread.sleep(5000);
		 driver.switchTo().alert().accept();
		 
		 driver.findElement(By.name("B2")).click();
		 System.out.println(driver.switchTo().alert().getText());
		 
		 driver.switchTo().alert();
		 Thread.sleep(5000);
		 driver.switchTo().alert().accept();
		 
		 driver.findElement(By.name("B3")).click();
		 System.out.println(driver.switchTo().alert().getText());
		 
		 driver.switchTo().alert().sendKeys("lisa");
		 Thread.sleep(5000);
		 driver.switchTo().alert().accept();//to click the ok button
		 
		 driver.switchTo().alert().dismiss();
		 //driver.switchTo().alert().dismiss() ---to click cancel
		 driver.quit();
		 
		 
		 }

}
