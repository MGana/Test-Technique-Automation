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

public class AccesApropos {

	WebDriver driver;
	
	@Before
	public void setup() {

		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver_win32\\chromedriver.exe");
		this.driver = new ChromeDriver();
		
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		this.driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);

	}
	
	@After
	public void tearDown()  {
		this.driver.close();
		this.driver.quit();
		this.driver = null;
	}
	
	@Given("^Visiteur du site internet$")
	public void visiteur_du_site_internet() throws Throwable {
		driver.get("https://www.happn.com/fr/");
	}

	@When("^J accede a la page a propos$")
	public void j_acc_de_la_page_propos() throws Throwable {
		driver.findElement(By.xpath("//a[@class='header__nav__link'][contains(text(),'À propos')]")).click();
	}

	@Then("^Je suis capable de voir les trois chiffres clefs de happn$")
	public void je_suis_capable_de_voir_les_trois_chiffres_clefs_de_happn() throws Throwable {
		List<WebElement> numbers = driver.findElements(By.xpath("//ul[@class='numbers']//li"));
		int count = numbers.size();
		Assert.assertEquals(3, count);
	}


}
