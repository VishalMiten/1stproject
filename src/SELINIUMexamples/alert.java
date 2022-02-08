package SELINIUMexamples;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\eclipse-workspace\\Seliniumm\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();;
		
		WebElement displayalert=driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
		displayalert.click();
		
		Alert a =driver.switchTo().alert();
		a.accept();
		
		WebElement alert2 =driver.findElement(By.xpath("(//a[@data-toggle='tab'])[2]"));
		alert2.click();
		WebElement clickbox =driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
        clickbox.click();
        a.accept();
        
		WebElement alert3 =driver.findElement(By.xpath("(//a[@data-toggle='tab'])[3]"));
		alert3.click();
		WebElement clickbox2 =driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		clickbox2.click();
		
		a.getText();
		a.sendKeys("vishal");
		a.accept();

		
		
		
		

        
        
		
		
	}

}
