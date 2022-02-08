package SELINIUMexamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multipledropdown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\eclipse-workspace\\mouseoperants\\browserdriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://output.jsbin.com/osebed/2");
		driver.manage().window().maximize();
		
		WebElement dropdown = driver.findElement(By.tagName("select"));
		
		
		Select anyone=new Select(dropdown);
		anyone.selectByIndex(3);
		anyone.selectByIndex(2);
		anyone.selectByIndex(1);
		
		List<WebElement> allSelectedOptions = anyone.getAllSelectedOptions();
		
		for(int i=0;i<allSelectedOptions.size();i++) {
			WebElement webElement = allSelectedOptions.get(i);
			String text = webElement.getText();
			System.out.println(text);
			
		}
			
			WebElement firstSelectedOption = anyone.getFirstSelectedOption();
			String text2 = firstSelectedOption.getText();
			System.out.println(text2);

	}

}
