package seleniumBasics;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class BrowserDemo {

	static String browser;
	public void checkBrowser(String browser)
	{
		if(browser.equalsIgnoreCase("Chrome"))
		{
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\resources\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();//initializing chrome
			driver.get("https://www.google.com/");
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{

			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.gecko.driver", path+"\\resources\\geckodriver.exe");
			WebDriver driver= new FirefoxDriver();//initializing chrome
			driver.get("https://www.google.com/");
		}
		else if(browser.equalsIgnoreCase("edge")) 
		{
			String path=System.getProperty("user.dir");
		System.setProperty("webdriver.edge.driver", path+"\\resources\\msedgedriver.exe");
			WebDriver driver= new EdgeDriver();
			driver.get("https://www.google.com/");
			
		}
	}
	
	public static void main(String[] args) 
	{
		BrowserDemo t=new BrowserDemo();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Browser");
		browser=scan.nextLine();
		t.checkBrowser(browser);
	}

}
