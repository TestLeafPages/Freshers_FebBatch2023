package table;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpath {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://erail.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	
	WebElement fromStation = driver.findElement(By.id("txtStationFrom"));
	fromStation.clear();
	fromStation.sendKeys("MAS",Keys.ENTER);
	
	WebElement toStation = driver.findElement(By.id("txtStationTo"));
	toStation.clear();
	toStation.sendKeys("MDU",Keys.ENTER);
	
	
	driver.findElement(By.id("chkSelectDateOnly")).click();
	
	
	List<WebElement> findElements = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr/td[2]"));
	Thread.sleep(3000);
	for (int i = 2; i < findElements.size(); i++) {
		
		String text = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr["+i+"]/td[2]")).getText();
	System.out.println(text);
	}
}
}
