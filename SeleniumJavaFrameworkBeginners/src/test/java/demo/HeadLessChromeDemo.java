package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessChromeDemo {

	public static void main(String[] args) {
		
		test();
	}
	
	public static void test() {

		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chromr.driver", projectPath+"\\Drivers\\Chrome\\chromedriver.exe");
	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		
		options.addArguments("window-size=1280,800");
		
		WebDriver driver = new ChromeDriver(options);
	
		driver.get("https://www.google.com");
		
		System.out.println(driver.getTitle());

		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);

		driver.close();
		driver.quit();
		System.out.println("Complted");

	}
}
