package Test2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Spicejetcalandar {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.spicejet.com");
		//round trip button
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		//inspect of from
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='MAA']")).click();
		
		//driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1")).clear();
		 driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		driver.findElement(By.xpath("(//a[@value='DEL'])[2]")).click();
		//depart date
		WebElement db=driver.findElement(By.xpath("//button[@class='ui-datepicker-trigger']"));
		Actions a = new Actions(driver);
		a.moveToElement(db).doubleClick().build().perform();
		WebElement da=driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div[1]/table[1]/tbody[1]/tr[5]/td[5]/a"));
		a.moveToElement(da).click().build().perform();
		
		Thread.sleep(2000);
		//return date
		WebElement db1=driver.findElement(By.xpath("//*[@id=\"Div1\"]/button"));
		//WebElement db1=driver.findElement(By.id("ctl00_mainContent_view_date2"));
		//WebElement db1=driver.findElement(By.xpath("//button[@class='ui-datepicker-trigger']"));
		
		Actions a1 = new Actions(driver);
		a1.moveToElement(db1).doubleClick().build().perform();
		WebElement da1=driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div[1]/table[1]/tbody[1]/tr[2]/td[4]/a"));
		a1.moveToElement(da1).click().build().perform();
		  Thread.sleep(2000);
		  //passengers
		  driver.findElement(By.id("divpaxinfo")).click(); // here we only click but don't select
		  WebElement element1 = driver.findElement(By.id("ctl00_mainContent_ddl_Adult"));
		  Select select1 = new Select(element1);
		  select1.selectByVisibleText("3");

		  WebElement element2 = driver.findElement(By.id("ctl00_mainContent_ddl_Child"));
		  Select select2 = new Select(element2);
		  select2.selectByVisibleText("2");
		  
		  WebElement element3 = driver.findElement(By.id("ctl00_mainContent_ddl_Infant"));
		  Select select3 = new Select(element3);
		  select3.selectByVisibleText("1"); 
		  //currency
		  //driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).click();
		  WebElement element4 = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		   Select currency = new Select(element4);
		   currency.selectByValue("AED");
	}
	
	
	
	//*[@id="Div1"]/button
	
	//*[@id="Div1"]/button


	/*WebElement element1 = driver.findElement(By.id("ctl00_mainContent_ddl_Adult"));
	  Select select1 = new Select(element1);
	  select1.selectByVisibleText("Tech Partner");*/






}
	
		
		
		
		
		
		
		
		
		
		
		
		
		

	


