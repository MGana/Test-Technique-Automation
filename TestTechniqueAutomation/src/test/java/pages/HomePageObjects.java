package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageObjects {

	WebDriver driver = null;
	
	By link_apopos = By.xpath("//a[@class='header__nav__link'][contains(text(),'À propos')]");
	By link_aide   = By.xpath("//a[@class='header__nav__link'][contains(text(),'Aide')]");
	
	public HomePageObjects (WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickAproposLink() {
		driver.findElement(link_apopos).click(); 
	}
	
	public void clickAideLink() {
		driver.findElement(link_aide).click(); 
	}
}
