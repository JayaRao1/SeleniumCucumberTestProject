package FreeCRMstepDef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class stepDefTestProject2

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

	@Then("user quits browser")
	public void user_quits_browser() {
		
	
		driver.quit();
	}

}
