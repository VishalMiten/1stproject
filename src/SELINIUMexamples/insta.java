package SELINIUMexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class insta {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\eclipse-workspace\\Seliniumm\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		WebElement findElement = driver.findElement(By.xpath("//input[@name='q']"));
		findElement.sendKeys("how to get peace in life");
		
		WebElement findElement2 = driver.findElement(By.xpath("//input[@name='btnK']"));
		findElement2.click();
}
}
