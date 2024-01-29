package Hexaware_First_Project;

import java.util.List;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FirstPractice {

	public static void main(String[] args) throws InterruptedException {
		
	
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91797\\eclipse-workspace\\Test_Practice\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		WebElement sel1 = driver.findElement(By.xpath("//select[@name=\"country\"]"));
		Select sel=new Select(sel1);
		sel.selectByIndex(20);
		Thread.sleep(2000);
		sel.selectByVisibleText("INDIA");
		Thread.sleep(2000);
		sel.selectByVisibleText("BAHAMAS");
		Thread.sleep(2000);

		sel.selectByVisibleText("CHINA");
		Thread.sleep(2000);



		sel.selectByValue("AUSTRIA");
 
		List<WebElement>   li=   sel.getAllSelectedOptions();
		int count=li.size();
		/*for(int i=0;i<count;i++)
		{
			WebElement element= li.get(i);
			 System.out.println(element.getText());
		}*/
			}
		 
		}
