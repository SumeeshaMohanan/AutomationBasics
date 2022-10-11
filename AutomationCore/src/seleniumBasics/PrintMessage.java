package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintMessage {
	public static void main(String[] args) {
		String path = System.getProperty("user.dir");
		
		System.setProperty("webdriver.chrome.driver",path+"\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		WebElement p=driver.findElement(By.id("single-input-field"));
		p.sendKeys("Test Message");
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
		driver.findElement(By.id("button-one")).click();
		String s2=driver.findElement(By.xpath("//*[@id=\"message-one\"]")).getText();
		System.out.println(s2);
				driver.findElement(By.xpath("//*[@id=\"value-a\"]")).sendKeys("25");
		driver.findElement(By.cssSelector("#value-b")).sendKeys("10");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		driver.findElement(By.id("button-two")).click();
		String s3=driver.findElement(By.xpath("//*[@id=\"message-two\"]")).getText();
		System.out.println(s3);
		}
}
