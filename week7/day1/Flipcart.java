package week7.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipcart {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath(" //button[text()='✕']")).click();
	
	driver.findElement(By.name("q")).sendKeys("Mobiles",Keys.ENTER);
	Thread.sleep(3000);
	List<WebElement> mobilePriceList = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
	System.out.println(mobilePriceList.size());
	
	List<Integer> price=new ArrayList<Integer>();
	for (int i = 0; i < mobilePriceList.size(); i++) {
		String text = mobilePriceList.get(i).getText();
		//System.out.println(text);
		String replaceAll = text.replaceAll("[^0-9]", "");
		System.out.println(replaceAll);
		int parseInt = Integer.parseInt(replaceAll);
		
		price.add(parseInt);
	}
	
	System.out.println(price);
	
	Integer min = Collections.min(price);
	System.out.println("min "+min);
	
}
}
