package day1seleniumbasic;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class OpenBrowser {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		//step-1: set the path for webdriver
		System.setProperty("webdriver.chrome.driver","G:\\Abhishek\\f drive\\eclipse-workspace\\Java\\SeleniumProject\\executeables\\chromedriver.exe" );
		//System.setProperty("webdriver.chrome.drive",".\\executeables\\chromedriver.exe" );
		//step-2: create an instance for webdriver
		@SuppressWarnings("unused")
		ChromeDriver chrome= new ChromeDriver();
		
		System.setProperty("webdriver.ie.driver","G:\\Abhishek\\f drive\\eclipse-workspace\\Java\\SeleniumProject\\executeables\\IEDriverServer.exe") ;
		InternetExplorerDriver iedriver= new InternetExplorerDriver();
		
		
		System.setProperty("webdriver.gecko.driver","G:\\Abhishek\\f drive\\eclipse-workspace\\Java\\SeleniumProject\\executeables\\geckodriver.exe") ;
		FirefoxDriver fdriver= new FirefoxDriver();
	}
	
	}

