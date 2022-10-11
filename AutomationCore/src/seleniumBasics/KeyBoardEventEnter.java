package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBoardEventEnter {

	public static void main(String[] args) {
		String path=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"\\resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		WebElement element= driver.findElement(By.xpath("//*[@id=\"value-a\"]"));
		WebElement element2= driver.findElement(By.xpath("//*[@id=\"value-b\"]"));
		element.sendKeys("25");
		element2.sendKeys("10");
		
		WebElement element3= driver.findElement(By.xpath("//*[@id=\"button-two\"]"));
		element3.sendKeys(Keys.ENTER);
		element.sendKeys(Keys.CLEAR);
	}

}
