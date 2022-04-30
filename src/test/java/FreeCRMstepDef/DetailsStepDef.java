package FreeCRMstepDef;

import java.util.concurrent.TimeUnit;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DetailsStepDef 

{

	WebDriver driver;


	@Given("user is already on login page")
	public void user_is_already_on_login_page()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().to("https://example.testproject.io/web/");
	}

	@When("title of login page is Test Project")
	public void title_of_login_page_is_test_project() {
		String title=driver.getTitle();
		System.out.println("The title of the page is:" +title);

	}

	@And("^user enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_username_and_password(String username, String password) throws InterruptedException{
		System.out.println("user enters username and password");
		driver.findElement(By.id("name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		Thread.sleep(2000);
	}

	@Then("user clicks on login button")
	public void user_clicks_on_login_button() {
		driver.findElement(By.id("login")).click();
	}

	@And("user enters into home page")
	public void user_enters_into_home_page() throws InterruptedException {
		System.out.println("The title of the browser is:" +driver.getTitle());
		Thread.sleep(2000);
	}
	@And("^selects \"(.*)\" from the text box$")
	public void selects_country_from_the_text_box(String country) throws InterruptedException

	{
		WebElement countrySelect= driver.findElement(By.id("country"));
		Select select=new Select(countrySelect);
		java.util.List<WebElement> countryOptions= select.getOptions();
		for(WebElement Option: countryOptions)
		{
			System.out.println(Option.getText());
		}
		select.selectByVisibleText("India");

		Thread.sleep(2000);
	}



	@And("^enters users \"(.*)\", \"(.*)\" and \"(.*)\"$")
	public void enters_users_and(String address, String email, String phone) {
		driver.findElement(By.id("address")).sendKeys(address);
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("phone")).sendKeys(phone);

	}


	@Then("save the details and  clicks on logout button")
	public void save_the_details_and_clicks_on_logout_button() {
		driver.findElement(By.id("save")).click();
		driver.findElement(By.id("logout")).click();
	}

	@Then("user quits browser")
	public void user_quits_browser() {
		driver.quit();
	}

}
