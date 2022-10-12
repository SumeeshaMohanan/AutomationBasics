package seleniumBasics;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class DragDrop {

		public static void main(String[] args) {
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\resources\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://selenium.obsqurazone.com/index.php");
			driver.navigate().to("https://selenium.obsqurazone.com/drag-drop.php");
		
			/*Actions a = new Actions(driver);
			WebElement from = driver.findElement(By.xpath("//*[@id=\"todrag\"]/span[1]"));
			WebElement to = driver.findElement(By.xpath("//*[@id=\"mydropzone\"]"));
			//a.dragAndDrop(from, to).build().perform();
			Action dragAndDrop = a.clickAndHold(from).moveToElement(to).build();
			dragAndDrop.perform();
			*/
			
			
		}

	}

