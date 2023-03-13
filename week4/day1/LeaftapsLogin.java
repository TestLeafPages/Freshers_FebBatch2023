package week4.day1;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LeaftapsLogin {
public static void main(String[] args) throws InterruptedException, SecurityException, IOException {
	EdgeDriver driver=new EdgeDriver();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	//Enter the username as Demosalesmanager 
	driver.findElement(By.id("username")).sendKeys("democsr");
	//Enter the password as crmsfa
	driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
	//click on Login button
	driver.findElement(By.className("decorativeSubmit")).click();
	//To verify Home page
	
	FileHandler obj=new FileHandler();
	String text = driver.findElement(By.tagName("h2")).getText();
	System.out.println(text);
	
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("abcd");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("ram");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("charan");
	driver.findElement(By.className("smallSubmit")).click();
	
	String actualResult="View Lead";
	
	String expectedResult = driver.getTitle();
	
	if(actualResult.equals(expectedResult)) {
		System.out.println("Create lead created successfully");
	}else {
		System.out.println("Create lead not created successfully");
	}
	
	throw new RuntimeException();
}
}
