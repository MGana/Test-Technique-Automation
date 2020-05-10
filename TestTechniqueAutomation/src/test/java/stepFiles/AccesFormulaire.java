package stepFiles;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.FormPageObjects;
import pages.HomePageObjects;
public class AccesFormulaire {

	WebDriver driver;

	
	@When("^Je souhaite contacter le service client$")
	public void je_souhaite_contacter_le_service_client() throws Throwable {
		HomePageObjects homePageObj = new HomePageObjects(driver);
		homePageObj.clickAideLink();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h3[contains(text(),'Résolution de problèmes')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Vous souhaitez nous contacter ?')]")).click();
	}

	@Then("^Je suis capable de pouvoir trouver un formulaire sur le site internet$")
	public void je_suis_capable_de_pouvoir_trouver_un_formulaire_sur_le_site_internet() throws Throwable {
		
		WebElement form = driver.findElement(By.xpath("//form[@class='faq__contact__form']"));
		Assert.assertEquals(true, form.isDisplayed());
	}

	@Then("^Je suis capable de remplir ce formulaire avec des informations$")
	public void je_suis_capable_de_remplir_ce_formulaire_avec_des_informations() throws Throwable {
		
		FormPageObjects formPageObj = new FormPageObjects(driver);
		formPageObj.setTextInEmailInput("test@test.com");
		formPageObj.setTextInMessageInput("Mon message");

	}



}
