package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormPageObjects {
	WebDriver driver = null;
	
	
	By input_email   = By.xpath("//input[@placeholder='Entrez votre adresse e-mail']");
	By input_message = By.xpath("//textarea[@placeholder='Veuillez rédiger votre message ici...']");
	
	public FormPageObjects (WebDriver driver) {
		this.driver = driver;
	}
	
	public void setTextInEmailInput(String text) {
		driver.findElement(input_email).sendKeys(text); 
	}
	
	public void setTextInMessageInput(String text) {
		driver.findElement(input_message).sendKeys(text); 
	}
	
}
