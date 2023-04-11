package targetLocators;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapshot {

	public static void main(String[] args) throws IOException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Screenshot

		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Snapsots/Redbus.png");
		FileUtils.copyFile(src, dest);

		// Screenshot of particular Element
		WebElement From = driver.findElement(By.xpath("//input[@id='src']"));
		File src1 = From.getScreenshotAs(OutputType.FILE);
		File dest1 = new File("./Snapsots/element.png");
		FileUtils.copyFile(src1, dest1);

		// Dependency
		/*
		 * <dependency> <groupId>commons-io</groupId>
		 * <artifactId>commons-io</artifactId> <version>2.11.0</version> </dependency>
		 */

	}

}
