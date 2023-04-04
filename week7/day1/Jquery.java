package week7.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Jquery {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/draggable/");
		driver.manage().window().maximize();
		//control move to frame
		WebElement ele = driver.findElement(By.id("draggable"));
	
		Actions builder=new Actions(driver);
		builder.dragAndDropBy(ele, 0, 70).perform();
	}

}
