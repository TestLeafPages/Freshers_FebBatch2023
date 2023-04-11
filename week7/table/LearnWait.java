package table;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnWait {
public static void main(String[] args) {
	//EdgeDriver driver=new EdgeDriver();
	//Load the application url
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	//To maximize the screen
	driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	//Click on Create a new Account button
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
	
	By name = By.name("firstname");
	
	wait.until(ExpectedConditions.elementToBeClickable(name));
	
	
	//Enter first name
	driver.findElement(By.name("firstname")).sendKeys("Test");
	//Enter the surName
	driver.findElement(By.name("lastname")).sendKeys("Leaf");
}
}
