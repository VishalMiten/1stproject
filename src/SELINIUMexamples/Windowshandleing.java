package SELINIUMexamples;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Sleeper;

public class Windowshandleing {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\eclipse-workspace\\mouseoperants\\browserdriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		WebElement close = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		close.click();
	    
		WebElement findElement = driver.findElement(By.className("_3704LK"));
		findElement.sendKeys("iphone");
		
		WebElement findElement2 = driver.findElement(By.className("L0Z3Pu"));
		findElement2.click();
		
		Thread.sleep(3000);
		WebElement findElement3 = driver.findElement(By.xpath("//div[@class='_4rR01T']"));
		findElement3.click();
		findElement3.click();
		findElement3.click();
		findElement3.click();

		String parent = driver.getWindowHandle();
		Set<String> child = driver.getWindowHandles();
		List<String> child1=new ArrayList <String>(child);	
		
		//System.out.println(child1.get(2));
		driver.switchTo().window(child1.get(3));
		if(child==child1) {
			System.out.println(child.removeAll(child));
		}
		
		
		
	}

}
