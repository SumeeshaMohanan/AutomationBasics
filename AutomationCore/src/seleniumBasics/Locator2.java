package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AROMAL\\Desktop\\Obsqura\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/");
		WebElement p=driver.findElement(By.name("userName"));
		p.sendKeys("User");
		driver.findElement(By.name("password")).sendKeys("User");
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//driver.findElement(By.name("submit")).click();
		//driver.findElement(By.linkText("SIGN-ON")).click();// click on the sign-on link using the text displayed
		driver.findElement(By.partialLinkText("SIGN")).click();// click on the sign-on link using the partialtext displayed
		}
}
