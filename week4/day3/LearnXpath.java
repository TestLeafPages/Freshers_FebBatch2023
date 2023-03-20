package week4.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnXpath {
public static void main(String[] args) throws InterruptedException {
	
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	ChromeDriver driver=new ChromeDriver(options);
	
	driver.get("http://leaftaps.com/opentaps/control/main");
	
	driver.manage().window().maximize();
	
	
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input@id='password']")).sendKeys("crmsfa");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();

    driver.close();
}
}
