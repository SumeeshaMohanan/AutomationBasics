package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AROMAL\\Desktop\\Obsqura\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// TODO Auto-generated method stub
		driver.get("https://www.google.com/");// opening google in chrome browser
		WebElement p=driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
		p.sendKeys("Selenium");// here we are searching selenium  in google . sendkeys used to enter characters
		//driver.close(); // used to close the browser*/
		//p.click(); // used for blinking cursor or click function
		}

}
