package week5.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
public static void main(String[] args) throws InterruptedException {
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	ChromeDriver driver=new ChromeDriver(options);
	driver.get("https://leafground.com/select.xhtml");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	//Select the value from DropDown with select tag
	WebElement selectLanguage = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
	Select dropDown=new Select(selectLanguage);
	dropDown.selectByVisibleText("Playwright");
	
	
	//select country
	driver.findElement(By.xpath("//label[text()='Select Country']")).click();
	driver.findElement(By.xpath("//li[text()='India']")).click();
	
	
	//select cities
	Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Select City']")).click();
		driver.findElement(By.xpath("//li[text()='Chennai']")).click();
		
		driver.findElement(By.xpath("//label[text()='Select Language']")).click();
		Thread.sleep(5000);
		List<WebElement> findElements = driver.findElements(By.xpath("(//div[@class='ui-selectonemenu-items-wrapper'])[2]//li"));
		System.out.println(findElements.size());
		for (int i = 0; i < findElements.size(); i++) {
			String text = findElements.get(i).getText();
			System.out.println(text);
		}
		
		
		
}


}
