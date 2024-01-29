package Hexaware_First_Project;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPractice {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91797\\eclipse-workspace\\Test_Practice\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();

		driver.findElement(By.name("cusid")).sendKeys("123");

		driver.findElement(By.linkText("Double-Click Me To See The Alert")).click();

		Alert a=driver.switchTo().alert();

		System.out.println(a.getText());

	}

}
