package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxMultipleSelection {

	public static void main(String[] args) {
		String path=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"\\resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/check-box-demo.php");
		List<WebElement> selectcheck = driver.findElements(By.className("check-box-list"));
		selectcheck.get(0).click();//when we are using the findelemnts we cannot directly type selectcheck.click()
		//we have to first mention the index and then click.
		for(int i=0; i<selectcheck.size(); i++)//here we are traversing through the chekboxes
		{
		 if(selectcheck.get(i).isDisplayed() && selectcheck.get(i).isEnabled()&& selectcheck.get(i).isSelected()==false)
		 {
			 selectcheck.get(i).click();
		 }
		
		}
	}

}
