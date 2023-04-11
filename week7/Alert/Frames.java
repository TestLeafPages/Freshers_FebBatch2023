package targetLocators;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/frame.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		WebElement frame1 = driver.findElement(By.xpath("//iframe[@src='default.xhtml']"));

		driver.switchTo().frame(frame1);

		driver.findElement(By.xpath("(//button[text()='Click Me'])[1]")).click();
		String text = driver.findElement(By.xpath("//button[text()='Hurray! You Clicked Me.']")).getText();
		System.out.println(text);

		driver.switchTo().defaultContent();

		WebElement nestq = driver.findElement(By.xpath("//iframe[@src='page.xhtml']"));

		driver.switchTo().frame(nestq);
		driver.switchTo().frame("frame2");
		driver.findElement(By.id("Click")).click();

		driver.switchTo().defaultContent();

		WebElement findElement = driver.findElement(By.xpath("//iframe[@src='nested.xhtml']"));
		driver.switchTo().frame(findElement);
		String frameCount = driver.findElement(By.id("Click")).getText();
		System.out.println("Frames Count : " + frameCount);

	}
}
