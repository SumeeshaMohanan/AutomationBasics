package seleniumBasics;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriver {
	
	public static void main(String[] args) {
		String path=System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver", path+"\\resources\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();//initializing
		driver.get("https://www.google.com/");
		driver.close();
	}

}
