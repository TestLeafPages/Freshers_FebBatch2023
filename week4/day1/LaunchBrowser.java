package week4.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser {
public static void main(String[] args) {
	
	//ChromeDriver driver=new ChromeDriver();
	//Download the driver and set the path also launch edge browser
	EdgeDriver driver=new EdgeDriver();
	//Load the application url
	driver.get("https://www.facebook.com/login/");
	//To maximize the browser
	driver.manage().window().maximize();
	
}
}
