package day1seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookHomepage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","G:\\Abhishek\\f drive\\eclipse-workspace\\Java\\SeleniumProject\\executeables\\chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		
		driver.getTitle();
		System.out.println("title: "+driver.getTitle());
		
		driver.getCurrentUrl();
		System.out.println("URL: "+driver.getCurrentUrl());
		
		WebElement usernameInputfield= driver.findElement(By.id("email"));
		usernameInputfield.sendKeys("arokarabhi@gmail.com");
		
		WebElement passwordInputfield= driver.findElement(By.name("pass"));
		passwordInputfield.sendKeys("Abhiarokar@17011994");
		
		WebElement loginButton = driver.findElement(By.id("loginbutton"));
		loginButton.click();
		
		driver.close();
	}

}
