package targetLocators;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertConcept {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// simple Alert
		driver.findElement(By.xpath("//span[text()='Show']")).click();

		Alert simple = driver.switchTo().alert();
		Thread.sleep(600);
		String text = simple.getText();
		System.out.println(text);

		simple.accept();

		// confirm dialog
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		Alert confirmAlert = driver.switchTo().alert();

		String text2 = confirmAlert.getText();
		confirmAlert.accept();
		System.out.println("Confirm Alert " + text2);
		String text3 = driver.findElement(By.xpath("//span[@id='result']")).getText();
		System.out.println(text3);

		// prompt
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		Alert alertprompt = driver.switchTo().alert();
		alertprompt.sendKeys("Test Leaf");
		alertprompt.accept();
		String textprompt = driver.findElement(By.xpath("//span[@id='confirm_result']")).getText();
		System.out.println(textprompt);
		// sweet alert
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[3]")).click();
		String text4 = driver.findElement(By.xpath("//div[@class='ui-dialog-content ui-widget-content']//p")).getText();
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[4]")).click();
		System.out.println("Sweetalert " + text4);
		// sweetmodelDialog
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[5]")).click();
		String text5 = driver.findElement(By.xpath("//p[@class='m-0']")).getText();
		System.out.println("sweetmodal " + text5);
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();

		// sweet alert delete
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		String textSweetConfirm = driver.findElement(By.className("ui-confirm-dialog-message")).getText();
		System.out.println("Sweet Alert Confirm :" + textSweetConfirm);
		driver.findElement(By.xpath("//span[text()='Yes']")).click();

	}

}
