package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
	public static void main(String[] args) {
		String path=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"\\resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://groceryapp.uniqassosiates.com/sign-in");
		driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).click();
		driver.findElement(By.xpath("//input[@name='email']")).click();
		driver.findElement(By.xpath("//input[@type='text']"));
driver.findElement(By.xpath("//a[@href='http://groceryapp.uniqassosiates.com/sign-up']"));
driver.findElement(By.xpath("//img[@src='http://groceryapp.uniqassosiates.com/public/assets/front/images/logo.png']"));
				
	}
}
