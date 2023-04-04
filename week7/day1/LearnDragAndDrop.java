package learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class LearnDragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications",
				"--start-maximized","--incognito","--headless");
		
		ChromeDriver driver =  new ChromeDriver(options);
		Actions actions = new Actions(driver); 
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		/*WebElement dragMe = driver.findElement(By.xpath("//p[text()='Drag me around']"));
		actions.dragAndDropBy(dragMe, 100, 50).perform();
		Thread.sleep(5000);
		actions.dragAndDropBy(dragMe, -50, -25).perform();*/
		
		WebElement source = driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
		WebElement target = driver.findElement(By.xpath("//p[text()='Drop here']"));
		actions.dragAndDrop(source, target).perform();

	}

}
