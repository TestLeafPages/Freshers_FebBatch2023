package week7.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class LensCart {
	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.lenskart.com/");
		driver.manage().window().maximize();
		
		
		WebElement computerLens = driver.findElement(By.xpath("//a[text()='COMPUTER GLASSES']"));
		WebElement women = driver.findElement(By.xpath("(//span[text()='women'])[2]"));
		
		Actions builder=new Actions(driver);
		
		builder
		.moveToElement(computerLens)
		.moveToElement(women)
		.perform();
		driver.findElement(By.xpath("(//span[text()='PREMIUM RANGE'])[2]")).click();
	
		
	}

}
