package Test2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//the whole magento registration page done by nagarajan
		 WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();	
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.get("http://magento.com");
			driver.findElement(By.className("fa-user")).click();
			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div/div[2]/div/button")).click();
			driver.findElement(By.id("firstname")).sendKeys("nagarajan");
			driver.findElement(By.id("lastname")).sendKeys("ramamoorthy");
			driver.findElement(By.id("email_address")).sendKeys("nagarajan@gmail.com");
			
			Select country = new Select(driver.findElement(By.id("country")));
			country.selectByIndex(15);
			
			Select companyType = new Select(driver.findElement(By.name("company_type")));
			companyType.selectByValue("development");
			
			Select role = new Select(driver.findElement(By.name("individual_role")));
			role.selectByVisibleText("Business/sales/marketing/merchandising");
			
		
			List<WebElement> totalTextboxes = driver.findElements(By.tagName("input"));
			System.out.println(totalTextboxes.size());
			
			
			
			
			   driver.findElement(By.id("password")).sendKeys("Welcome1");
			   driver.findElement(By.id("confirmation")).sendKeys("Welcome1");
			   if(!driver.findElement(By.id("agree_terms")).isSelected())
			   {
				   driver.findElement(By.id("agree_terms")).click();
			   }
			  
			 
			 
			 
			   
		  


	}

}
