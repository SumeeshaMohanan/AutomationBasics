package seleniumBasics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingDemo {
	public static void main(String[] args) {
		String path=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"\\resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/window-popup.php");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[1]/div/div[2]/a")).click();
		String w1=driver.getWindowHandle();
	
		Set<String> s1 = driver.getWindowHandles();
		for (String s : s1) {
		   
		    driver.switchTo().window(s);
		
		}

		
	driver.close();
	driver.switchTo().window(w1);
		
	}

}
