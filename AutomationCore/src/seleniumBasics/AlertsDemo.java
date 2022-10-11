package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsDemo {

	public static void main(String[] args) {
		String path=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"\\resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/javascript-alert.php");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[1]/div/div[2]/button")).click();
		driver.switchTo().alert().accept();//for click ok in the browser alert
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div/div[2]/p[4]/button")).click();
		driver.switchTo().alert().dismiss();//for click Cancel in the browser alert
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[3]/div/div[2]/button")).click();
		driver.switchTo().alert().sendKeys("Sumeesha");//for enter text in the browser alert
		driver.switchTo().alert().accept();//for click ok in the browser alert

	}

}
