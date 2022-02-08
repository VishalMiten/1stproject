package SELINIUMexamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class table1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\mouseoperants\\browserdriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		driver.manage().window().maximize();
		
	    List<WebElement> findElements = driver.findElements(By.tagName("table"));
		for (int i = 0; i <findElements.size(); i++) {
			WebElement webElement = findElements.get(i);
			WebElement findElement = webElement.findElement(By.tagName("tbody"));
		List	<WebElement> findElement2 = findElement.findElements(By.tagName("tr"));
			for (int j = 0; j < findElement2.size(); j++) {
				WebElement webElement2 = findElement2.get(j);
			List	<WebElement> findElement3 = webElement2.findElements(By.tagName("td"));
				for (int k = 0; k < findElement3.size(); k++) {
					WebElement webElement3 = findElement3.get(k);
					String text = webElement3.getText();
					//System.out.println(text);
					String string = "Amazon";
					if (text.contains(string)) {
						System.out.println(string);
						
					}
					
					
				}
			}
			
		}
		
	}

}
