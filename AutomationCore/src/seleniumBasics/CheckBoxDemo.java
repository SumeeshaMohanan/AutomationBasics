package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxDemo {
	
public static void main(String args[])
{
	String path=System.getProperty("user.dir");
	System.setProperty("webdriver.chrome.driver", path+"\\resources\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
	driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
	WebElement s= driver.findElement(By.xpath("//*[@id=\"gridCheck\"]"));
	
	s.click();
if(s.isSelected()==true)
{
	System.out.println("Checkbox is selected");
	}
else
{
	System.out.println("Checkbox is Not selected");
	}

	}
}