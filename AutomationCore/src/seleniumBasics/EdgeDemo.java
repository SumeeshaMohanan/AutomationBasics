package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeDemo {
	public static void main(String[] args) {
		String path=System.getProperty("user.dir");
		System.setProperty("webdriver.edge.driver", path+"\\resources\\msedgedriver.exe");
	
		WebDriver driver= new EdgeDriver();//initializing firefox
		driver.get("https://www.google.com/");
	}

}
