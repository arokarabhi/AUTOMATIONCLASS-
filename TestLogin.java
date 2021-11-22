package day1seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","G:\\Abhishek\\f drive\\eclipse-workspace\\Java\\SeleniumProject\\executeables\\chromedriver.exe");
		WebDriver chrome=new ChromeDriver();
		
		chrome.get("https://opensource-demo.orangehrmlive.com/login.do");
		
		//Title
		chrome.getTitle();
		System.out.println("Page title: "+chrome.getTitle());
		
		//URL
		chrome.getCurrentUrl();
		System.out.println("Page URL: "+chrome.getCurrentUrl());
		
		//username: identify username field and enter username
		WebElement usernameInputfield=chrome.findElement(By.id("txtUsername"));
		usernameInputfield.sendKeys("Admin");
		
		//password: identify password field and enter password
		WebElement passwordInputfield= chrome.findElement(By.name("txtPassword"));
		passwordInputfield.sendKeys("admin123");
		
		//login button: identify login button and click
		WebElement loginButton = chrome.findElement(By.id("btnLogin"));
		loginButton.click();
		

	}

}
