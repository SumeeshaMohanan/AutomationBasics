package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	public static void main(String[] args) {
	String path=System.getProperty("user.dir");
	System.setProperty("webdriver.chrome.driver", path+"\\resources\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.guru99.com/test/upload/");
	WebElement uploadbtn=driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]"));
	uploadbtn.sendKeys("C:\\Users\\AROMAL\\Desktop\\Obsqura\\MANUAL TESTING.pdf");
	driver.findElement(By.xpath("//*[@id=\"terms\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"submitbutton\"]")).click();
}
}