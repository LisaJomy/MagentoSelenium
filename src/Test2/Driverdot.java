package Test2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driverdot {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		
		//Done by nagarajan about all the driver actions performed on the website
		
		 WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		   driver.get("http://google.com");
		   String url=driver.getCurrentUrl();
		   System.out.println(url);
		   if(url.startsWith("https"))
			   System.out.println("Secured");
		   if(url.contains(".in")|| url.contains("in."))
		       System.out.println("Localized");
		   
		   String title=driver.getTitle();
		   System.out.println(title);
		   driver.navigate().back();
		//driver.navigate().forward();
		driver.navigate().refresh();
		driver.navigate().forward();
	
		
		
		

	}

}
