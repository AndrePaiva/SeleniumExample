package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class FirstTrialTest {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		//System.setProperty("webdriver.chrome.driver", "D:\\Programming\\WebDriver\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//System.setProperty("webdriver.edge.driver", "D:\\Programming\\WebDriver\\MicrosoftWebDriver.exe");
		//WebDriver driver = new EdgeDriver();
		driver.get("http://www.fa7.edu.br");
		WebElement link;
		link = driver.findElement(By.id("ulaitem0z0"));
		link.click();
		
		link = driver.findElement(By.cssSelector("#principal > div:nth-child(27) > div > h2 > a:nth-child(2)"));
		link.click();
		
		link = driver.findElement(By.cssSelector("#principal > table > tbody > tr:nth-child(1) > td:nth-child(1) > a > img"));
		Assert.assertTrue(link.isDisplayed());
		
		driver.quit();
		

		
	}

}
