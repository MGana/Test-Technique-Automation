package stepFiles;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class AccesCookies {

	WebDriver driver;
		
	
	@When("^Je souhaite acceder a la page Charte d utilisation des cookies$")
	public void je_souhaite_acceder_a_la_page_Charte_d_utilisation_des_cookies() throws Throwable {
		driver.get("https://www.happn.com/fr/cookies/");
		//driver.findElement(By.xpath("//a[@class='cookie-bar__link']")).click();
	}


	@Then("^J arrive sur la page$")
	public void j_arrive_sur_la_page() throws Throwable {
		Thread.sleep(2000);
		WebElement cookies = driver.findElement(By.xpath("//h1[@class='page__header__title subpage__header']"));
		Assert.assertEquals(true, cookies.isDisplayed());
	}

	@Then("^Je suis capable de voir les differents headers de la charte$")
	public void je_suis_capable_de_voir_les_differents_headers_de_la_charte() throws Throwable {
		List<WebElement> headers2 = driver.findElements(By.xpath("//h2"));
		Assert.assertEquals(10, headers2.size());
		
		List<WebElement> headers3 = driver.findElements(By.xpath("//h3"));
		Assert.assertEquals(4, headers3.size());
	}




}
