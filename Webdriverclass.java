package day1seleniumbasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Webdriverclass {

	public static void main(String[] args) {
		//realtime example of runtime polymorphism, generic way to create an object for drivers
		System.setProperty("webdriver.chrome.driver","G:\\Abhishek\\f drive\\eclipse-workspace\\Java\\SeleniumProject\\executeables\\chromedriver.exe" );
		WebDriver chrome= new ChromeDriver();
		
		System.setProperty("webdriver.ie.driver","G:\\Abhishek\\f drive\\eclipse-workspace\\Java\\SeleniumProject\\executeables\\IEDriverServer.exe") ;
		WebDriver iedriver= new InternetExplorerDriver();
		
		
		System.setProperty("webdriver.gecko.driver","G:\\Abhishek\\f drive\\eclipse-workspace\\Java\\SeleniumProject\\executeables\\geckodriver.exe") ;
		WebDriver fdriver= new FirefoxDriver();
	}

}
