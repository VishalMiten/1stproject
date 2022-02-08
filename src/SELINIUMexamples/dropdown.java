package SELINIUMexamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
	public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\eclipse-workspace\\mouseoperants\\browserdriver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.guru99.com/test/newtours/register.php");
	driver.manage().window().maximize();
	
	WebElement dropdown = driver.findElement(By.xpath("//select[@name='country']"));
	
	
	Select anyone=new Select(dropdown);
	anyone.selectByIndex(23);
	
	anyone.selectByValue("INDIA");
	
	anyone.selectByVisibleText("INDIA");
	
	List<WebElement> options = anyone.getOptions();
	for(int i=0;i<=options.size();i++) {
		WebElement webElement = options.get(i);
		String text = webElement.getText();
		System.out.println(text);
		
		
	}
	
	}

}
