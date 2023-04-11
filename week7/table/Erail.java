package table;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Erail {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://erail.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	//Enter from station
	WebElement from = driver.findElement(By.id("txtStationFrom"));
	from.clear();
	from.sendKeys("MAS",Keys.ENTER);
	//Enter Destination
	WebElement to = driver.findElement(By.id("txtStationTo"));
	to.clear();
	to.sendKeys("MDU",Keys.ENTER);
	
	//click on sort on date
	driver.findElement(By.id("chkSelectDateOnly")).click();
	
	//to get the train number list
List<WebElement> trainNumber = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr/td[1]"));
	
System.out.println(trainNumber.size());
	
	for (int i = 0; i < trainNumber.size(); i++) {
		String text = trainNumber.get(i).getText();
		System.out.println(text);
	}
	
			
	
}
}
