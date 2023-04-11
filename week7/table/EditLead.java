package table;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EditLead {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.manage().window().maximize();
		//
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		//
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");

		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();

		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();

		driver.findElement(By.xpath("//a[text()='Leads']")).click();

		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();

		driver.findElement(By.xpath("//input[@name='id']")).sendKeys("10162");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		//Thread.sleep(3000);
		
		WebElement ele = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		
		wait.until(ExpectedConditions.stalenessOf(ele));
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();

		driver.findElement(By.xpath("//a[text()='Edit']")).click();





	}
}
