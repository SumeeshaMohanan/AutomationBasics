package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropDemo {
	public static void main(String[] args) throws InterruptedException {
		String path=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/drag_and_drop");
		driver.navigate().to("https://selenium.obsqurazone.com/drag-drop.php");
		WebElement element = driver.findElement(By.xpath("//*[@id=\"todrag\"]/span[1]"));
		Actions action = new Actions(driver);

		//action.moveToElement(element).click().perform();
		//action.contextClick().perform();
		
		Thread.sleep(3000);
		
		try {
			Actions a = new Actions(driver);
			/*WebElement trialaction = driver.findElement(By.xpath("//*[@id=\"mydropzone\"]"));
			a.doubleClick(trialaction).perform();
			*/

			a.click(element).perform();
			a.clickAndHold(element).build().perform();
			
			Thread.sleep(3000);
			WebElement ele = driver.findElement(By.xpath("//*[@id=\"todrag\"]/span[1]"));
			a.release(ele).build().perform();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
