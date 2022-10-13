package seleniumBasics;
import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class DragDrop {

		public static void main(String[] args) {
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\resources\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://the-internet.herokuapp.com/drag_and_drop");
			Actions a = new Actions(driver);
			WebElement from = driver.findElement(By.xpath("//*[@id=\"column-a\"]"));
			WebElement to = driver.findElement(By.xpath("//*[@id=\"column-b\"]"));
			a.dragAndDrop(from, to).build().perform();
			
		
			
			
		}

	}

