package windowHandling;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	
	
	
	public static void main(String[] args) {
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Cycle",Keys.ENTER);
		driver.findElement(By.xpath("(//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2']/a)[2]")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String>cycle= new ArrayList<String>(windowHandles);
		driver.switchTo().window(cycle.get(1));
		String text = driver.findElement(By.id("productTitle")).getText();
		
		System.out.println(text);
		
		driver.close();
		driver.switchTo().window(cycle.get(0));
		String title = driver.getTitle();
		
		System.out.println(title);
		
		
		
		
		
		
		
		
	}

}
