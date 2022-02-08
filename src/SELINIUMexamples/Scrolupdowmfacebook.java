package SELINIUMexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolupdowmfacebook {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\eclipse-workspace\\mouseoperants\\browserdriver\\chromedriver.exe");
    
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	WebElement username =driver.findElement(By.id("email"));
	WebElement password =driver.findElement(By.id("pass"));
	WebElement login =driver.findElement(By.xpath("//button[@type='submit']"));
	
    
	JavascriptExecutor java =(JavascriptExecutor)driver;
	java.executeScript("arguments[0].setAttribute('value','vishalmiten')",username);
	java.executeScript("arguments[0].setAttribute('value','vishalmiten')",password);
	
    Object script=java.executeScript("return arguments[0].getAttribute('value')",password);
	System.out.println(script);
	
	//java.executeScript("argument[0].click()",login);
	

	WebElement scrolldown=driver.findElement(By.linkText("Help"));
	Thread.sleep(4000);
	
	java.executeScript("arguments[0].scrollIntoView(true)",scrolldown);
	Thread.sleep(4000);

	java.executeScript("arguments[0].scrollIntoView(false)",username);

	
	}
}
