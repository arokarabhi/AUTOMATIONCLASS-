package day1seleniumbasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicFunctions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","G:\\Abhishek\\f drive\\eclipse-workspace\\Java\\SeleniumProject\\executeables\\chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.google.com");
		//display title
		driver.getTitle();
		System.out.println("page title: "+driver.getTitle());
		//page URL
		driver.getCurrentUrl();
		System.out.println("current URL: "+driver.getCurrentUrl());
		//page source
		driver.getPageSource();
		System.out.println("page source code: "+driver.getPageSource());
		driver.close();//automatically closes the browser after opening URL
	}

}
