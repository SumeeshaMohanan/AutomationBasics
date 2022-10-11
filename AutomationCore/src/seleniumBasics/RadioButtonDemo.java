package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonDemo {
	public static void main(String arg[]) {
	String path=System.getProperty("user.dir");
	System.setProperty("webdriver.chrome.driver", path+"\\resources\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
	driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
	WebElement radio=driver.findElement(By.xpath("//*[@id=\"inlineRadio2\"]"));
	radio.click();
	if(radio.isSelected()==true)
	{
		System.out.println("RadioButton selected");
		}
	else
	{
		System.out.println("RadioButton is Not selected");
		}


}
}