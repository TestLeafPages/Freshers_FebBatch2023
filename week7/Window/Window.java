package windowHandling;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window {

	public static void main(String[] args) throws IOException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/window.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='Open']")).click();

		String win = driver.getWindowHandle();
		System.out.println(win);

		Set<String> windowHandles = driver.getWindowHandles();
		List<String> gg = new ArrayList<String>(windowHandles);
		driver.switchTo().window(gg.get(1));

		driver.findElement(By.xpath("//input[@placeholder='E-mail Address']")).sendKeys("Vinoth@gmail.com");

		driver.close();
		driver.switchTo().window(gg.get(0));
		String title = driver.getTitle();
		System.out.println(title);

		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();

		Set<String> windowHandles2 = driver.getWindowHandles();
		List<String> variable = new ArrayList<String>(windowHandles2);
		driver.switchTo().window(variable.get(1));
		driver.close();

		int size = variable.size();
		System.out.println(size);

		driver.switchTo().window(variable.get(size - 1));

		driver.close();

		driver.switchTo().window(variable.get(0));
		driver.close();

	}

}
