package SELINIUMexamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class table {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\eclipse-workspace\\mouseoperants\\browserdriver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		driver.manage().window().maximize();
		
		List<WebElement> table =driver.findElements(By.tagName("table"));
		for(int i=0;i<table.size();i++) {
			WebElement no = table.get(1);
			WebElement tb = no.findElement(By.tagName("thead"));
			List<WebElement> tr = tb.findElements(By.tagName("tr"));
			for (int j = 0; j < tr.size(); j++) {
				WebElement webElement2 = tr.get(j);
				List<WebElement> findElements = webElement2.findElements(By.tagName("td"));
				for (int k = 0; k < findElements.size(); k++) {
					WebElement webElement3 = findElements.get(k);
					String text = webElement3.getText();
					System.out.println(text);
					if (text.contains((CharSequence) tb)) {
						System.out.println(webElement3.getText());
						
					}
					
				}
				
				
				
			}
			
		}
		
	}

}
