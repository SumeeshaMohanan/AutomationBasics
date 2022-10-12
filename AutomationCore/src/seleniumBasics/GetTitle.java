package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {
	public static void main(String[] args) {
		String path=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"\\resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/javascript-alert.php");
		String title = driver.getTitle();
		System.out.println("Title of the page is " + title);
		driver.close();
}
}
