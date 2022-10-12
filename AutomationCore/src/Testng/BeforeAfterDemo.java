package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeAfterDemo {
	
	public WebDriver driver;
	
  @BeforeTest
  public void beforeCode() {
	  String path = System.getProperty("user.dir");
	  System.setProperty("webdriver.chrome.driver",path+"\\resources\\chromedriver.exe");
		
	  driver = new ChromeDriver();
		System.out.println("Starting Test On Chrome Browser");
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
  }
  @Test
  public void multipleSelect() {
	  WebElement p=driver.findElement(By.xpath("//*[@id=\"single-input-field\"]"));
		p.sendKeys("Test Message");
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
		driver.findElement(By.id("button-one")).click();
		
  }
  @Test
  public void printMsg() {
	  String s2=driver.findElement(By.xpath("//*[@id=\"message-one\"]")).getText();
		System.out.println(s2);
  }
  
  @Test
  public void sum() {
	  driver.findElement(By.xpath("//*[@id=\"value-a\"]")).sendKeys("25");
		driver.findElement(By.cssSelector("#value-b")).sendKeys("10");
		
		driver.findElement(By.id("button-two")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		String s3=driver.findElement(By.xpath("//*[@id=\"message-two\"]")).getText();
		System.out.println(s3);
  }
  @AfterTest
  public void afterCode() {
	  driver.close();
  }
}
