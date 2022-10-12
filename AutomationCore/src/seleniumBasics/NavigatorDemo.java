package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigatorDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AROMAL\\Desktop\\Obsqura\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String path = System.getProperty("user.dir");
		System.out.println(path); 
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		//Navigation Commands
		driver.navigate().to("https://demo.guru99.com/test/newtours/");// navigate from one url to another page from selenium page
		driver.navigate().back();//go back to selenium page
		driver.navigate().forward();//go again to guru99 page
		driver.navigate().refresh();// refresh the guru99 page
		
		
		
	}
}
