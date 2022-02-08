package SELINIUMexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sonainstagram {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\eclipse-workspace\\mouseoperants\\browserdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		
		WebElement findElement = driver.findElement(By.xpath("//input[@name='username']"));
		findElement.sendKeys("dfv");
		WebElement findElement1 = driver.findElement(By.id("Password"));
		findElement1.sendKeys("sdf");

		
		
		
		
	}


}
