package Test2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//code created by me
   WebDriver driver = new ChromeDriver();
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
   driver.get("http://magento.com");
//   driver.manage().window().maximize();
  // driver.findElement(By.name("q")).sendKeys("selenium");
   driver.findElement(By.xpath("//*[@id=\"block-header\"]/ul/li[9]/a")).click();
  // driver.findElement(By.partialLinkText("Selenium - Web Browser Automation")).click();
		/*
		 * String title = driver.getTitle();
		 * if(title.equals("Selenium - Web Browser Automation")) {
		 * System.out.println("Test Case Successful"); }
		 */
		/*
		 * driver.findElement(By.id("email")).sendKeys("nagarajan@gmail.com");
		 * driver.findElement(By.id("pass")).sendKeys("Welcome");
		 * driver.findElement(By.id("send2")).click();
		 */
   
   driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div[2]/div/button")).click();
   driver.findElement(By.id("firstname")).sendKeys("nagarajan");
   driver.findElement(By.id("lastname")).sendKeys("ramamoorthy");
   driver.findElement(By.id("email_address")).sendKeys("nagarajan@gmail.com");
   
		/*
		 * Select country = new Select(driver.findElement(By.id("country")));
		 * country.deselectByIndex(15);
		 * 
		 * Select type = new Select(driver.findElement(By.id("company_type")));
		 * type.deselectByValue(Deployment);
		 * 
		 * Select role = new Select(driver.findElement(By.id("individual_role")));
		 * role.deselectByVisibleText();
		 */
   
		
		  WebElement element = driver.findElement(By.id("country")); 
		  Select select =new Select(element); 
		  select.selectByVisibleText("Aruba");
		  
		  WebElement element1 = driver.findElement(By.id("customer_company_type"));
		  Select select1 = new Select(element1);
		  select1.selectByVisibleText("Tech Partner");
		  
		 WebElement element2 = driver.findElement(By.id("customer_individual_role"));
		  Select select2 = new Select(element2);
		  select2.selectByVisibleText("Technical/developer");
		 
   
   
   
   
   
   
   
   
   driver.findElement(By.id("password")).sendKeys("Welcome1");
   driver.findElement(By.id("confirmation")).sendKeys("Welcome1");
   driver.findElement(By.id("agree_terms")).click();
  

   
   
   
   
   
}
}