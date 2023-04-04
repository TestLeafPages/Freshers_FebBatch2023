package learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class LearnActionClass {
//package p
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver =  new ChromeDriver(options);
		Actions actions = new Actions(driver); 
		
		driver.get("https://www.myntra.com/");
		WebElement men = driver.findElement(By.xpath("//a[text()='Men']"));
		WebElement smartWearable = driver.findElement(By.xpath("//a[text()='Smart Wearables']"));
		
		actions.moveToElement(men).perform();
		actions.click(smartWearable).perform();
			// syntax for actions class
	/*	driver.get("https://leafground.com/menu.xhtml");
//		WebElement clickButton = driver.findElement(By.xpath("//span[text()='Click']"));
//		actions.click(clickButton).perform();
		
		WebElement successButton = driver.findElement(By.xpath("//span[text()='Success']"));
		String beforeOver = successButton.getCssValue("background-color");
		System.out.println("Before mouse over" + beforeOver);
		actions.moveToElement(successButton).perform();
		String afterOver = successButton.getCssValue("background-color");
		System.out.println("After mouse over" + afterOver);
		if(beforeOver.equals(afterOver)) {
			System.out.println("color not changed");
		}else {
			System.out.println("Color changed");
		}
		
		WebElement heading = driver.findElement(By.xpath("//h5[text()='Mouse over and confirm the color changed']"));
		actions.doubleClick(heading).perform();
		
		
		*/
		
		
		
		

	}

}
