package SELINIUMexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class frames {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\eclipse-workspace\\mouseoperants\\browserdriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames");
		driver.manage().window().maximize();
		
		
		driver.switchTo().frame("frame1");
		driver.switchTo().frame("frame3");
		WebElement findElement = driver.findElement(By.id("a"));
		findElement.click();
		driver.switchTo().parentFrame();
		WebElement findElement2 = driver.findElement(By.xpath("//b[@id='topic']/following-sibling::input"));
		findElement2.sendKeys("miten");
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame2");
		WebElement findElement3 = driver.findElement(By.id("animals"));
		Select option=new Select(findElement3);
		option.selectByVisibleText("Avatar");
		
		
	}

}
