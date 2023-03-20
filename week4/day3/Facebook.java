package week4.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Facebook {
public static void main(String[] args) {
	
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	ChromeDriver driver=new ChromeDriver(options);
	
	driver.get("https://www.facebook.com/");
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	
	driver.findElement(By.name("firstname123")).sendKeys("Kabilan");
	
	driver.findElement(By.name("lastname")).sendKeys("I");
}
}
