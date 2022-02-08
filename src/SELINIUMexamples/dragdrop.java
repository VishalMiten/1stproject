package SELINIUMexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragdrop {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\eclipse-workspace\\Seliniumm\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		
		WebElement bankdrag = driver.findElement(By.xpath("//li[@class='block14 ui-draggable']"));
		WebElement bankdrop = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		
		WebElement drag5k = driver.findElement(By.xpath("//li[@class='block13 ui-draggable']"));
		WebElement drop5k = driver.findElement(By.xpath("//li[@class='placeholder'])[2]"));
		
		WebElement salesdrag = driver.findElement(By.xpath("//li[@class='block15 ui-draggable']"));
		WebElement salesdrop = driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
		
		WebElement drag5k1 = driver.findElement(By.xpath("//li[@class='block13 ui-draggable']"));
		WebElement drop5k1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
		
		
		Actions mouse=new Actions(driver);
		mouse.dragAndDrop(bankdrag,bankdrop).build().perform();
		mouse.dragAndDrop(drag5k, drop5k).build().perform();
		mouse.dragAndDrop(salesdrag, salesdrop).build().perform();
		mouse.dragAndDrop(drag5k1, drop5k1).build().perform();
		
		
	}

}
