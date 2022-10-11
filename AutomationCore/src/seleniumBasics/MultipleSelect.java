package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelect {

	public static void main(String[] args) {
		String path=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"\\resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/select-input.php");
		WebElement element=driver.findElement(By.xpath("//*[@id=\"multi-select-field\"]"));
		//element.click();
		Select select = new Select(element);
		select.selectByIndex(1);
		select.selectByIndex(2);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		select.deselectByIndex(1);//here we are disselecting the index 1 item .
		// disselect is used in multiple selection
	
		
		
	}

}
