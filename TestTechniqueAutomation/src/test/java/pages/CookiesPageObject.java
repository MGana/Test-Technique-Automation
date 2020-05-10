package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CookiesPageObject {
	static WebDriver driver = null;
	static By header1 = By.xpath("//h1[@class='page__header__title subpage__header']");
	static By headers2 = By.xpath("//h2");
	static By headers3 = By.xpath("//h3");
	
	private static WebElement element = null;
	private static List<WebElement>  elements = null;
	
	public CookiesPageObject (WebDriver driver) {
		this.driver = driver;
	}
	
	public static WebElement getHearder1() {
		element = driver.findElement(header1);
		return element;
	}
	
	public static List<WebElement>  getHearder2() {
		elements = driver.findElements(headers2);
		return elements;
	}
	
	public static List<WebElement>  getHearder3() {
		elements = driver.findElements(headers3);
		return elements;
	}
}
