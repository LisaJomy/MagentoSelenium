package Test2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Spicejet {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		/*
		 * driver.get("https://www.spicejet.com/");
		 * driver.findElement(By.id("highlight-book"));
		 * driver.findElement(By.className("text-label")).click();
		 * driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		 * 
		 * driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click(
		 * ); driver.findElement(By.linkText("Chennai (MAA)")).click();
		 * Thread.sleep(1000);
		 * 
		 * driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).
		 * clear();
		 * driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).
		 * sendKeys("blr");
		 * 
		 * driver.findElement(By.xpath(
		 * "//*[@id=\"ui-datepicker-div\"]/div[2]/table/tbody/tr[3]/td[2]/a")).click();
		 * Thread.sleep(1000);
		 * 
		 * driver.findElement(By.xpath("//*[@id=\"Div1\"]/button")).click();
		 * driver.findElement(By.xpath(
		 * "//*[@id=\"ui-datepicker-div\"]/div[2]/table/tbody/tr[3]/td[2]/a")).click();
		 * 
		 * 
		 */
		
		
		
		
		
		
		  driver.get("http://www.spicejet.com");
		  driver.findElement(By.id("highlight-book"));
		  driver.findElement(By.className("text-label")).click();
		  driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		  driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click(); 
		  driver.findElement(By.linkText("Kochi (COK)")).click();
		  
		  Thread.sleep(1500);
		  driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).
		  clear();
		  driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).
		  sendKeys("del");
		  
		  
		  
		  driver.findElement(By.xpath(
		  "//*[@id=\"ui-datepicker-div\"]/div[2]/table/tbody/tr[3]/td[3]/a")).click();
		  Thread.sleep(1000);
		  
		  driver.findElement(By.xpath("//*[@id=\"Div1\"]/button")).click();
		  driver.findElement(By.xpath(
		  "//*[@id=\"ui-datepicker-div\"]/div[2]/table/tbody/tr[3]/td[3]/a")).click();
		  
		  Thread.sleep(2000);
		  driver.findElement(By.className("paxinfo")).click();
		  driver.findElement(By.id("hrefIncAdt")).click();
		  driver.findElement(By.id("hrefIncInf")).click();
		  
		  driver.findElement(By.id("btnclosepaxoption")).click();
		    
		  Thread.sleep(2000);

		   Select currency = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		   currency.selectByValue("AED");
		  
		  
		  
		 
		
		
		
		
		
		
		
		
	}

}
