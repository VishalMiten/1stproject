package SELINIUMexamples;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class methods {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\eclipse-workspace\\Seliniumm\\Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		//driver.get("https://www.zomato.com/");
	   String url="https://www.instagram.com/";
	   driver.navigate().to(url);
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
	//	WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		username.sendKeys("vishalmiten");
		
		Actions copy=new Actions(driver);
	    copy.doubleClick(username).build().perform();
	    copy.contextClick(username).build().perform();
	    
	    
	    Robot keyboard =new Robot();
	    for (int i = 0; i <=5; i++) {
		    keyboard.keyPress(KeyEvent.VK_DOWN);
		    keyboard.keyRelease(KeyEvent.VK_DOWN);
	    }		
	    
	    keyboard.keyPress(KeyEvent.VK_ENTER);
	    keyboard.keyRelease(KeyEvent.VK_ENTER);
	    
	    keyboard.keyPress(KeyEvent.VK_TAB);
	    keyboard.keyRelease(KeyEvent.VK_TAB);
	    
	    keyboard.keyPress(KeyEvent.VK_CONTROL);
	    keyboard.keyPress(KeyEvent.VK_V);
	    
	    keyboard.keyRelease(KeyEvent.VK_CONTROL);
	    keyboard.keyRelease(KeyEvent.VK_V);
	    
	    
	}

}

	