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
		selectcheck.get(0).click();//when we are using the findelements we cannot directly type selectcheck.click()
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


//Another Method
/*
 * driver.get("https://selenium.obsqurazone.com/check-box-demo.php");
		//select one check box first.now select all the checkbox in one go
		WebElement chekBox=driver.findElement(By.id("gridCheck"));
		chekBox.click();
		boolean selected=chekBox.isSelected();
		System.out.println(selected);
		
		List<WebElement> AllCheckBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
	    //System.out.println("Number of Check boxes : "+ Integer.toString(AllCheckBoxes.size()));
	         
	    for(WebElement ele:AllCheckBoxes)
	    {
	    	
	        ele.click();
	    }
	    System.out.println("All check boxes have been checked");
 */
