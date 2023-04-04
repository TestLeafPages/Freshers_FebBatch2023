package week7.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class LearnFrame {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/frame.xhtml;jsessionid=node0z35kojmj4f32np99ln7m3uae192939.node0");
		driver.manage().window().maximize();
		//control move to frame
		//driver.switchTo().frame(0);
		WebElement firstFrame = driver.findElement(By.id("Click"));
		firstFrame.click();
		Thread.sleep(1000);
		String text = firstFrame.getText();
		System.out.println(text);
		//control move to main webpage
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(2);
		WebElement frame = driver.findElement(By.id("frame2"));
		driver.switchTo().frame(frame);
		WebElement secondFrame = driver.findElement(By.id("Click"));
		secondFrame.click();
		Thread.sleep(1000);
		String text22 = secondFrame.getText();
		System.out.println("text22  "+text22);
	}

}
